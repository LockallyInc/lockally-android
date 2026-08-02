# AdminApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1AdminLoginPost**](AdminApi.md#v1AdminLoginPost) | **POST** /v1/admin/login | Tenant-admin email+password login |
| [**v1AdminLogoutPost**](AdminApi.md#v1AdminLogoutPost) | **POST** /v1/admin/logout | Invalidate the current admin session |
| [**v1AdminMeGet**](AdminApi.md#v1AdminMeGet) | **GET** /v1/admin/me | Get the current admin + tenant |


<a id="v1AdminLoginPost"></a>
# **v1AdminLoginPost**
> V1AdminLoginPost200Response v1AdminLoginPost(v1AdminLoginPostRequest)

Tenant-admin email+password login

Exchanges an admin&#39;s email + password for a session token. The web console at &#x60;app.lockally.com&#x60; posts this on form submission and stores the returned token in an httpOnly cookie.  **No enumeration leak.** Wrong-email and wrong-password both return the same 401 with title \&quot;Invalid credentials\&quot;. The argon2id verify runs even on lookup miss (well, structurally — the lookup fails fast but the response shape is constant) so timing leaks are bounded.  Tokens are prefixed &#x60;adm_sess_&#x60; and valid for 7 days. Use as the &#x60;Authorization: Bearer&#x60; value on all subsequent calls. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
val v1AdminLoginPostRequest : V1AdminLoginPostRequest =  // V1AdminLoginPostRequest | 
try {
    val result : V1AdminLoginPost200Response = apiInstance.v1AdminLoginPost(v1AdminLoginPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#v1AdminLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#v1AdminLoginPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1AdminLoginPostRequest** | [**V1AdminLoginPostRequest**](V1AdminLoginPostRequest.md)|  | |

### Return type

[**V1AdminLoginPost200Response**](V1AdminLoginPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="v1AdminLogoutPost"></a>
# **v1AdminLogoutPost**
> v1AdminLogoutPost()

Invalidate the current admin session

Deletes the session row from the database. Idempotent — calling logout on an already-invalid token returns 204 anyway. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
try {
    apiInstance.v1AdminLogoutPost()
} catch (e: ClientException) {
    println("4xx response calling AdminApi#v1AdminLogoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#v1AdminLogoutPost")
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

<a id="v1AdminMeGet"></a>
# **v1AdminMeGet**
> V1AdminMeGet200Response v1AdminMeGet()

Get the current admin + tenant

Returns the admin profile + tenant for the session token presented in &#x60;Authorization: Bearer&#x60;. Used by the web console&#39;s layout load function to populate the sidebar.  Returns 403 if called with an API key (lk_live_*) bearer — admin context only exists for session tokens. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminApi()
try {
    val result : V1AdminMeGet200Response = apiInstance.v1AdminMeGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#v1AdminMeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#v1AdminMeGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1AdminMeGet200Response**](V1AdminMeGet200Response.md)

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

