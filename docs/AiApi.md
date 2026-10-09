# AiApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1AiConfigGet**](AiApi.md#v1AiConfigGet) | **GET** /v1/ai-config | Read the tenant&#39;s AI configuration |
| [**v1AiConfigPut**](AiApi.md#v1AiConfigPut) | **PUT** /v1/ai-config | Configure the AI tier |
| [**v1BillingAiUnitsCheckoutPost**](AiApi.md#v1BillingAiUnitsCheckoutPost) | **POST** /v1/billing/ai-units/checkout | Buy prepaid AI units |
| [**v1ThreadsThreadIDClassifyPost**](AiApi.md#v1ThreadsThreadIDClassifyPost) | **POST** /v1/threads/{threadID}/classify | LLM-classify a thread |


<a id="v1AiConfigGet"></a>
# **v1AiConfigGet**
> kotlin.Any v1AiConfigGet()

Read the tenant&#39;s AI configuration

Mode (off/byok/units), model, masked key hint, AI-unit balance, whether the units tier is available on this deployment.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : kotlin.Any = apiInstance.v1AiConfigGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#v1AiConfigGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#v1AiConfigGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1AiConfigPut"></a>
# **v1AiConfigPut**
> kotlin.Any v1AiConfigPut()

Configure the AI tier

Body: {\&quot;mode\&quot;: \&quot;off|byok|units\&quot;, \&quot;model\&quot;: \&quot;...\&quot;, \&quot;anthropic_key\&quot;: \&quot;sk-ant-...\&quot;}. BYOK keys are stored AES-256-GCM encrypted; the cleartext is never returned. Omit anthropic_key to keep the stored one.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : kotlin.Any = apiInstance.v1AiConfigPut()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#v1AiConfigPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#v1AiConfigPut")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1BillingAiUnitsCheckoutPost"></a>
# **v1BillingAiUnitsCheckoutPost**
> kotlin.Any v1BillingAiUnitsCheckoutPost()

Buy prepaid AI units

Body: {\&quot;bundle\&quot;: \&quot;100|500|2000\&quot;}. One classification &#x3D; one unit; bundles expire after 6 months. Admin session required. 503 until Paystack billing is configured.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : kotlin.Any = apiInstance.v1BillingAiUnitsCheckoutPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#v1BillingAiUnitsCheckoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#v1BillingAiUnitsCheckoutPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1ThreadsThreadIDClassifyPost"></a>
# **v1ThreadsThreadIDClassifyPost**
> kotlin.Any v1ThreadsThreadIDClassifyPost(threadID, refresh)

LLM-classify a thread

Returns {intent, urgency, summary, suggested_action} via the tenant&#39;s AI tier (BYOK or prepaid units — see /v1/ai-config). Cached per thread state: unchanged threads return the cache free; ?refresh&#x3D;true forces a re-run. A failed model call charges nothing. 402 when the AI tier is off.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val refresh : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDClassifyPost(threadID, refresh)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#v1ThreadsThreadIDClassifyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#v1ThreadsThreadIDClassifyPost")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

