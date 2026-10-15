# AiApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**classifyThread**](AiApi.md#classifyThread) | **POST** /v1/threads/{threadID}/classify | LLM-classify a thread |
| [**createAiUnitsCheckout**](AiApi.md#createAiUnitsCheckout) | **POST** /v1/billing/ai-units/checkout | Buy prepaid AI units |
| [**getAiConfig**](AiApi.md#getAiConfig) | **GET** /v1/ai-config | Read the tenant&#39;s AI configuration |
| [**updateAiConfig**](AiApi.md#updateAiConfig) | **PUT** /v1/ai-config | Configure the AI tier |


<a id="classifyThread"></a>
# **classifyThread**
> ThreadClassification classifyThread(threadID, refresh)

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
    val result : ThreadClassification = apiInstance.classifyThread(threadID, refresh)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#classifyThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#classifyThread")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] |

### Return type

[**ThreadClassification**](ThreadClassification.md)

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

<a id="createAiUnitsCheckout"></a>
# **createAiUnitsCheckout**
> CreateAiUnitsCheckout200Response createAiUnitsCheckout()

Buy prepaid AI units

Body: {\&quot;bundle\&quot;: \&quot;100|500|2000\&quot;}. One classification &#x3D; one unit; bundles expire after 6 months. Admin session required. 503 until Paystack billing is configured.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : CreateAiUnitsCheckout200Response = apiInstance.createAiUnitsCheckout()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#createAiUnitsCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#createAiUnitsCheckout")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAiUnitsCheckout200Response**](CreateAiUnitsCheckout200Response.md)

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

<a id="getAiConfig"></a>
# **getAiConfig**
> AiConfig getAiConfig()

Read the tenant&#39;s AI configuration

Mode (off/byok/units), model, masked key hint, AI-unit balance, whether the units tier is available on this deployment.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : AiConfig = apiInstance.getAiConfig()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#getAiConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#getAiConfig")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiConfig**](AiConfig.md)

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

<a id="updateAiConfig"></a>
# **updateAiConfig**
> AiConfigUpdate updateAiConfig()

Configure the AI tier

Body: {\&quot;mode\&quot;: \&quot;off|byok|units\&quot;, \&quot;model\&quot;: \&quot;...\&quot;, \&quot;anthropic_key\&quot;: \&quot;sk-ant-...\&quot;}. BYOK keys are stored AES-256-GCM encrypted; the cleartext is never returned. Omit anthropic_key to keep the stored one.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AiApi()
try {
    val result : AiConfigUpdate = apiInstance.updateAiConfig()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiApi#updateAiConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiApi#updateAiConfig")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiConfigUpdate**](AiConfigUpdate.md)

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

