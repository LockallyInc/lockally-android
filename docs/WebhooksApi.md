# WebhooksApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /v1/webhooks | Create a webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /v1/webhooks/{id} | Delete a webhook |
| [**listWebhooks**](WebhooksApi.md#listWebhooks) | **GET** /v1/webhooks | List webhooks |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /v1/webhooks/{id} | Update a webhook |


<a id="createWebhook"></a>
# **createWebhook**
> Webhook createWebhook(createWebhookRequest)

Create a webhook

Subscribes a URL to one or more event types. Returns the &#x60;signing_secret&#x60; ONCE in the response — store it immediately. The dispatcher signs every outbound POST per design L3:      X-Lockally-Signature: t&#x3D;&lt;unix&gt;,v1&#x3D;&lt;hex(hmac_sha256(secret, t + \&quot;.\&quot; + body))&gt;  Verify on your end using HMAC-SHA256 with a 5-minute timestamp window (replay protection). A reference verifier ships in [internal/webhook](https://github.com/ucheigwedinma/lockally/blob/main/internal/webhook/sign.go).  Event names: see the [event catalogue](https://github.com/ucheigwedinma/lockally/blob/main/docs/v1-design.md#64-webhook-event-catalogue-v1). 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
val createWebhookRequest : CreateWebhookRequest =  // CreateWebhookRequest | 
try {
    val result : Webhook = apiInstance.createWebhook(createWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWebhookRequest** | [**CreateWebhookRequest**](CreateWebhookRequest.md)|  | |

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

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(id)

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
    apiInstance.deleteWebhook(id)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
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

<a id="listWebhooks"></a>
# **listWebhooks**
> ListWebhooks200Response listWebhooks()

List webhooks

Returns the calling tenant&#39;s webhook subscriptions. Never returns the signing secret — only metadata. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
try {
    val result : ListWebhooks200Response = apiInstance.listWebhooks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#listWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#listWebhooks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListWebhooks200Response**](ListWebhooks200Response.md)

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

<a id="updateWebhook"></a>
# **updateWebhook**
> Webhook updateWebhook(id, updateWebhookRequest)

Update a webhook

Supply at least one of &#x60;url&#x60;, &#x60;events&#x60;, &#x60;paused&#x60;. Setting &#x60;paused&#x60; to &#x60;false&#x60; ALSO resets &#x60;consecutive_failures&#x60; to 0 — re-arms the 50-failure auto-pause counter. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateWebhookRequest : UpdateWebhookRequest =  // UpdateWebhookRequest | 
try {
    val result : Webhook = apiInstance.updateWebhook(id, updateWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWebhookRequest** | [**UpdateWebhookRequest**](UpdateWebhookRequest.md)|  | |

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

