package com.lockally.sdk.auth

import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Base64

/**
 * RFC 7636 Proof Key for Code Exchange (S256).
 *
 * Mobile apps are public OAuth clients (no secret), so PKCE is mandatory. The
 * verifier stays on-device; the challenge is sent to `/oauth/authorize`.
 */
data class PkcePair(val verifier: String, val challenge: String) {
    val method: String get() = "S256"
}

object Pkce {
    private val random = SecureRandom()
    private val encoder = Base64.getUrlEncoder().withoutPadding()

    /** Generate a fresh, verifiable verifier + S256 challenge. */
    fun generate(): PkcePair {
        val bytes = ByteArray(32).also { random.nextBytes(it) }
        val verifier = encoder.encodeToString(bytes)
        return PkcePair(verifier, challengeFor(verifier))
    }

    /** `BASE64URL(SHA256(ASCII(verifier)))`, no padding. */
    fun challengeFor(verifier: String): String {
        val digest = MessageDigest.getInstance("SHA-256").digest(verifier.toByteArray(Charsets.US_ASCII))
        return encoder.encodeToString(digest)
    }
}
