# DirectoryApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getDirectoryActivity**](DirectoryApi.md#getDirectoryActivity) | **GET** /v1/directory-activity | Get recent directory activity |
| [**getDirectoryPermissions**](DirectoryApi.md#getDirectoryPermissions) | **GET** /v1/directory-permissions | Get directory permission settings |
| [**getDirectoryStats**](DirectoryApi.md#getDirectoryStats) | **GET** /v1/directory-stats | Get directory statistics |
| [**getGALSettings**](DirectoryApi.md#getGALSettings) | **GET** /v1/gal-settings | Get Global Address List settings |
| [**rebuildGALIndex**](DirectoryApi.md#rebuildGALIndex) | **POST** /v1/gal-settings/rebuild-index | Rebuild the GAL search index |
| [**syncGAL**](DirectoryApi.md#syncGAL) | **POST** /v1/gal-settings/sync | Sync GAL with external directory sources |
| [**updateDirectoryPermissions**](DirectoryApi.md#updateDirectoryPermissions) | **PATCH** /v1/directory-permissions | Update directory permission settings |
| [**updateGALSettings**](DirectoryApi.md#updateGALSettings) | **PATCH** /v1/gal-settings | Update GAL settings |


<a id="getDirectoryActivity"></a>
# **getDirectoryActivity**
> GetDirectoryActivity200Response getDirectoryActivity()

Get recent directory activity

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : GetDirectoryActivity200Response = apiInstance.getDirectoryActivity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#getDirectoryActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#getDirectoryActivity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDirectoryActivity200Response**](GetDirectoryActivity200Response.md)

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

<a id="getDirectoryPermissions"></a>
# **getDirectoryPermissions**
> DirectoryPermissions getDirectoryPermissions()

Get directory permission settings

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : DirectoryPermissions = apiInstance.getDirectoryPermissions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#getDirectoryPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#getDirectoryPermissions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DirectoryPermissions**](DirectoryPermissions.md)

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

<a id="getDirectoryStats"></a>
# **getDirectoryStats**
> GetDirectoryStats200Response getDirectoryStats()

Get directory statistics

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : GetDirectoryStats200Response = apiInstance.getDirectoryStats()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#getDirectoryStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#getDirectoryStats")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDirectoryStats200Response**](GetDirectoryStats200Response.md)

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

<a id="getGALSettings"></a>
# **getGALSettings**
> GALSettings getGALSettings()

Get Global Address List settings

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : GALSettings = apiInstance.getGALSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#getGALSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#getGALSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GALSettings**](GALSettings.md)

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

<a id="rebuildGALIndex"></a>
# **rebuildGALIndex**
> GALSettings rebuildGALIndex()

Rebuild the GAL search index

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : GALSettings = apiInstance.rebuildGALIndex()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#rebuildGALIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#rebuildGALIndex")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GALSettings**](GALSettings.md)

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

<a id="syncGAL"></a>
# **syncGAL**
> GALSettings syncGAL()

Sync GAL with external directory sources

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
try {
    val result : GALSettings = apiInstance.syncGAL()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#syncGAL")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#syncGAL")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GALSettings**](GALSettings.md)

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

<a id="updateDirectoryPermissions"></a>
# **updateDirectoryPermissions**
> DirectoryPermissions updateDirectoryPermissions(updateDirectoryPermissionsRequest)

Update directory permission settings

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
val updateDirectoryPermissionsRequest : UpdateDirectoryPermissionsRequest =  // UpdateDirectoryPermissionsRequest | 
try {
    val result : DirectoryPermissions = apiInstance.updateDirectoryPermissions(updateDirectoryPermissionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#updateDirectoryPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#updateDirectoryPermissions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateDirectoryPermissionsRequest** | [**UpdateDirectoryPermissionsRequest**](UpdateDirectoryPermissionsRequest.md)|  | |

### Return type

[**DirectoryPermissions**](DirectoryPermissions.md)

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

<a id="updateGALSettings"></a>
# **updateGALSettings**
> GALSettings updateGALSettings(updateGALSettingsRequest)

Update GAL settings

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DirectoryApi()
val updateGALSettingsRequest : UpdateGALSettingsRequest =  // UpdateGALSettingsRequest | 
try {
    val result : GALSettings = apiInstance.updateGALSettings(updateGALSettingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectoryApi#updateGALSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectoryApi#updateGALSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateGALSettingsRequest** | [**UpdateGALSettingsRequest**](UpdateGALSettingsRequest.md)|  | |

### Return type

[**GALSettings**](GALSettings.md)

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

