# WebhooksApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1WebhooksGet**](WebhooksApi.md#v1WebhooksGet) | **GET** /v1/webhooks | List webhooks |
| [**v1WebhooksIdDelete**](WebhooksApi.md#v1WebhooksIdDelete) | **DELETE** /v1/webhooks/{id} | Delete a webhook |
| [**v1WebhooksIdPatch**](WebhooksApi.md#v1WebhooksIdPatch) | **PATCH** /v1/webhooks/{id} | Update a webhook |
| [**v1WebhooksPost**](WebhooksApi.md#v1WebhooksPost) | **POST** /v1/webhooks | Create a webhook |


<a id="v1WebhooksGet"></a>
# **v1WebhooksGet**
> V1WebhooksGet200Response v1WebhooksGet()

List webhooks

Returns the calling tenant&#39;s webhook subscriptions. Never returns the signing secret — only metadata. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
try {
    val result : V1WebhooksGet200Response = apiInstance.v1WebhooksGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#v1WebhooksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#v1WebhooksGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1WebhooksGet200Response**](V1WebhooksGet200Response.md)

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

<a id="v1WebhooksIdDelete"></a>
# **v1WebhooksIdDelete**
> v1WebhooksIdDelete(id)

Delete a webhook

Hard-delete; cascades to &#x60;webhook_deliveries&#x60; history.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.v1WebhooksIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#v1WebhooksIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#v1WebhooksIdDelete")
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

<a id="v1WebhooksIdPatch"></a>
# **v1WebhooksIdPatch**
> Webhook v1WebhooksIdPatch(id, v1WebhooksIdPatchRequest)

Update a webhook

Supply at least one of &#x60;url&#x60;, &#x60;events&#x60;, &#x60;paused&#x60;. Setting &#x60;paused&#x60; to &#x60;false&#x60; ALSO resets &#x60;consecutive_failures&#x60; to 0 — re-arms the 50-failure auto-pause counter. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val v1WebhooksIdPatchRequest : V1WebhooksIdPatchRequest =  // V1WebhooksIdPatchRequest | 
try {
    val result : Webhook = apiInstance.v1WebhooksIdPatch(id, v1WebhooksIdPatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#v1WebhooksIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#v1WebhooksIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1WebhooksIdPatchRequest** | [**V1WebhooksIdPatchRequest**](V1WebhooksIdPatchRequest.md)|  | |

### Return type

[**Webhook**](Webhook.md)

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

<a id="v1WebhooksPost"></a>
# **v1WebhooksPost**
> Webhook v1WebhooksPost(v1WebhooksPostRequest)

Create a webhook

Subscribes a URL to one or more event types. Returns the &#x60;signing_secret&#x60; ONCE in the response — store it immediately. The dispatcher signs every outbound POST per design L3:      X-Lockally-Signature: t&#x3D;&lt;unix&gt;,v1&#x3D;&lt;hex(hmac_sha256(secret, t + \&quot;.\&quot; + body))&gt;  Verify on your end using HMAC-SHA256 with a 5-minute timestamp window (replay protection). A reference verifier ships in [internal/webhook](https://github.com/ucheigwedinma/lockally/blob/main/internal/webhook/sign.go).  Event names: see the [event catalogue](https://github.com/ucheigwedinma/lockally/blob/main/docs/v1-design.md#64-webhook-event-catalogue-v1). 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
val v1WebhooksPostRequest : V1WebhooksPostRequest =  // V1WebhooksPostRequest | 
try {
    val result : Webhook = apiInstance.v1WebhooksPost(v1WebhooksPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#v1WebhooksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#v1WebhooksPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1WebhooksPostRequest** | [**V1WebhooksPostRequest**](V1WebhooksPostRequest.md)|  | |

### Return type

[**Webhook**](Webhook.md)

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

