# Lockally for Android (Kotlin)

Official Kotlin SDK for the [Lockally](https://lockally.com) API — transactional
email, contacts, and agent inboxes. A generated, coroutine-based OkHttp client
plus a secure auth + ergonomics layer (`com.lockally.sdk.auth`): `TokenProvider`,
OAuth 2.1 PKCE, automatic retries, idempotency keys, and `Flow` pagination.

It's a pure-JVM library, so it works on Android **and** any Kotlin/JVM backend.

## Install (Maven Central)

```kotlin
dependencies {
    implementation("com.lockally:lockally-android:0.1.0")
}
```

---

## 🔐 Security: never ship a live API key

An APK is distributed — anything compiled in, including an `lk_live_…` key, can
be extracted. A leaked send-scoped key is an open spam relay billed to you.

- **Sending mail (OTP, verification) + contact sync** → `BackendTokenProvider`.
  Keep the `lk_live_` key on **your** server; the app gets short-lived scoped tokens.
- **A signed-in user reading their own mail** → `OAuthPkceProvider`.
- **`StaticTokenProvider`** is for server-side/internal use (warns on `lk_live_`).

---

## Quick start

```kotlin
import com.lockally.sdk.api.SendApi
import com.lockally.sdk.auth.*

val provider = BackendTokenProvider {
    // Call your backend (any HTTP client); it returns a short-lived token.
    BackendTokenProvider.parseGrant(yourBackend.fetchLockallyToken())
}
val send = SendApi(client = Lockally.okHttpClient(provider))
```

`Lockally.okHttpClient(provider)` returns an `OkHttpClient` with retries,
idempotency, and auth wired in — pass it to any generated `*Api`.

## Cookbook

### OTP email / user verification
Trigger from the app with a backend-minted `messages:send` token. A stable
`Idempotency-Key` is attached automatically, so a retry never double-sends:

```kotlin
send.v1SendPost(V1SendPostRequest(
    from = "no-reply@yourapp.com",
    to = listOf(email),
    templateId = "otp-code",
    variables = mapOf("code" to otp, "ttl" to "10"),
))
```

### Contact syncing
```kotlin
import com.lockally.sdk.api.ContactsApi
import com.lockally.sdk.auth.paginate

val contacts = ContactsApi(client = Lockally.okHttpClient(provider))
paginate { cursor ->
    val r = contacts.v1ContactsGet(cursor = cursor)
    Page(r.data ?: emptyList(), r.nextCursor)
}.collect { syncLocally(it) }
```

### Push + email workflows
Register the device's FCM token with your backend; it decides per event whether
to push, email (via Lockally), or both. The SDK drives the email leg.

### Inbox / agent (OAuth PKCE — user tokens)
The one interactive user-token flow the API issues today (`inboxes:read/write`).
Run the browser step with Chrome Custom Tabs / AppAuth, then:

```kotlin
val oauth = OAuthPkceProvider(
    OAuthConfig(clientId = "your-client-id", redirectUri = "yourapp://oauth"),
    store = prefsTokenStore, // EncryptedSharedPreferences (see TokenStore docs)
)
val pkce = Pkce.generate()
// open oauth.authorizationUrl(pkce.challenge, state) in a Custom Tab, capture code:
oauth.exchange(code, pkce.verifier)
val inbox = InboxesApi(client = Lockally.okHttpClient(oauth))
```

Store refresh tokens with `EncryptedSharedPreferences` — see the `TokenStore`
KDoc for a ~5-line implementation.

## Errors

Non-2xx responses map to `LockallyException` (`status` / `code` / `message` /
`requestId`) parsed from the API's `problem+json`.

## License

MIT — see [LICENSE](./LICENSE).
