# DashboardApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAuditSummary**](DashboardApi.md#getAuditSummary) | **GET** /v1/audit-summary | Audit summary for the dashboard |
| [**getDomainsStatus**](DashboardApi.md#getDomainsStatus) | **GET** /v1/domains/status | Domain health status for the dashboard |
| [**getIntegrationsSummary**](DashboardApi.md#getIntegrationsSummary) | **GET** /v1/integrations-summary | Integrations summary for the dashboard |
| [**getSecurity**](DashboardApi.md#getSecurity) | **GET** /v1/security | Security overview for the dashboard |
| [**getStorage**](DashboardApi.md#getStorage) | **GET** /v1/storage | Storage usage for the dashboard |
| [**getTenantHealth**](DashboardApi.md#getTenantHealth) | **GET** /v1/health | Full tenant health report |
| [**getUserInsights**](DashboardApi.md#getUserInsights) | **GET** /v1/user-insights | User insights for the dashboard |


<a id="getAuditSummary"></a>
# **getAuditSummary**
> GetAuditSummary200Response getAuditSummary()

Audit summary for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetAuditSummary200Response = apiInstance.getAuditSummary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getAuditSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getAuditSummary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAuditSummary200Response**](GetAuditSummary200Response.md)

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

<a id="getDomainsStatus"></a>
# **getDomainsStatus**
> GetDomainsStatus200Response getDomainsStatus()

Domain health status for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetDomainsStatus200Response = apiInstance.getDomainsStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getDomainsStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getDomainsStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDomainsStatus200Response**](GetDomainsStatus200Response.md)

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

<a id="getIntegrationsSummary"></a>
# **getIntegrationsSummary**
> GetIntegrationsSummary200Response getIntegrationsSummary()

Integrations summary for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetIntegrationsSummary200Response = apiInstance.getIntegrationsSummary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getIntegrationsSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getIntegrationsSummary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetIntegrationsSummary200Response**](GetIntegrationsSummary200Response.md)

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

<a id="getSecurity"></a>
# **getSecurity**
> GetSecurity200Response getSecurity()

Security overview for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetSecurity200Response = apiInstance.getSecurity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getSecurity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getSecurity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSecurity200Response**](GetSecurity200Response.md)

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

<a id="getStorage"></a>
# **getStorage**
> GetStorage200Response getStorage()

Storage usage for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetStorage200Response = apiInstance.getStorage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getStorage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getStorage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetStorage200Response**](GetStorage200Response.md)

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

<a id="getTenantHealth"></a>
# **getTenantHealth**
> kotlin.Any getTenantHealth()

Full tenant health report

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : kotlin.Any = apiInstance.getTenantHealth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getTenantHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getTenantHealth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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

<a id="getUserInsights"></a>
# **getUserInsights**
> GetUserInsights200Response getUserInsights()

User insights for the dashboard

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DashboardApi()
try {
    val result : GetUserInsights200Response = apiInstance.getUserInsights()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardApi#getUserInsights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardApi#getUserInsights")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUserInsights200Response**](GetUserInsights200Response.md)

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

