# SuppressionsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSuppression**](SuppressionsApi.md#createSuppression) | **POST** /v1/suppressions | Add a suppression |
| [**deleteSuppression**](SuppressionsApi.md#deleteSuppression) | **DELETE** /v1/suppressions/{email} | Remove a suppression |
| [**getSuppression**](SuppressionsApi.md#getSuppression) | **GET** /v1/suppressions/{email} | Check whether an address is suppressed |
| [**listSuppressions**](SuppressionsApi.md#listSuppressions) | **GET** /v1/suppressions | List suppressed recipients |


<a id="createSuppression"></a>
# **createSuppression**
> Suppression createSuppression(createSuppressionRequest)

Add a suppression

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val createSuppressionRequest : CreateSuppressionRequest =  // CreateSuppressionRequest | 
try {
    val result : Suppression = apiInstance.createSuppression(createSuppressionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#createSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#createSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createSuppressionRequest** | [**CreateSuppressionRequest**](CreateSuppressionRequest.md)|  | |

### Return type

[**Suppression**](Suppression.md)

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

<a id="deleteSuppression"></a>
# **deleteSuppression**
> deleteSuppression(email)

Remove a suppression

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.deleteSuppression(email)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#deleteSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#deleteSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

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

<a id="getSuppression"></a>
# **getSuppression**
> Suppression getSuppression(email)

Check whether an address is suppressed

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : Suppression = apiInstance.getSuppression(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#getSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#getSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**Suppression**](Suppression.md)

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

<a id="listSuppressions"></a>
# **listSuppressions**
> ListSuppressions200Response listSuppressions(reason, cursor, limit)

List suppressed recipients

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val reason : kotlin.String = reason_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListSuppressions200Response = apiInstance.listSuppressions(reason, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#listSuppressions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#listSuppressions")
    e.printStackTrace()
}
```

### Parameters
| **reason** | **kotlin.String**|  | [optional] [enum: unsubscribe, complaint, bounce, manual] |
| **cursor** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**ListSuppressions200Response**](ListSuppressions200Response.md)

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

