# SuppressionsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1SuppressionsEmailDelete**](SuppressionsApi.md#v1SuppressionsEmailDelete) | **DELETE** /v1/suppressions/{email} | Remove a suppression |
| [**v1SuppressionsEmailGet**](SuppressionsApi.md#v1SuppressionsEmailGet) | **GET** /v1/suppressions/{email} | Check whether an address is suppressed |
| [**v1SuppressionsGet**](SuppressionsApi.md#v1SuppressionsGet) | **GET** /v1/suppressions | List suppressed recipients |
| [**v1SuppressionsPost**](SuppressionsApi.md#v1SuppressionsPost) | **POST** /v1/suppressions | Add a suppression |


<a id="v1SuppressionsEmailDelete"></a>
# **v1SuppressionsEmailDelete**
> v1SuppressionsEmailDelete(email)

Remove a suppression

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.v1SuppressionsEmailDelete(email)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#v1SuppressionsEmailDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#v1SuppressionsEmailDelete")
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

<a id="v1SuppressionsEmailGet"></a>
# **v1SuppressionsEmailGet**
> Suppression v1SuppressionsEmailGet(email)

Check whether an address is suppressed

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : Suppression = apiInstance.v1SuppressionsEmailGet(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#v1SuppressionsEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#v1SuppressionsEmailGet")
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

<a id="v1SuppressionsGet"></a>
# **v1SuppressionsGet**
> V1SuppressionsGet200Response v1SuppressionsGet(reason, cursor, limit)

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
    val result : V1SuppressionsGet200Response = apiInstance.v1SuppressionsGet(reason, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#v1SuppressionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#v1SuppressionsGet")
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

[**V1SuppressionsGet200Response**](V1SuppressionsGet200Response.md)

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

<a id="v1SuppressionsPost"></a>
# **v1SuppressionsPost**
> Suppression v1SuppressionsPost(v1SuppressionsPostRequest)

Add a suppression

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SuppressionsApi()
val v1SuppressionsPostRequest : V1SuppressionsPostRequest =  // V1SuppressionsPostRequest | 
try {
    val result : Suppression = apiInstance.v1SuppressionsPost(v1SuppressionsPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionsApi#v1SuppressionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionsApi#v1SuppressionsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1SuppressionsPostRequest** | [**V1SuppressionsPostRequest**](V1SuppressionsPostRequest.md)|  | |

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

