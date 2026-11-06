# ApiKeysApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /v1/api-keys | Create an API key |
| [**listApiKeys**](ApiKeysApi.md#listApiKeys) | **GET** /v1/api-keys | List API keys |
| [**revokeApiKey**](ApiKeysApi.md#revokeApiKey) | **DELETE** /v1/api-keys/{id} | Revoke an API key |
| [**rotateApiKey**](ApiKeysApi.md#rotateApiKey) | **POST** /v1/api-keys/{id}/rotate | Rotate an API key |
| [**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PATCH** /v1/api-keys/{id} | Update an API key |


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
> ListApiKeys200Response listApiKeys(sort, order)

List API keys

Returns all API keys (active and revoked) belonging to the calling tenant. The &#x60;secret&#x60; is **never** returned, only prefix + metadata. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val sort : kotlin.String = sort_example // kotlin.String | Field to order by. This list holds tens of rows per account, so every column is offered and none needs an index.
val order : kotlin.String = order_example // kotlin.String | Defaults to desc for the default field and asc for any other. Always tie-broken on id, so the order is total.
try {
    val result : ListApiKeys200Response = apiInstance.listApiKeys(sort, order)
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
| **sort** | **kotlin.String**| Field to order by. This list holds tens of rows per account, so every column is offered and none needs an index. | [optional] [default to Sort.created_at] [enum: label, created_at, last_used_at, expires_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| Defaults to desc for the default field and asc for any other. Always tie-broken on id, so the order is total. | [optional] [enum: asc, desc] |

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

<a id="rotateApiKey"></a>
# **rotateApiKey**
> CreateApiKey201Response rotateApiKey(id, rotateApiKeyRequest)

Rotate an API key

Issues a successor key and puts a short expiry on this one, so **both work until the overlap ends**. That window is the point: without it, rotation is revocation with extra steps and every caller has to swap credentials in the same instant.  The successor inherits this key&#39;s scopes, its label (the label names the integration, and the integration has not changed) and its test flag. Its full &#x60;secret&#x60; is in this response and nowhere else.  The response&#39;s &#x60;expires_at&#x60; is the **predecessor&#39;s** deadline, so you can see from the rotation itself how long you have to cut over.  A key that has already been rotated cannot be rotated again: chaining overlaps would leave several live keys for one integration, which is the opposite of the intent. Rotate the successor instead. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val rotateApiKeyRequest : RotateApiKeyRequest =  // RotateApiKeyRequest | 
try {
    val result : CreateApiKey201Response = apiInstance.rotateApiKey(id, rotateApiKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#rotateApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#rotateApiKey")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rotateApiKeyRequest** | [**RotateApiKeyRequest**](RotateApiKeyRequest.md)|  | [optional] |

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

<a id="updateApiKey"></a>
# **updateApiKey**
> APIKey updateApiKey(id, updateApiKeyRequest)

Update an API key

Changes a key&#39;s label, scopes or expiry in place, without reissuing the secret.  **Every field is optional and absent means unchanged.** Renaming a key does not clear its expiry. For &#x60;expires_at&#x60; there are three distinct requests: omit the field to leave the expiry alone, send a timestamp to set one, and send an explicit &#x60;null&#x60; to remove one.  Scopes are replaced wholesale, not merged. This endpoint does not restrict which scopes you may grant, because &#x60;POST /v1/api-keys&#x60; never has either: a key with &#x60;tenant:admin&#x60; can already mint a key with any scope, so &#x60;tenant:admin&#x60; is root-equivalent for key management.  A revoked key cannot be updated. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ApiKeysApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateApiKeyRequest : UpdateApiKeyRequest =  // UpdateApiKeyRequest | 
try {
    val result : APIKey = apiInstance.updateApiKey(id, updateApiKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#updateApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#updateApiKey")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateApiKeyRequest** | [**UpdateApiKeyRequest**](UpdateApiKeyRequest.md)|  | |

### Return type

[**APIKey**](APIKey.md)

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

