package com.lockally.sdk.auth

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.FormBody
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

data class OAuthConfig(
    val clientId: String,
    val redirectUri: String,
    val scopes: List<String> = listOf("inboxes:read", "inboxes:write"),
    val authorizationEndpoint: String = "https://api.lockally.com/oauth/authorize",
    val tokenEndpoint: String = "https://api.lockally.com/oauth/token",
)

/**
 * OAuth 2.1 authorization-code + PKCE for a signed-in *user*.
 *
 * The browser step is app-specific (Chrome Custom Tabs / AppAuth), so run it in
 * your Activity and pass the returned `code` to [exchange]. Token exchange,
 * refresh, and secure persistence live here.
 *
 * The server issues user tokens only for the inbox/agent surface today
 * (`inboxes:read` / `inboxes:write`). For send/contacts use [BackendTokenProvider].
 */
class OAuthPkceProvider(
    private val config: OAuthConfig,
    private val store: TokenStore = InMemoryTokenStore(),
    private val http: OkHttpClient = OkHttpClient(),
) : TokenProvider {
    @Volatile private var access: String? = null
    @Volatile private var accessExpiry: Long = 0
    private val refreshKey = "lockally.oauth.refresh.${config.clientId}"
    private val json = Json { ignoreUnknownKeys = true }

    /** Build the `/oauth/authorize` URL for a PKCE challenge. */
    fun authorizationUrl(challenge: String, state: String): String =
        config.authorizationEndpoint.toHttpUrl().newBuilder()
            .addQueryParameter("response_type", "code")
            .addQueryParameter("client_id", config.clientId)
            .addQueryParameter("redirect_uri", config.redirectUri)
            .addQueryParameter("scope", config.scopes.joinToString(" "))
            .addQueryParameter("state", state)
            .addQueryParameter("code_challenge", challenge)
            .addQueryParameter("code_challenge_method", "S256")
            .build().toString()

    /** Exchange an authorization code + verifier for tokens. */
    suspend fun exchange(code: String, verifier: String) {
        postToken(
            mapOf(
                "grant_type" to "authorization_code",
                "code" to code,
                "redirect_uri" to config.redirectUri,
                "client_id" to config.clientId,
                "code_verifier" to verifier,
            )
        )
    }

    override suspend fun token(): String {
        access?.let { if (accessExpiry - System.currentTimeMillis() > 30_000) return it }
        val refresh = store.read(refreshKey)
            ?: throw IllegalStateException("Not signed in — run the PKCE flow and call exchange() first.")
        return postToken(
            mapOf(
                "grant_type" to "refresh_token",
                "refresh_token" to refresh,
                "client_id" to config.clientId,
            )
        )
    }

    fun signOut() {
        access = null
        accessExpiry = 0
        store.delete(refreshKey)
    }

    private suspend fun postToken(fields: Map<String, String>): String = withContext(Dispatchers.IO) {
        val form = FormBody.Builder().apply { fields.forEach { (k, v) -> add(k, v) } }.build()
        val req = Request.Builder().url(config.tokenEndpoint).post(form).build()
        http.newCall(req).execute().use { resp ->
            val body = resp.body?.string()
            if (!resp.isSuccessful) throw LockallyException.fromResponse(resp.code, body)
            val obj = json.parseToJsonElement(body ?: "{}").jsonObject
            val at = obj["access_token"]?.jsonPrimitive?.content
                ?: throw IllegalStateException("Token response missing 'access_token'")
            val ttl = obj["expires_in"]?.jsonPrimitive?.content?.toLongOrNull() ?: 3600
            access = at
            accessExpiry = System.currentTimeMillis() + ttl * 1000
            obj["refresh_token"]?.jsonPrimitive?.content?.let { store.write(refreshKey, it) }
            at
        }
    }
}
