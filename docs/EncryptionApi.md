# EncryptionApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**batchLookupPublicKeys**](EncryptionApi.md#batchLookupPublicKeys) | **GET** /v1/encryption/keys/lookup | Batch-lookup public keys by email |
| [**createEncryptionKey**](EncryptionApi.md#createEncryptionKey) | **POST** /v1/encryption/keys | Upload an encryption key pair |
| [**createEncryptionRecovery**](EncryptionApi.md#createEncryptionRecovery) | **POST** /v1/encryption/recovery | Store an encryption recovery blob |
| [**getEncryptionKey**](EncryptionApi.md#getEncryptionKey) | **GET** /v1/encryption/keys/{email} | Get encryption key for a mailbox |
| [**rotateEncryptionKey**](EncryptionApi.md#rotateEncryptionKey) | **POST** /v1/encryption/keys/rotate | Rotate an encryption key |


<a id="batchLookupPublicKeys"></a>
# **batchLookupPublicKeys**
> BatchLookupPublicKeys200Response batchLookupPublicKeys(emails)

Batch-lookup public keys by email

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = EncryptionApi()
val emails : kotlin.String = emails_example // kotlin.String | Comma-separated list of email addresses
try {
    val result : BatchLookupPublicKeys200Response = apiInstance.batchLookupPublicKeys(emails)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncryptionApi#batchLookupPublicKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncryptionApi#batchLookupPublicKeys")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emails** | **kotlin.String**| Comma-separated list of email addresses | |

### Return type

[**BatchLookupPublicKeys200Response**](BatchLookupPublicKeys200Response.md)

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

<a id="createEncryptionKey"></a>
# **createEncryptionKey**
> CreateEncryptionKey201Response createEncryptionKey(createEncryptionKeyRequest)

Upload an encryption key pair

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = EncryptionApi()
val createEncryptionKeyRequest : CreateEncryptionKeyRequest =  // CreateEncryptionKeyRequest | 
try {
    val result : CreateEncryptionKey201Response = apiInstance.createEncryptionKey(createEncryptionKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncryptionApi#createEncryptionKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncryptionApi#createEncryptionKey")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createEncryptionKeyRequest** | [**CreateEncryptionKeyRequest**](CreateEncryptionKeyRequest.md)|  | |

### Return type

[**CreateEncryptionKey201Response**](CreateEncryptionKey201Response.md)

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

<a id="createEncryptionRecovery"></a>
# **createEncryptionRecovery**
> createEncryptionRecovery(createEncryptionRecoveryRequest)

Store an encryption recovery blob

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = EncryptionApi()
val createEncryptionRecoveryRequest : CreateEncryptionRecoveryRequest =  // CreateEncryptionRecoveryRequest | 
try {
    apiInstance.createEncryptionRecovery(createEncryptionRecoveryRequest)
} catch (e: ClientException) {
    println("4xx response calling EncryptionApi#createEncryptionRecovery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncryptionApi#createEncryptionRecovery")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createEncryptionRecoveryRequest** | [**CreateEncryptionRecoveryRequest**](CreateEncryptionRecoveryRequest.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a id="getEncryptionKey"></a>
# **getEncryptionKey**
> GetEncryptionKey200Response getEncryptionKey(email)

Get encryption key for a mailbox

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = EncryptionApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : GetEncryptionKey200Response = apiInstance.getEncryptionKey(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncryptionApi#getEncryptionKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncryptionApi#getEncryptionKey")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**GetEncryptionKey200Response**](GetEncryptionKey200Response.md)

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

<a id="rotateEncryptionKey"></a>
# **rotateEncryptionKey**
> rotateEncryptionKey(rotateEncryptionKeyRequest)

Rotate an encryption key

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = EncryptionApi()
val rotateEncryptionKeyRequest : RotateEncryptionKeyRequest =  // RotateEncryptionKeyRequest | 
try {
    apiInstance.rotateEncryptionKey(rotateEncryptionKeyRequest)
} catch (e: ClientException) {
    println("4xx response calling EncryptionApi#rotateEncryptionKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncryptionApi#rotateEncryptionKey")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rotateEncryptionKeyRequest** | [**RotateEncryptionKeyRequest**](RotateEncryptionKeyRequest.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

