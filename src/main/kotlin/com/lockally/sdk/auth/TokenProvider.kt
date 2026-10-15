package com.lockally.sdk.auth

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Supplies the bearer credential for each request. `suspend` so it can refresh
 * an expiring token or fetch a short-lived one from your backend.
 *
 * - Sending mail / OTP / verification / contacts → [BackendTokenProvider].
 * - A signed-in user reading their own mail → [OAuthPkceProvider].
 * - Server-side / internal only → [StaticTokenProvider].
 */
interface TokenProvider {
    suspend fun token(): String
}

private val liveKeyWarned = AtomicBoolean(false)

/**
 * A fixed key. **Do not embed a `lk_live_*` key in a distributed app** — it is
 * extractable from the APK. Fine for server-side/internal use and `lk_test_*`.
 */
class StaticTokenProvider(private val value: String) : TokenProvider {
    init {
        if (value.startsWith("lk_live_") && liveKeyWarned.compareAndSet(false, true)) {
            System.err.println(
                "[Lockally] A live API key was passed to StaticTokenProvider. If this runs " +
                    "inside a distributed app the key is extractable and can be abused. Use " +
                    "BackendTokenProvider or OAuthPkceProvider instead."
            )
        }
    }
    override suspend fun token(): String = value
}

data class Grant(val token: String, val expiresAtEpochMs: Long)

/**
 * The recommended provider for send/OTP/verification/contacts. Calls **your**
 * backend for a short-lived, narrowly-scoped token; caches it until near expiry.
 * The `lk_live_` key stays on your server.
 */
class BackendTokenProvider(
    private val skewMs: Long = 30_000,
    private val fetchGrant: suspend () -> Grant,
) : TokenProvider {
    private val mutex = Mutex()
    @Volatile private var cached: Grant? = null

    override suspend fun token(): String {
        cached?.let { if (it.expiresAtEpochMs - System.currentTimeMillis() > skewMs) return it.token }
        return mutex.withLock {
            cached?.let { if (it.expiresAtEpochMs - System.currentTimeMillis() > skewMs) return it.token }
            val g = fetchGrant()
            cached = g
            g.token
        }
    }

    companion object {
        private val json = Json { ignoreUnknownKeys = true }

        fun parseGrant(body: String): Grant {
            val obj = json.parseToJsonElement(body).jsonObject
            val token = obj["token"]?.jsonPrimitive?.content
                ?: throw IllegalArgumentException("Backend token response missing 'token'")
            obj["expires_at"]?.jsonPrimitive?.content?.let { iso ->
                runCatching { java.time.Instant.parse(iso).toEpochMilli() }
                    .getOrNull()?.let { return Grant(token, it) }
            }
            obj["expires_in"]?.jsonPrimitive?.content?.toLongOrNull()?.let {
                return Grant(token, System.currentTimeMillis() + it * 1000)
            }
            return Grant(token, System.currentTimeMillis() + 60_000)
        }
    }
}
