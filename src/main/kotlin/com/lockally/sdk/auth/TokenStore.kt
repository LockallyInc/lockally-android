package com.lockally.sdk.auth

import java.util.concurrent.ConcurrentHashMap

/**
 * Where OAuth refresh tokens are persisted between launches.
 *
 * This SDK is a pure-JVM library so it stays usable on any JVM. On Android,
 * implement this with `EncryptedSharedPreferences` (androidx.security-crypto):
 *
 * ```kotlin
 * class PrefsTokenStore(private val prefs: SharedPreferences) : TokenStore {
 *   override fun read(key: String) = prefs.getString(key, null)
 *   override fun write(key: String, value: String) { prefs.edit().putString(key, value).apply() }
 *   override fun delete(key: String) { prefs.edit().remove(key).apply() }
 * }
 * ```
 */
interface TokenStore {
    fun read(key: String): String?
    fun write(key: String, value: String)
    fun delete(key: String)
}

/** Non-persistent store — default for tests and for `BackendTokenProvider`. */
class InMemoryTokenStore : TokenStore {
    private val map = ConcurrentHashMap<String, String>()
    override fun read(key: String): String? = map[key]
    override fun write(key: String, value: String) { map[key] = value }
    override fun delete(key: String) { map.remove(key) }
}
