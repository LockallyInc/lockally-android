# DomainsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1DomainsDomainDelete**](DomainsApi.md#v1DomainsDomainDelete) | **DELETE** /v1/domains/{domain} | Delete a domain |
| [**v1DomainsDomainGet**](DomainsApi.md#v1DomainsDomainGet) | **GET** /v1/domains/{domain} | Get a domain |
| [**v1DomainsDomainVerifyPost**](DomainsApi.md#v1DomainsDomainVerifyPost) | **POST** /v1/domains/{domain}/verify | Force-poll DNS verification |
| [**v1DomainsGet**](DomainsApi.md#v1DomainsGet) | **GET** /v1/domains | List domains |
| [**v1DomainsPost**](DomainsApi.md#v1DomainsPost) | **POST** /v1/domains | Register a domain |


<a id="v1DomainsDomainDelete"></a>
# **v1DomainsDomainDelete**
> v1DomainsDomainDelete(domain)

Delete a domain

Removes the domain registration. Refuses with 409 if any mailbox is still attached — delete the mailboxes first. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    apiInstance.v1DomainsDomainDelete(domain)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#v1DomainsDomainDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#v1DomainsDomainDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

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

<a id="v1DomainsDomainGet"></a>
# **v1DomainsDomainGet**
> Domain v1DomainsDomainGet(domain)

Get a domain

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : Domain = apiInstance.v1DomainsDomainGet(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#v1DomainsDomainGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#v1DomainsDomainGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

### Return type

[**Domain**](Domain.md)

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

<a id="v1DomainsDomainVerifyPost"></a>
# **v1DomainsDomainVerifyPost**
> Domain v1DomainsDomainVerifyPost(domain)

Force-poll DNS verification

Synchronously checks the &#x60;_lockally-verify.&lt;domain&gt;&#x60; TXT record against the stored verification token. Returns 200 either way: the returned &#x60;verified&#x60; boolean tells you whether DNS now confirms. Caller polls until &#x60;verified: true&#x60;. In v2 a background worker auto-polls and fires a &#x60;domain.verified&#x60; webhook. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : Domain = apiInstance.v1DomainsDomainVerifyPost(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#v1DomainsDomainVerifyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#v1DomainsDomainVerifyPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

### Return type

[**Domain**](Domain.md)

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

<a id="v1DomainsGet"></a>
# **v1DomainsGet**
> V1DomainsGet200Response v1DomainsGet()

List domains

Returns every domain registered under the calling tenant.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
try {
    val result : V1DomainsGet200Response = apiInstance.v1DomainsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#v1DomainsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#v1DomainsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1DomainsGet200Response**](V1DomainsGet200Response.md)

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

<a id="v1DomainsPost"></a>
# **v1DomainsPost**
> Domain v1DomainsPost(v1DomainsPostRequest)

Register a domain

Registers a new domain for the calling tenant. Generates a DKIM keypair and verification token. Returns DNS instructions the tenant must publish under their own DNS (verification TXT, SPF include, DKIM TXT, MX records to &#x60;mx1&#x60;/&#x60;mx2.lockally.com&#x60;, DMARC seed).  **Idempotent** — re-posting the same domain returns the existing record with the same DKIM keys and token (regenerating would break the tenant&#39;s published DNS). Returns 200 on idempotent hit, 201 on first create.  Returns 409 if the domain is already claimed by a different tenant. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val v1DomainsPostRequest : V1DomainsPostRequest =  // V1DomainsPostRequest | 
try {
    val result : Domain = apiInstance.v1DomainsPost(v1DomainsPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#v1DomainsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#v1DomainsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1DomainsPostRequest** | [**V1DomainsPostRequest**](V1DomainsPostRequest.md)|  | |

### Return type

[**Domain**](Domain.md)

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

