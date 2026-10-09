package com.lockally.sdk.auth

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * Typed error mapped from a non-2xx API response. The API returns RFC 7807
 * `application/problem+json`; the fields let callers branch on `status`/`code`
 * and log `requestId` for support.
 */
class LockallyException(
    val status: Int,
    val code: String? = null,
    override val message: String,
    val requestId: String? = null,
) : Exception(message) {

    val isRetryable: Boolean get() = status == 429 || status in 500..599

    companion object {
        private val json = Json { ignoreUnknownKeys = true }

        fun fromResponse(status: Int, body: String?, requestId: String? = null): LockallyException {
            if (body.isNullOrBlank()) {
                return LockallyException(status, null, "HTTP $status", requestId)
            }
            return try {
                val obj = json.parseToJsonElement(body).jsonObject
                fun str(k: String) = obj[k]?.jsonPrimitive?.contentOrNull
                val message = str("detail") ?: str("title") ?: "HTTP $status"
                val code = str("code") ?: str("type")
                LockallyException(status, code, message, requestId ?: str("request_id"))
            } catch (_: Exception) {
                LockallyException(status, null, "HTTP $status", requestId)
            }
        }

        private val kotlinx.serialization.json.JsonPrimitive.contentOrNull: String?
            get() = if (isString) content else content.ifBlank { null }
    }
}
