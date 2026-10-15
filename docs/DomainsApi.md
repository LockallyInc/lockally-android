# DomainsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDomain**](DomainsApi.md#createDomain) | **POST** /v1/domains | Register a domain |
| [**deleteDomain**](DomainsApi.md#deleteDomain) | **DELETE** /v1/domains/{domain} | Delete a domain |
| [**disableReturnPath**](DomainsApi.md#disableReturnPath) | **DELETE** /v1/domains/{domain}/return-path | Turn off the custom Return-Path |
| [**enableReturnPath**](DomainsApi.md#enableReturnPath) | **POST** /v1/domains/{domain}/return-path | Turn on the custom Return-Path |
| [**getDomain**](DomainsApi.md#getDomain) | **GET** /v1/domains/{domain} | Get a domain |
| [**getReturnPath**](DomainsApi.md#getReturnPath) | **GET** /v1/domains/{domain}/return-path | Get the custom Return-Path |
| [**listDomains**](DomainsApi.md#listDomains) | **GET** /v1/domains | List domains |
| [**verifyDomain**](DomainsApi.md#verifyDomain) | **POST** /v1/domains/{domain}/verify | Force-poll DNS verification |
| [**verifyReturnPath**](DomainsApi.md#verifyReturnPath) | **POST** /v1/domains/{domain}/return-path/verify | Check the custom Return-Path records |


<a id="createDomain"></a>
# **createDomain**
> Domain createDomain(createDomainRequest)

Register a domain

Registers a new domain for the calling tenant. Generates a DKIM keypair and verification token. Returns DNS instructions the tenant must publish under their own DNS (verification TXT, SPF include, DKIM TXT, MX records to &#x60;mx1&#x60;/&#x60;mx2.lockally.com&#x60;, DMARC seed).  **Idempotent** — re-posting the same domain returns the existing record with the same DKIM keys and token (regenerating would break the tenant&#39;s published DNS). Returns 200 on idempotent hit, 201 on first create.  Returns 409 if the domain is already claimed by a different tenant. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val createDomainRequest : CreateDomainRequest =  // CreateDomainRequest | 
try {
    val result : Domain = apiInstance.createDomain(createDomainRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#createDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#createDomain")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createDomainRequest** | [**CreateDomainRequest**](CreateDomainRequest.md)|  | |

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

<a id="deleteDomain"></a>
# **deleteDomain**
> deleteDomain(domain)

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
    apiInstance.deleteDomain(domain)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#deleteDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#deleteDomain")
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

<a id="disableReturnPath"></a>
# **disableReturnPath**
> disableReturnPath(domain)

Turn off the custom Return-Path

API mail uses the sender&#39;s own address as the envelope sender again, from the next message. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    apiInstance.disableReturnPath(domain)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#disableReturnPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#disableReturnPath")
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

<a id="enableReturnPath"></a>
# **enableReturnPath**
> ReturnPath enableReturnPath(domain)

Turn on the custom Return-Path

Moves it to &#x60;pending&#x60; and returns the two records to publish on &#x60;bounces.&lt;domain&gt;&#x60;. Nothing changes for mail until they are confirmed with the verify call. The domain must be verified. Available on every plan except Free. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : ReturnPath = apiInstance.enableReturnPath(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#enableReturnPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#enableReturnPath")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

### Return type

[**ReturnPath**](ReturnPath.md)

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

<a id="getDomain"></a>
# **getDomain**
> Domain getDomain(domain)

Get a domain

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : Domain = apiInstance.getDomain(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getDomain")
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

<a id="getReturnPath"></a>
# **getReturnPath**
> ReturnPath getReturnPath(domain)

Get the custom Return-Path

A custom Return-Path moves the envelope sender of mail sent through the API from this domain onto &#x60;bounces.&lt;domain&gt;&#x60;. Bounce reports then come back to Lockally instead of the sending mailbox, and a bounce that arrives after delivery marks the message bounced, suppresses the address and fires &#x60;delivery.bounced&#x60;. Mail sent from webmail or mail apps is not affected. DKIM stays signed by the domain itself. &#x60;status&#x60; is &#x60;off&#x60;, &#x60;pending&#x60; (records not confirmed yet) or &#x60;active&#x60;. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : ReturnPath = apiInstance.getReturnPath(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getReturnPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getReturnPath")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

### Return type

[**ReturnPath**](ReturnPath.md)

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

<a id="listDomains"></a>
# **listDomains**
> ListDomains200Response listDomains()

List domains

Returns every domain registered under the calling tenant.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
try {
    val result : ListDomains200Response = apiInstance.listDomains()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#listDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#listDomains")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDomains200Response**](ListDomains200Response.md)

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

<a id="verifyDomain"></a>
# **verifyDomain**
> Domain verifyDomain(domain)

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
    val result : Domain = apiInstance.verifyDomain(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#verifyDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#verifyDomain")
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

<a id="verifyReturnPath"></a>
# **verifyReturnPath**
> ReturnPath verifyReturnPath(domain)

Check the custom Return-Path records

Looks up the MX and SPF records on &#x60;bounces.&lt;domain&gt;&#x60;. Returns 200 either way: while a record is missing the status stays &#x60;pending&#x60; and &#x60;check&#x60; says which one. Once both are found the Return-Path becomes &#x60;active&#x60; and the send path starts using it. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DomainsApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : ReturnPath = apiInstance.verifyReturnPath(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#verifyReturnPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#verifyReturnPath")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | |

### Return type

[**ReturnPath**](ReturnPath.md)

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

