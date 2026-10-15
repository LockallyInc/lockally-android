# SignupApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**signup**](SignupApi.md#signup) | **POST** /v1/signup | Sign up a new tenant |


<a id="signup"></a>
# **signup**
> AdminLogin200Response signup(signupRequest)

Sign up a new tenant

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = SignupApi()
val signupRequest : SignupRequest =  // SignupRequest | 
try {
    val result : AdminLogin200Response = apiInstance.signup(signupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignupApi#signup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignupApi#signup")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signupRequest** | [**SignupRequest**](SignupRequest.md)|  | |

### Return type

[**AdminLogin200Response**](AdminLogin200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

