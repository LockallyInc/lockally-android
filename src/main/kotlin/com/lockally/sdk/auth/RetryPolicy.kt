package com.lockally.sdk.auth

import kotlin.math.min
import kotlin.math.pow
import kotlin.random.Random

/**
 * Pure retry/backoff decisions — no timing, no I/O — so it unit-tests cleanly.
 * Retries network errors, `429`, and `5xx` with exponential backoff + full
 * jitter, honoring `Retry-After`.
 */
class RetryPolicy(
    val maxRetries: Int = 3,
    val baseDelayMs: Long = 200,
    val maxDelayMs: Long = 20_000,
) {
    /** `attempt` is 1-based (1 = the first try that just failed). */
    fun shouldRetry(attempt: Int, statusCode: Int?, isNetworkError: Boolean): Boolean {
        if (attempt > maxRetries) return false
        if (isNetworkError) return true
        val code = statusCode ?: return false
        return code == 429 || code in 500..599
    }

    /** Deterministic exponential ceiling before jitter. */
    fun backoffCeilingMs(attempt: Int): Long {
        val exp = 2.0.pow((attempt - 1).coerceAtLeast(0))
        return min(maxDelayMs.toDouble(), baseDelayMs * exp).toLong()
    }

    /** Final wait. Honors `Retry-After` (seconds) when larger; else full jitter. */
    fun delayMs(attempt: Int, retryAfterMs: Long? = null, jitter: Double = Random.nextDouble()): Long {
        val ceiling = backoffCeilingMs(attempt)
        val jittered = (ceiling * jitter.coerceIn(0.0, 1.0)).toLong()
        if (retryAfterMs != null && retryAfterMs > jittered) return min(maxDelayMs, retryAfterMs)
        return jittered
    }

    companion object {
        /** Parse `Retry-After` delta-seconds → millis (HTTP-date ignored). */
        fun parseRetryAfterMs(value: String?): Long? {
            val secs = value?.trim()?.toLongOrNull() ?: return null
            return if (secs >= 0) secs * 1000 else null
        }
    }
}
