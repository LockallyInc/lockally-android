# ApiKeysApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1ApiKeysGet**](ApiKeysApi.md#v1ApiKeysGet) | **GET** /v1/api-keys | List API keys |
| [**v1ApiKeysIdDelete**](ApiKeysApi.md#v1ApiKeysIdDelete) | **DELETE** /v1/api-keys/{id} | Revoke an API key |
| [**v1ApiKeysPost**](ApiKeysApi.md#v1ApiKeysPost) | **POST** /v1/api-keys | Create an API key |


<a id="v1ApiKeysGet"></a>
# **v1ApiKeysGet**
> V1ApiKeysGet200Response v1ApiKeysGet()

List API keys

Returns all API keys (active and revoked) belonging to the calling tenant. The &#x60;secret&#x60; is **never** returned — only prefix + metadata. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
try {
    val result : V1ApiKeysGet200Response = apiInstance.v1ApiKeysGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#v1ApiKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#v1ApiKeysGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1ApiKeysGet200Response**](V1ApiKeysGet200Response.md)

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

<a id="v1ApiKeysIdDelete"></a>
# **v1ApiKeysIdDelete**
> v1ApiKeysIdDelete(id)

Revoke an API key

Soft-deletes (sets &#x60;revoked_at&#x60;) on the named key. The row stays for audit purposes; the key no longer authenticates.  You **cannot revoke the key currently being used** to make this call — that would lock you out. Use a different &#x60;tenant:admin&#x60; key. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.v1ApiKeysIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#v1ApiKeysIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#v1ApiKeysIdDelete")
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

<a id="v1ApiKeysPost"></a>
# **v1ApiKeysPost**
> V1ApiKeysPost201Response v1ApiKeysPost(v1ApiKeysPostRequest)

Create an API key

Provisions a fresh API key for the calling tenant.  **The full &#x60;secret&#x60; is included in this response ONLY** — store it immediately. The cleartext secret is not recoverable from the argon2id hash kept server-side; rotate by creating a new key and revoking the old one. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val v1ApiKeysPostRequest : V1ApiKeysPostRequest =  // V1ApiKeysPostRequest | 
try {
    val result : V1ApiKeysPost201Response = apiInstance.v1ApiKeysPost(v1ApiKeysPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#v1ApiKeysPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#v1ApiKeysPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1ApiKeysPostRequest** | [**V1ApiKeysPostRequest**](V1ApiKeysPostRequest.md)|  | |

### Return type

[**V1ApiKeysPost201Response**](V1ApiKeysPost201Response.md)

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

