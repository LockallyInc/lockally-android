# IpPoolsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDedicatedIPRequest**](IpPoolsApi.md#createDedicatedIPRequest) | **POST** /v1/dedicated-ip-requests | Request a dedicated IP |
| [**getIPAssignment**](IpPoolsApi.md#getIPAssignment) | **GET** /v1/ip-assignment | Get current IP assignment |
| [**listDedicatedIPRequests**](IpPoolsApi.md#listDedicatedIPRequests) | **GET** /v1/dedicated-ip-requests | List dedicated IP requests |


<a id="createDedicatedIPRequest"></a>
# **createDedicatedIPRequest**
> DedicatedIPRequest createDedicatedIPRequest(createDedicatedIPRequestRequest)

Request a dedicated IP

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = IpPoolsApi()
val createDedicatedIPRequestRequest : CreateDedicatedIPRequestRequest =  // CreateDedicatedIPRequestRequest | 
try {
    val result : DedicatedIPRequest = apiInstance.createDedicatedIPRequest(createDedicatedIPRequestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpPoolsApi#createDedicatedIPRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpPoolsApi#createDedicatedIPRequest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createDedicatedIPRequestRequest** | [**CreateDedicatedIPRequestRequest**](CreateDedicatedIPRequestRequest.md)|  | |

### Return type

[**DedicatedIPRequest**](DedicatedIPRequest.md)

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

<a id="getIPAssignment"></a>
# **getIPAssignment**
> GetIPAssignment200Response getIPAssignment()

Get current IP assignment

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = IpPoolsApi()
try {
    val result : GetIPAssignment200Response = apiInstance.getIPAssignment()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpPoolsApi#getIPAssignment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpPoolsApi#getIPAssignment")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetIPAssignment200Response**](GetIPAssignment200Response.md)

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

<a id="listDedicatedIPRequests"></a>
# **listDedicatedIPRequests**
> ListDedicatedIPRequests200Response listDedicatedIPRequests()

List dedicated IP requests

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = IpPoolsApi()
try {
    val result : ListDedicatedIPRequests200Response = apiInstance.listDedicatedIPRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpPoolsApi#listDedicatedIPRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpPoolsApi#listDedicatedIPRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDedicatedIPRequests200Response**](ListDedicatedIPRequests200Response.md)

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

