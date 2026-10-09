# HealthApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**healthzGet**](HealthApi.md#healthzGet) | **GET** /healthz | Liveness check |


<a id="healthzGet"></a>
# **healthzGet**
> HealthzGet200Response healthzGet()

Liveness check

Returns 200 if the process is up and the database pings cleanly. No authentication required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = HealthApi()
try {
    val result : HealthzGet200Response = apiInstance.healthzGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HealthApi#healthzGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthApi#healthzGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthzGet200Response**](HealthzGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

