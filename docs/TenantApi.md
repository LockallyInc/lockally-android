# TenantApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTenant**](TenantApi.md#getTenant) | **GET** /v1/tenant | Get the calling tenant |
| [**getTrackingPolicy**](TenantApi.md#getTrackingPolicy) | **GET** /v1/tracking | Get the engagement tracking policy |
| [**getUsage**](TenantApi.md#getUsage) | **GET** /v1/usage | Usage snapshot |
| [**updateTrackingPolicy**](TenantApi.md#updateTrackingPolicy) | **PUT** /v1/tracking | Update the engagement tracking policy |


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

<a id="getTrackingPolicy"></a>
# **getTrackingPolicy**
> TrackingPolicy getTrackingPolicy()

Get the engagement tracking policy

Whether open and click tracking are enabled for this account. **Both are off until switched on**, and an account that has never set a policy reads as off rather than as an error.  &#x60;configured&#x60; reports whether this deployment holds a signing secret. Without one no tracking token can be minted or verified, so tracking cannot work however the flags are set, and a caller seeing &#x60;track_opens: true&#x60; with nothing arriving deserves to know why. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
try {
    val result : TrackingPolicy = apiInstance.getTrackingPolicy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#getTrackingPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#getTrackingPolicy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrackingPolicy**](TrackingPolicy.md)

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

<a id="updateTrackingPolicy"></a>
# **updateTrackingPolicy**
> TrackingPolicy updateTrackingPolicy(updateTrackingPolicyRequest)

Update the engagement tracking policy

Enables or disables tracking for the account. Send either flag or both; an omitted flag is left unchanged rather than reset.  **Enabling this changes what Lockally collects about your recipients**, who have no relationship with us. You are the controller for them. What is collected is a user-agent string, a timestamp, and for a click the destination URL: **no IP address**, ever. The change is written to your audit log. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TenantApi()
val updateTrackingPolicyRequest : UpdateTrackingPolicyRequest =  // UpdateTrackingPolicyRequest | 
try {
    val result : TrackingPolicy = apiInstance.updateTrackingPolicy(updateTrackingPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantApi#updateTrackingPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantApi#updateTrackingPolicy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateTrackingPolicyRequest** | [**UpdateTrackingPolicyRequest**](UpdateTrackingPolicyRequest.md)|  | |

### Return type

[**TrackingPolicy**](TrackingPolicy.md)

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

