package com.lockally.sdk.auth

import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import okhttp3.HttpUrl.Companion.toHttpUrl

class PkceTest : StringSpec({
    "challenge matches RFC 7636 Appendix B vector" {
        Pkce.challengeFor("dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk") shouldBe
            "E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM"
    }
    "generate produces a verifiable pair" {
        val p = Pkce.generate()
        (p.verifier.length in 43..128) shouldBe true
        p.method shouldBe "S256"
        p.challenge shouldBe Pkce.challengeFor(p.verifier)
    }
})

class RetryPolicyTest : StringSpec({
    val policy = RetryPolicy(maxRetries = 3, baseDelayMs = 200, maxDelayMs = 20_000)

    "retries on 429/5xx/network" {
        policy.shouldRetry(1, 429, false) shouldBe true
        policy.shouldRetry(1, 503, false) shouldBe true
        policy.shouldRetry(1, null, true) shouldBe true
    }
    "no retry on 4xx/2xx" {
        policy.shouldRetry(1, 400, false) shouldBe false
        policy.shouldRetry(1, 200, false) shouldBe false
    }
    "stops after maxRetries" {
        policy.shouldRetry(3, 500, false) shouldBe true
        policy.shouldRetry(4, 500, false) shouldBe false
    }
    "backoff ceiling grows and caps" {
        policy.backoffCeilingMs(1) shouldBe 200L
        policy.backoffCeilingMs(2) shouldBe 400L
        policy.backoffCeilingMs(20) shouldBe 20_000L
    }
    "full jitter bounds" {
        policy.delayMs(2, null, 0.0) shouldBe 0L
        policy.delayMs(2, null, 1.0) shouldBe 400L
    }
    "retry-after wins when larger and is capped" {
        policy.delayMs(1, 5_000, 0.0) shouldBe 5_000L
        policy.delayMs(1, 999_000, 0.0) shouldBe 20_000L
    }
    "parse retry-after" {
        RetryPolicy.parseRetryAfterMs("3") shouldBe 3_000L
        RetryPolicy.parseRetryAfterMs(null) shouldBe null
        RetryPolicy.parseRetryAfterMs("Wed, 21 Oct 2099 07:28:00 GMT") shouldBe null
    }
})

class ErrorTest : StringSpec({
    "parses problem+json" {
        val body = """{"title":"Forbidden","detail":"missing scope: messages:send","code":"insufficient_scope","request_id":"req_123"}"""
        val e = LockallyException.fromResponse(403, body)
        e.status shouldBe 403
        e.code shouldBe "insufficient_scope"
        e.message shouldBe "missing scope: messages:send"
        e.requestId shouldBe "req_123"
    }
    "falls back without body" {
        val e = LockallyException.fromResponse(500, null, "req_x")
        e.message shouldBe "HTTP 500"
        e.requestId shouldBe "req_x"
    }
})

class TokenTest : StringSpec({
    "static returns value" {
        runBlocking { StaticTokenProvider("lk_test_abc").token() } shouldBe "lk_test_abc"
    }
    "parseGrant handles expires_at and expires_in" {
        BackendTokenProvider.parseGrant("""{"token":"t1","expires_at":"2099-01-01T00:00:00Z"}""").token shouldBe "t1"
        val b = BackendTokenProvider.parseGrant("""{"token":"t2","expires_in":300}""")
        (b.expiresAtEpochMs > System.currentTimeMillis()) shouldBe true
    }
    "backend caches until expiry" {
        var calls = 0
        val p = BackendTokenProvider { calls++; Grant("tok_$calls", System.currentTimeMillis() + 3_600_000) }
        runBlocking {
            val a = p.token(); val b = p.token()
            a shouldBe b
        }
        calls shouldBe 1
    }
})

class OAuthTest : StringSpec({
    "authorization url includes pkce params" {
        val p = OAuthPkceProvider(OAuthConfig(clientId = "app_1", redirectUri = "myapp://cb", scopes = listOf("inboxes:read")))
        val url = p.authorizationUrl("CHALLENGE", "st").toHttpUrl()
        url.queryParameter("response_type") shouldBe "code"
        url.queryParameter("client_id") shouldBe "app_1"
        url.queryParameter("code_challenge") shouldBe "CHALLENGE"
        url.queryParameter("code_challenge_method") shouldBe "S256"
        url.queryParameter("scope") shouldBe "inboxes:read"
    }
    "token without session throws" {
        val p = OAuthPkceProvider(OAuthConfig(clientId = "a", redirectUri = "x://cb"))
        shouldThrow<IllegalStateException> { runBlocking { p.token() } }
    }
})

class StoreAndPaginateTest : StringSpec({
    "in-memory store round trip" {
        val s = InMemoryTokenStore()
        s.read("k") shouldBe null
        s.write("k", "v"); s.read("k") shouldBe "v"
        s.delete("k"); s.read("k") shouldBe null
    }
    "paginate walks all pages" {
        val pages = listOf(
            Page(listOf(1, 2), "c1"),
            Page(listOf(3, 4), "c2"),
            Page(listOf(5), null),
        )
        var i = 0
        val all = runBlocking { paginate<Int> { pages[i++] }.toList() }
        all shouldBe listOf(1, 2, 3, 4, 5)
    }
    "paginate stops on a repeating cursor" {
        // A constant cursor is caught by the seen-set — returns, does not spin.
        val out = runBlocking { paginate<Int> { Page(listOf(1), "same") }.take(1).toList() }
        out shouldBe listOf(1)
    }
    "paginate loop guard throws on unbounded unique cursors" {
        var n = 0
        shouldThrow<IllegalStateException> {
            runBlocking { paginate<Int>(maxPages = 3) { Page(listOf(0), "c${n++}") }.toList() }
        }
    }
})
