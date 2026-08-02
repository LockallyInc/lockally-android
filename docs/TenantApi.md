# TenantApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1TenantGet**](TenantApi.md#v1TenantGet) | **GET** /v1/tenant | Get the calling tenant |
| [**v1UsageGet**](TenantApi.md#v1UsageGet) | **GET** /v1/usage | Usage snapshot |


<a id="v1TenantGet"></a>
# **v1TenantGet**
> Tenant v1TenantGet()

Get the calling tenant

Returns the tenant the presented API key belongs to.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
try {
    val result : Tenant = apiInstance.v1TenantGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#v1TenantGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#v1TenantGet")
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

<a id="v1UsageGet"></a>
# **v1UsageGet**
> V1UsageGet200Response v1UsageGet()

Usage snapshot

Returns the tenant&#39;s current usage + cap consumption. Designed for poll-based alerting on the integrator side (e.g. \&quot;warn when daily quota is 80% used\&quot;). Refreshed live from Postgres — there is no cache, so callers should poll at most once per minute. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
try {
    val result : V1UsageGet200Response = apiInstance.v1UsageGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#v1UsageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#v1UsageGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1UsageGet200Response**](V1UsageGet200Response.md)

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

