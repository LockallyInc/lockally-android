# HealthApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**healthCheck**](HealthApi.md#healthCheck) | **GET** /healthz | Liveness check |


<a id="healthCheck"></a>
# **healthCheck**
> HealthCheck200Response healthCheck()

Liveness check

Returns 200 if the process is up and the database pings cleanly. No authentication required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = HealthApi()
try {
    val result : HealthCheck200Response = apiInstance.healthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HealthApi#healthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthApi#healthCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheck200Response**](HealthCheck200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

