# AliasesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAlias**](AliasesApi.md#createAlias) | **POST** /v1/aliases | Create an alias |
| [**deleteAlias**](AliasesApi.md#deleteAlias) | **DELETE** /v1/aliases/{address} | Delete an alias |
| [**listAliases**](AliasesApi.md#listAliases) | **GET** /v1/aliases | List aliases |


<a id="createAlias"></a>
# **createAlias**
> Alias createAlias(createAliasRequest)

Create an alias

Creates an email alias. &#x60;alias_address&#x60; must be on a verified tenant-owned domain and must not be the address of an existing mailbox (live, suspended or deleted). &#x60;alias_target&#x60; must be an active mailbox in the same workspace; forwarding to an address Lockally does not host is not supported. The alias delivers as soon as the call returns. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AliasesApi()
val createAliasRequest : CreateAliasRequest =  // CreateAliasRequest | 
try {
    val result : Alias = apiInstance.createAlias(createAliasRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#createAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#createAlias")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAliasRequest** | [**CreateAliasRequest**](CreateAliasRequest.md)|  | |

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

<a id="deleteAlias"></a>
# **deleteAlias**
> deleteAlias(address)

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
    apiInstance.deleteAlias(address)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#deleteAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#deleteAlias")
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

<a id="listAliases"></a>
# **listAliases**
> ListAliases200Response listAliases()

List aliases

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AliasesApi()
try {
    val result : ListAliases200Response = apiInstance.listAliases()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasesApi#listAliases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasesApi#listAliases")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListAliases200Response**](ListAliases200Response.md)

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

