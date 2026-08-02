# AliasesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1AliasesAddressDelete**](AliasesApi.md#v1AliasesAddressDelete) | **DELETE** /v1/aliases/{address} | Delete an alias |
| [**v1AliasesGet**](AliasesApi.md#v1AliasesGet) | **GET** /v1/aliases | List aliases |
| [**v1AliasesPost**](AliasesApi.md#v1AliasesPost) | **POST** /v1/aliases | Create an alias |


<a id="v1AliasesAddressDelete"></a>
# **v1AliasesAddressDelete**
> v1AliasesAddressDelete(address)

Delete an alias

Hard-delete (no soft-delete window — aliases are cheap to recreate).

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AliasesApi()
val address : kotlin.String = address_example // kotlin.String | 
try {
    apiInstance.v1AliasesAddressDelete(address)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#v1AliasesAddressDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#v1AliasesAddressDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **address** | **kotlin.String**|  | |

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

<a id="v1AliasesGet"></a>
# **v1AliasesGet**
> V1AliasesGet200Response v1AliasesGet()

List aliases

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AliasesApi()
try {
    val result : V1AliasesGet200Response = apiInstance.v1AliasesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#v1AliasesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#v1AliasesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1AliasesGet200Response**](V1AliasesGet200Response.md)

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

<a id="v1AliasesPost"></a>
# **v1AliasesPost**
> Alias v1AliasesPost(v1AliasesPostRequest)

Create an alias

Creates an email alias. &#x60;alias_address&#x60; must be on a verified tenant-owned domain. &#x60;alias_target&#x60; can be any email — intra-tenant or external (forwarding to a Gmail account is a legitimate use). 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AliasesApi()
val v1AliasesPostRequest : V1AliasesPostRequest =  // V1AliasesPostRequest | 
try {
    val result : Alias = apiInstance.v1AliasesPost(v1AliasesPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#v1AliasesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#v1AliasesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1AliasesPostRequest** | [**V1AliasesPostRequest**](V1AliasesPostRequest.md)|  | |

### Return type

[**Alias**](Alias.md)

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

