# SendApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelMessage**](SendApi.md#cancelMessage) | **DELETE** /v1/messages/{id} | Cancel a scheduled send |
| [**getMessage**](SendApi.md#getMessage) | **GET** /v1/messages/{id} | Get message status |
| [**getMessageStats**](SendApi.md#getMessageStats) | **GET** /v1/messages/stats | Aggregate delivery stats |
| [**listMessages**](SendApi.md#listMessages) | **GET** /v1/messages | List outbound messages |
| [**sendEmail**](SendApi.md#sendEmail) | **POST** /v1/send | Send an email |
| [**sendEmailBatch**](SendApi.md#sendEmailBatch) | **POST** /v1/send/batch | Send a batch of emails |


<a id="cancelMessage"></a>
# **cancelMessage**
> cancelMessage(id)

Cancel a scheduled send

Cancels a still-scheduled message (future queued_at). Already sending/sent → 409.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.cancelMessage(id)
} catch (e: ClientException) {
    println("4xx response calling SendApi#cancelMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#cancelMessage")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="getMessage"></a>
# **getMessage**
> MessageDetail getMessage(id)

Get message status

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MessageDetail = apiInstance.getMessage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#getMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#getMessage")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**MessageDetail**](MessageDetail.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getMessageStats"></a>
# **getMessageStats**
> MessageStats getMessageStats(from, to, domain, tag)

Aggregate delivery stats

Counts by delivery outcome (delivered/bounced/deferred/complaint) plus rates over a window, from the delivery-event store. Privacy-first: this reflects what receiving servers reported, NOT whether a human opened the mail, Lockally does no open/click tracking. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val from : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Window start (default 7 days ago).
val to : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Window end (default now).
val domain : kotlin.String = domain_example // kotlin.String | Filter by sender domain.
val tag : kotlin.String = tag_example // kotlin.String | Group the window by the sender's own tags: one tag, or a comma-separated set meaning ANY. Case-insensitive. This is the dimension that tells a transactional stream from a notification one.
try {
    val result : MessageStats = apiInstance.getMessageStats(from, to, domain, tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#getMessageStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#getMessageStats")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.time.Instant**| Window start (default 7 days ago). | [optional] |
| **to** | **kotlin.time.Instant**| Window end (default now). | [optional] |
| **domain** | **kotlin.String**| Filter by sender domain. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tag** | **kotlin.String**| Group the window by the sender&#39;s own tags: one tag, or a comma-separated set meaning ANY. Case-insensitive. This is the dimension that tells a transactional stream from a notification one. | [optional] |

### Return type

[**MessageStats**](MessageStats.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listMessages"></a>
# **listMessages**
> ListMessages200Response listMessages(status, sender, tag, q, since, cursor, limit, sort, order)

List outbound messages

Returns recent outbound messages for the calling tenant, sorted newest first. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val status : kotlin.String = status_example // kotlin.String | 
val sender : kotlin.String = sender_example // kotlin.String | Exact match against the `from` mailbox.
val tag : kotlin.String = tag_example // kotlin.String | Filter to messages carrying any of these tags. One tag, or a comma-separated set meaning ANY. Case-insensitive: the value is normalised the same way tags are on write.
val q : kotlin.String = q_example // kotlin.String | Free-text search across subject + sender.
val since : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Only messages queued at or after this RFC 3339 instant.
val cursor : kotlin.String = cursor_example // kotlin.String | queued_at of the prior page boundary. Pass back the `next_cursor` returned by the previous call.
val limit : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | Field to order by. Only indexed columns are offered: an unindexed sort on this table is a full scan of the account's send history. status and sender are filters instead.
val order : kotlin.String = order_example // kotlin.String | Defaults to desc for the default field and asc for any other. The order is always made total by a tie-break on id, so paging cannot repeat or skip a row that shares a timestamp. cursor encodes queued_at, so combining it with another sort is a 400 rather than a wrong page.
try {
    val result : ListMessages200Response = apiInstance.listMessages(status, sender, tag, q, since, cursor, limit, sort, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#listMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#listMessages")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] [enum: queued, sending, delivered, bounced, deferred, complaint] |
| **sender** | **kotlin.String**| Exact match against the &#x60;from&#x60; mailbox. | [optional] |
| **tag** | **kotlin.String**| Filter to messages carrying any of these tags. One tag, or a comma-separated set meaning ANY. Case-insensitive: the value is normalised the same way tags are on write. | [optional] |
| **q** | **kotlin.String**| Free-text search across subject + sender. | [optional] |
| **since** | **kotlin.time.Instant**| Only messages queued at or after this RFC 3339 instant. | [optional] |
| **cursor** | **kotlin.String**| queued_at of the prior page boundary. Pass back the &#x60;next_cursor&#x60; returned by the previous call. | [optional] |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |
| **sort** | **kotlin.String**| Field to order by. Only indexed columns are offered: an unindexed sort on this table is a full scan of the account&#39;s send history. status and sender are filters instead. | [optional] [default to Sort.queued_at] [enum: queued_at, updated_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| Defaults to desc for the default field and asc for any other. The order is always made total by a tie-break on id, so paging cannot repeat or skip a row that shares a timestamp. cursor encodes queued_at, so combining it with another sort is a 400 rather than a wrong page. | [optional] [enum: asc, desc] |

### Return type

[**ListMessages200Response**](ListMessages200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="sendEmail"></a>
# **sendEmail**
> SendEmail200Response sendEmail(idempotencyKey, sendEmailRequest)

Send an email

Submits an email for delivery via lockally. Returns 202 immediately once the message is accepted into lockally&#39;s queue; the actual SMTP submission to the recipient is async. Track delivery via &#x60;GET /v1/messages/{id}&#x60; or webhook subscriptions for &#x60;delivery.delivered&#x60; / &#x60;delivery.bounced&#x60; / &#x60;delivery.complaint&#x60;.  **Idempotency-Key required.** Any unique string per send, 24-hour dedupe window. Repeated calls with the same key return byte-exact the original response and do NOT create a duplicate message.  **Sender authorisation.** &#x60;from&#x60; must be an address the calling tenant owns on a verified domain. A mailbox always qualifies. On business and combined accounts an **alias** qualifies too, so a send-only address such as &#x60;no-reply@&#x60; need not be a billed seat. An alias on an unverified domain, or one belonging to another account, is refused with &#x60;403&#x60;. A catch-all creates no aliases and so grants no sending rights.  **Rate cap.** Per-tenant &#x60;rate_cap_per_min&#x60; (returned on &#x60;/v1/tenant&#x60;) is enforced, 429 with &#x60;Retry-After: 60&#x60; once tripped.  **Recipient warning.** Over 25 total recipients (To+Cc+Bcc) sets a &#x60;warning&#x60; field in the response, large fan-outs queue noticeably at scale. Hard cap is 100/send.  **Not every success is a 202.** Check the status code, not just the body. A &#x60;200&#x60; means nothing was queued: either every recipient was already suppressed, or the call used a test key and the send was simulated. Both are successes, and neither produces a real delivery. See the &#x60;200&#x60; response below.  **Warm-up headers.** While the platform is in its outbound warm-up ramp, accepted sends carry &#x60;X-Warmup-Day&#x60;, &#x60;X-Warmup-Daily-Cap&#x60; and &#x60;X-Warmup-Used-Today&#x60;. They describe a platform-wide cap shared by every tenant, not your own allowance, and they disappear once the ramp finishes. Hitting the cap returns 429. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
val sendEmailRequest : SendEmailRequest =  // SendEmailRequest | 
try {
    val result : SendEmail200Response = apiInstance.sendEmail(idempotencyKey, sendEmailRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#sendEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#sendEmail")
    e.printStackTrace()
}
```

### Parameters
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sendEmailRequest** | [**SendEmailRequest**](SendEmailRequest.md)|  | |

### Return type

[**SendEmail200Response**](SendEmail200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="sendEmailBatch"></a>
# **sendEmailBatch**
> SendEmailBatch200Response sendEmailBatch(idempotencyKey, sendEmailBatchRequest)

Send a batch of emails

Sends up to 500 messages in one call. Each is validated and enqueued independently, a bad message fails only its own slot (partial success, HTTP 200). One &#x60;Idempotency-Key&#x60; header covers the batch; per-message keys are derived as &#x60;&lt;key&gt;:&lt;index&gt;&#x60;. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
val sendEmailBatchRequest : SendEmailBatchRequest =  // SendEmailBatchRequest | 
try {
    val result : SendEmailBatch200Response = apiInstance.sendEmailBatch(idempotencyKey, sendEmailBatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#sendEmailBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#sendEmailBatch")
    e.printStackTrace()
}
```

### Parameters
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sendEmailBatchRequest** | [**SendEmailBatchRequest**](SendEmailBatchRequest.md)|  | |

### Return type

[**SendEmailBatch200Response**](SendEmailBatch200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

