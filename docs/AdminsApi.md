# AdminsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1AdminsGet**](AdminsApi.md#v1AdminsGet) | **GET** /v1/admins | List tenant admins |
| [**v1AdminsIdDelete**](AdminsApi.md#v1AdminsIdDelete) | **DELETE** /v1/admins/{id} | Delete an admin |
| [**v1AdminsIdPatch**](AdminsApi.md#v1AdminsIdPatch) | **PATCH** /v1/admins/{id} | Update an admin |
| [**v1AdminsPost**](AdminsApi.md#v1AdminsPost) | **POST** /v1/admins | Invite a new admin |


<a id="v1AdminsGet"></a>
# **v1AdminsGet**
> V1AdminsGet200Response v1AdminsGet()

List tenant admins

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
try {
    val result : V1AdminsGet200Response = apiInstance.v1AdminsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#v1AdminsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#v1AdminsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1AdminsGet200Response**](V1AdminsGet200Response.md)

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

<a id="v1AdminsIdDelete"></a>
# **v1AdminsIdDelete**
> v1AdminsIdDelete(id)

Delete an admin

Hard-delete. Cascade-drops the admin&#39;s sessions (immediate revocation). Same safety rails as PATCH disabled&#x3D;true. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.v1AdminsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#v1AdminsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#v1AdminsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

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

<a id="v1AdminsIdPatch"></a>
# **v1AdminsIdPatch**
> AdminFull v1AdminsIdPatch(id, v1AdminsIdPatchRequest)

Update an admin

Supply at least one of &#x60;password&#x60;, &#x60;display_name&#x60;, &#x60;role&#x60;, &#x60;disabled&#x60;.  **Safety rails.** A session bearer (adm_sess_*) cannot disable itself — use another admin or an API key (which bypasses the self-rail). Disabling the last active admin returns 409 to prevent orphaning the tenant from its console. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val v1AdminsIdPatchRequest : V1AdminsIdPatchRequest =  // V1AdminsIdPatchRequest | 
try {
    val result : AdminFull = apiInstance.v1AdminsIdPatch(id, v1AdminsIdPatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#v1AdminsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#v1AdminsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1AdminsIdPatchRequest** | [**V1AdminsIdPatchRequest**](V1AdminsIdPatchRequest.md)|  | |

### Return type

[**AdminFull**](AdminFull.md)

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

<a id="v1AdminsPost"></a>
# **v1AdminsPost**
> AdminFull v1AdminsPost(v1AdminsPostRequest)

Invite a new admin

Creates a new tenant admin. If &#x60;password&#x60; is omitted, lockally generates a 16-char password and returns it ONCE in the response. Email is case-insensitive and unique per tenant. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
val v1AdminsPostRequest : V1AdminsPostRequest =  // V1AdminsPostRequest | 
try {
    val result : AdminFull = apiInstance.v1AdminsPost(v1AdminsPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#v1AdminsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#v1AdminsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1AdminsPostRequest** | [**V1AdminsPostRequest**](V1AdminsPostRequest.md)|  | |

### Return type

[**AdminFull**](AdminFull.md)

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

