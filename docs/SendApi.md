# SendApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1MessagesGet**](SendApi.md#v1MessagesGet) | **GET** /v1/messages | List outbound messages |
| [**v1MessagesIdDelete**](SendApi.md#v1MessagesIdDelete) | **DELETE** /v1/messages/{id} | Cancel a scheduled send |
| [**v1MessagesIdGet**](SendApi.md#v1MessagesIdGet) | **GET** /v1/messages/{id} | Get message status |
| [**v1MessagesStatsGet**](SendApi.md#v1MessagesStatsGet) | **GET** /v1/messages/stats | Aggregate delivery stats |
| [**v1SendBatchPost**](SendApi.md#v1SendBatchPost) | **POST** /v1/send/batch | Send a batch of emails |
| [**v1SendPost**](SendApi.md#v1SendPost) | **POST** /v1/send | Send an email |


<a id="v1MessagesGet"></a>
# **v1MessagesGet**
> V1MessagesGet200Response v1MessagesGet(status, sender, q, since, cursor, limit)

List outbound messages

Returns recent outbound messages for the calling tenant, sorted newest first. Backs the send-status pill in the SvelteKit /sends view and the outbound search box. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val status : kotlin.String = status_example // kotlin.String | 
val sender : kotlin.String = sender_example // kotlin.String | Exact match against the `from` mailbox.
val q : kotlin.String = q_example // kotlin.String | Free-text search across subject + sender.
val since : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Only messages queued at or after this RFC 3339 instant.
val cursor : kotlin.String = cursor_example // kotlin.String | queued_at of the prior page boundary. Pass back the `next_cursor` returned by the previous call.
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1MessagesGet200Response = apiInstance.v1MessagesGet(status, sender, q, since, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1MessagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1MessagesGet")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] [enum: queued, sending, delivered, bounced, deferred, complaint] |
| **sender** | **kotlin.String**| Exact match against the &#x60;from&#x60; mailbox. | [optional] |
| **q** | **kotlin.String**| Free-text search across subject + sender. | [optional] |
| **since** | **kotlin.time.Instant**| Only messages queued at or after this RFC 3339 instant. | [optional] |
| **cursor** | **kotlin.String**| queued_at of the prior page boundary. Pass back the &#x60;next_cursor&#x60; returned by the previous call. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**V1MessagesGet200Response**](V1MessagesGet200Response.md)

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

<a id="v1MessagesIdDelete"></a>
# **v1MessagesIdDelete**
> v1MessagesIdDelete(id)

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
    apiInstance.v1MessagesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1MessagesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1MessagesIdDelete")
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

<a id="v1MessagesIdGet"></a>
# **v1MessagesIdGet**
> MessageDetail v1MessagesIdGet(id)

Get message status

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MessageDetail = apiInstance.v1MessagesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1MessagesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1MessagesIdGet")
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

<a id="v1MessagesStatsGet"></a>
# **v1MessagesStatsGet**
> MessageStats v1MessagesStatsGet(from, to, domain)

Aggregate delivery stats

Counts by delivery outcome (delivered/bounced/deferred/complaint) plus rates over a window, from the delivery-event store. Privacy-first: this reflects what receiving servers reported, NOT whether a human opened the mail — Lockally does no open/click tracking. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val from : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Window start (default 7 days ago).
val to : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | Window end (default now).
val domain : kotlin.String = domain_example // kotlin.String | Filter by sender domain.
try {
    val result : MessageStats = apiInstance.v1MessagesStatsGet(from, to, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1MessagesStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1MessagesStatsGet")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.time.Instant**| Window start (default 7 days ago). | [optional] |
| **to** | **kotlin.time.Instant**| Window end (default now). | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**| Filter by sender domain. | [optional] |

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

<a id="v1SendBatchPost"></a>
# **v1SendBatchPost**
> V1SendBatchPost200Response v1SendBatchPost(idempotencyKey, v1SendBatchPostRequest)

Send a batch of emails

Sends up to 500 messages in one call. Each is validated and enqueued independently — a bad message fails only its own slot (partial success, HTTP 200). One &#x60;Idempotency-Key&#x60; header covers the batch; per-message keys are derived as &#x60;&lt;key&gt;:&lt;index&gt;&#x60;. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
val v1SendBatchPostRequest : V1SendBatchPostRequest =  // V1SendBatchPostRequest | 
try {
    val result : V1SendBatchPost200Response = apiInstance.v1SendBatchPost(idempotencyKey, v1SendBatchPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1SendBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1SendBatchPost")
    e.printStackTrace()
}
```

### Parameters
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1SendBatchPostRequest** | [**V1SendBatchPostRequest**](V1SendBatchPostRequest.md)|  | |

### Return type

[**V1SendBatchPost200Response**](V1SendBatchPost200Response.md)

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

<a id="v1SendPost"></a>
# **v1SendPost**
> V1SendPost202Response v1SendPost(idempotencyKey, v1SendPostRequest)

Send an email

Submits an email for delivery via lockally. Returns 202 immediately once the message is accepted into lockally&#39;s queue; the actual SMTP submission to the recipient is async. Track delivery via &#x60;GET /v1/messages/{id}&#x60; or webhook subscriptions for &#x60;delivery.delivered&#x60; / &#x60;delivery.bounced&#x60; / &#x60;delivery.complaint&#x60;.  **Idempotency-Key required.** Per design L7 — any unique string per send, 24-hour dedupe window. Repeated calls with the same key return byte-exact the original response and do NOT create a duplicate message.  **Sender authorisation.** &#x60;from&#x60; must be a non-disabled mailbox owned by the calling tenant on a verified domain. Sending from aliases is not yet supported.  **Rate cap.** Per-tenant &#x60;rate_cap_per_min&#x60; (returned on &#x60;/v1/tenant&#x60;) is enforced — 429 with &#x60;Retry-After: 60&#x60; once tripped.  **Recipient warning.** Over 25 total recipients (To+Cc+Bcc) sets a &#x60;warning&#x60; field in the response — large fan-outs queue noticeably at scale. Hard cap is 100/send. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SendApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
val v1SendPostRequest : V1SendPostRequest =  // V1SendPostRequest | 
try {
    val result : V1SendPost202Response = apiInstance.v1SendPost(idempotencyKey, v1SendPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SendApi#v1SendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SendApi#v1SendPost")
    e.printStackTrace()
}
```

### Parameters
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1SendPostRequest** | [**V1SendPostRequest**](V1SendPostRequest.md)|  | |

### Return type

[**V1SendPost202Response**](V1SendPost202Response.md)

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

