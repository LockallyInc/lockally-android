# ApiKeysApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /v1/api-keys | Create an API key |
| [**listApiKeys**](ApiKeysApi.md#listApiKeys) | **GET** /v1/api-keys | List API keys |
| [**revokeApiKey**](ApiKeysApi.md#revokeApiKey) | **DELETE** /v1/api-keys/{id} | Revoke an API key |


<a id="createApiKey"></a>
# **createApiKey**
> CreateApiKey201Response createApiKey(createApiKeyRequest)

Create an API key

Provisions a fresh API key for the calling tenant.  **The full &#x60;secret&#x60; is included in this response ONLY**, store it immediately. The cleartext secret is not recoverable from the argon2id hash kept server-side; rotate by creating a new key and revoking the old one. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val createApiKeyRequest : CreateApiKeyRequest =  // CreateApiKeyRequest | 
try {
    val result : CreateApiKey201Response = apiInstance.createApiKey(createApiKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#createApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#createApiKey")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

[**CreateApiKey201Response**](CreateApiKey201Response.md)

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

<a id="listApiKeys"></a>
# **listApiKeys**
> ListApiKeys200Response listApiKeys()

List API keys

Returns all API keys (active and revoked) belonging to the calling tenant. The &#x60;secret&#x60; is **never** returned, only prefix + metadata. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
try {
    val result : ListApiKeys200Response = apiInstance.listApiKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#listApiKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#listApiKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListApiKeys200Response**](ListApiKeys200Response.md)

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

<a id="revokeApiKey"></a>
# **revokeApiKey**
> revokeApiKey(id)

Revoke an API key

Soft-deletes (sets &#x60;revoked_at&#x60;) on the named key. The row stays for audit purposes; the key no longer authenticates.  You **cannot revoke the key currently being used** to make this call, that would lock you out. Use a different &#x60;tenant:admin&#x60; key. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.revokeApiKey(id)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#revokeApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#revokeApiKey")
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

