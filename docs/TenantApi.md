# TenantApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTenant**](TenantApi.md#getTenant) | **GET** /v1/tenant | Get the calling tenant |
| [**getUsage**](TenantApi.md#getUsage) | **GET** /v1/usage | Usage snapshot |


<a id="getTenant"></a>
# **getTenant**
> Tenant getTenant()

Get the calling tenant

Returns the tenant the presented API key belongs to.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
try {
    val result : Tenant = apiInstance.getTenant()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#getTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#getTenant")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tenant**](Tenant.md)

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

<a id="getUsage"></a>
# **getUsage**
> GetUsage200Response getUsage()

Usage snapshot

Returns the tenant&#39;s current usage + cap consumption. Designed for poll-based alerting on the integrator side (e.g. \&quot;warn when daily quota is 80% used\&quot;). Computed live on request, so there is no cache, so callers should poll at most once per minute. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
try {
    val result : GetUsage200Response = apiInstance.getUsage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#getUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#getUsage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUsage200Response**](GetUsage200Response.md)

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

