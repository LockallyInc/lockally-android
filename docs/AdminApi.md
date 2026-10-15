# AdminApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminLogin**](AdminApi.md#adminLogin) | **POST** /v1/admin/login | Tenant-admin email+password login |
| [**adminLogout**](AdminApi.md#adminLogout) | **POST** /v1/admin/logout | Invalidate the current admin session |
| [**getCurrentAdmin**](AdminApi.md#getCurrentAdmin) | **GET** /v1/admin/me | Get the current admin + tenant |


<a id="adminLogin"></a>
# **adminLogin**
> AdminLogin200Response adminLogin(adminLoginRequest)

Tenant-admin email+password login

Exchanges an admin&#39;s email + password for a session token. The web console at &#x60;app.lockally.com&#x60; posts this on form submission and stores the returned token in an httpOnly cookie.  **No enumeration leak.** Wrong-email and wrong-password both return the same 401 with title \&quot;Invalid credentials\&quot;. The argon2id verify runs even on lookup miss (well, structurally — the lookup fails fast but the response shape is constant) so timing leaks are bounded.  Tokens are prefixed &#x60;adm_sess_&#x60; and valid for 7 days. Use as the &#x60;Authorization: Bearer&#x60; value on all subsequent calls. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
val adminLoginRequest : AdminLoginRequest =  // AdminLoginRequest | 
try {
    val result : AdminLogin200Response = apiInstance.adminLogin(adminLoginRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminLogin")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adminLoginRequest** | [**AdminLoginRequest**](AdminLoginRequest.md)|  | |

### Return type

[**AdminLogin200Response**](AdminLogin200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="adminLogout"></a>
# **adminLogout**
> adminLogout()

Invalidate the current admin session

Deletes the session row from the database. Idempotent — calling logout on an already-invalid token returns 204 anyway. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
try {
    apiInstance.adminLogout()
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminLogout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminLogout")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="getCurrentAdmin"></a>
# **getCurrentAdmin**
> GetCurrentAdmin200Response getCurrentAdmin()

Get the current admin + tenant

Returns the admin profile + tenant for the session token presented in &#x60;Authorization: Bearer&#x60;. Used by the web console&#39;s layout load function to populate the sidebar.  Returns 403 if called with an API key (lk_live_*) bearer — admin context only exists for session tokens. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
try {
    val result : GetCurrentAdmin200Response = apiInstance.getCurrentAdmin()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#getCurrentAdmin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#getCurrentAdmin")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCurrentAdmin200Response**](GetCurrentAdmin200Response.md)

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

