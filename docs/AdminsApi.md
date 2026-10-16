# AdminsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteAdmin**](AdminsApi.md#deleteAdmin) | **DELETE** /v1/admins/{id} | Delete an admin |
| [**inviteAdmin**](AdminsApi.md#inviteAdmin) | **POST** /v1/admins | Invite a new admin |
| [**listAdmins**](AdminsApi.md#listAdmins) | **GET** /v1/admins | List tenant admins |
| [**updateAdmin**](AdminsApi.md#updateAdmin) | **PATCH** /v1/admins/{id} | Update an admin |


<a id="deleteAdmin"></a>
# **deleteAdmin**
> deleteAdmin(id)

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
    apiInstance.deleteAdmin(id)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#deleteAdmin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#deleteAdmin")
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

<a id="inviteAdmin"></a>
# **inviteAdmin**
> AdminFull inviteAdmin(inviteAdminRequest)

Invite a new admin

Creates a new tenant admin. If &#x60;password&#x60; is omitted, lockally generates a 16-char password and returns it ONCE in the response. Email is case-insensitive and unique per tenant. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
val inviteAdminRequest : InviteAdminRequest =  // InviteAdminRequest | 
try {
    val result : AdminFull = apiInstance.inviteAdmin(inviteAdminRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#inviteAdmin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#inviteAdmin")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteAdminRequest** | [**InviteAdminRequest**](InviteAdminRequest.md)|  | |

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

<a id="listAdmins"></a>
# **listAdmins**
> ListAdmins200Response listAdmins()

List tenant admins

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
try {
    val result : ListAdmins200Response = apiInstance.listAdmins()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#listAdmins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#listAdmins")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListAdmins200Response**](ListAdmins200Response.md)

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

<a id="updateAdmin"></a>
# **updateAdmin**
> AdminFull updateAdmin(id, updateAdminRequest)

Update an admin

Supply at least one of &#x60;password&#x60;, &#x60;display_name&#x60;, &#x60;role&#x60;, &#x60;disabled&#x60;.  **Safety rails.** A session bearer (adm_sess_*) cannot disable itself, use another admin or an API key (which bypasses the self-rail). Disabling the last active admin returns 409 to prevent orphaning the tenant from its console. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AdminsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateAdminRequest : UpdateAdminRequest =  // UpdateAdminRequest | 
try {
    val result : AdminFull = apiInstance.updateAdmin(id, updateAdminRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminsApi#updateAdmin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminsApi#updateAdmin")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateAdminRequest** | [**UpdateAdminRequest**](UpdateAdminRequest.md)|  | |

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

