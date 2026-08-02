package com.lockally.sdk.auth

import kotlinx.coroutines.runBlocking
import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import java.io.IOException
import java.util.UUID

/**
 * Adds `Authorization: Bearer <token>` from the [TokenProvider]. Runs inside the
 * retry loop (added after [RetryInterceptor]) so each attempt gets a fresh token.
 * `runBlocking` is safe here — OkHttp dispatches on its own worker threads.
 */
class AuthInterceptor(private val provider: TokenProvider) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = runBlocking { provider.token() }
        val req = chain.request().newBuilder().header("Authorization", "Bearer $token").build()
        return chain.proceed(req)
    }
}

/**
 * Retries network errors, `429`, and `5xx` with backoff + jitter (honoring
 * `Retry-After`), and injects a stable `Idempotency-Key` on mutating requests so
 * a retried write is never applied twice.
 */
class RetryInterceptor(private val policy: RetryPolicy = RetryPolicy()) : Interceptor {
    private val mutating = setOf("POST", "PUT", "PATCH", "DELETE")

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        if (request.method in mutating && request.header("Idempotency-Key") == null) {
            request = request.newBuilder().header("Idempotency-Key", UUID.randomUUID().toString()).build()
        }

        var attempt = 1
        while (true) {
            try {
                val response = chain.proceed(request)
                if (policy.shouldRetry(attempt, response.code, isNetworkError = false)) {
                    val retryAfter = RetryPolicy.parseRetryAfterMs(response.header("Retry-After"))
                    response.close()
                    Thread.sleep(policy.delayMs(attempt, retryAfter))
                    attempt++
                    continue
                }
                return response
            } catch (e: IOException) {
                if (!policy.shouldRetry(attempt, null, isNetworkError = true)) throw e
                Thread.sleep(policy.delayMs(attempt))
                attempt++
            }
        }
    }
}

/**
 * Build an [OkHttpClient] wired with retries, idempotency, and auth. Pass it to
 * any generated API, e.g. `SendApi(basePath, Lockally.okHttpClient(provider))`.
 */
object Lockally {
    fun okHttpClient(
        provider: TokenProvider,
        policy: RetryPolicy = RetryPolicy(),
        base: OkHttpClient = OkHttpClient(),
    ): OkHttpClient = base.newBuilder()
        .addInterceptor(RetryInterceptor(policy)) // outer: owns the retry loop
        .addInterceptor(AuthInterceptor(provider)) // inner: fresh token per attempt
        .build()

    /** Convenience for callers that only need a [Call.Factory]. */
    fun callFactory(provider: TokenProvider, policy: RetryPolicy = RetryPolicy()): Call.Factory =
        okHttpClient(provider, policy)
}
