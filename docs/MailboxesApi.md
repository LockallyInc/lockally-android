# MailboxesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addSharedMember**](MailboxesApi.md#addSharedMember) | **POST** /v1/mailboxes/{email}/members | Add a shared mailbox member |
| [**createMailbox**](MailboxesApi.md#createMailbox) | **POST** /v1/mailboxes | Create a mailbox |
| [**deleteMailbox**](MailboxesApi.md#deleteMailbox) | **DELETE** /v1/mailboxes/{email} | Soft-delete a mailbox |
| [**deleteVacationResponder**](MailboxesApi.md#deleteVacationResponder) | **DELETE** /v1/mailboxes/{email}/vacation | Remove the vacation responder |
| [**downloadMailboxExport**](MailboxesApi.md#downloadMailboxExport) | **GET** /v1/mailboxes/{email}/export/download | Download a previously-issued mailbox export |
| [**exportMailbox**](MailboxesApi.md#exportMailbox) | **POST** /v1/mailboxes/{email}/export | Request a mailbox export |
| [**getMailbox**](MailboxesApi.md#getMailbox) | **GET** /v1/mailboxes/{email} | Get a mailbox |
| [**getVacationResponder**](MailboxesApi.md#getVacationResponder) | **GET** /v1/mailboxes/{email}/vacation | Get the vacation responder |
| [**listMailboxes**](MailboxesApi.md#listMailboxes) | **GET** /v1/mailboxes | List mailboxes |
| [**listSharedMembers**](MailboxesApi.md#listSharedMembers) | **GET** /v1/mailboxes/{email}/members | List shared mailbox members |
| [**listVacationResponders**](MailboxesApi.md#listVacationResponders) | **GET** /v1/vacation | List all vacation responders |
| [**removeSharedMember**](MailboxesApi.md#removeSharedMember) | **DELETE** /v1/mailboxes/{email}/members/{memberEmail} | Remove a shared mailbox member |
| [**setVacationResponder**](MailboxesApi.md#setVacationResponder) | **PUT** /v1/mailboxes/{email}/vacation | Set the vacation responder |
| [**updateMailbox**](MailboxesApi.md#updateMailbox) | **PATCH** /v1/mailboxes/{email} | Update a mailbox |


<a id="addSharedMember"></a>
# **addSharedMember**
> SharedMember addSharedMember(email, addSharedMemberRequest)

Add a shared mailbox member

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val addSharedMemberRequest : AddSharedMemberRequest =  // AddSharedMemberRequest | 
try {
    val result : SharedMember = apiInstance.addSharedMember(email, addSharedMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#addSharedMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#addSharedMember")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addSharedMemberRequest** | [**AddSharedMemberRequest**](AddSharedMemberRequest.md)|  | |

### Return type

[**SharedMember**](SharedMember.md)

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

<a id="createMailbox"></a>
# **createMailbox**
> Mailbox createMailbox(createMailboxRequest)

Create a mailbox

Creates a mailbox on a tenant-verified domain. If &#x60;password&#x60; is omitted, lockally generates a 16-char password and returns it in the response — shown once.  **Gate.** The mailbox&#39;s domain must already be registered AND verified for this tenant (via &#x60;/v1/domains&#x60; + &#x60;/v1/domains/{domain}/verify&#x60;).  **Idempotent.** Re-posting the same email returns the existing mailbox UNTOUCHED — password is NOT regenerated. To change a password, use PATCH instead. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val createMailboxRequest : CreateMailboxRequest =  // CreateMailboxRequest | 
try {
    val result : Mailbox = apiInstance.createMailbox(createMailboxRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#createMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#createMailbox")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createMailboxRequest** | [**CreateMailboxRequest**](CreateMailboxRequest.md)|  | |

### Return type

[**Mailbox**](Mailbox.md)

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

<a id="deleteMailbox"></a>
# **deleteMailbox**
> deleteMailbox(email)

Soft-delete a mailbox

Sets &#x60;soft_deleted_at &#x3D; now()&#x60; and &#x60;hard_delete_after &#x3D; now() + 90d&#x60; per design D25. A background sweep (planned) will hard-delete after the window. The mailbox is also disabled immediately. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.deleteMailbox(email)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#deleteMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#deleteMailbox")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

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

<a id="deleteVacationResponder"></a>
# **deleteVacationResponder**
> deleteVacationResponder(email)

Remove the vacation responder

Idempotent — 204 whether or not a row existed.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.deleteVacationResponder(email)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#deleteVacationResponder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#deleteVacationResponder")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

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

<a id="downloadMailboxExport"></a>
# **downloadMailboxExport**
> java.io.File downloadMailboxExport(email, token)

Download a previously-issued mailbox export

Public endpoint (no Authorization header). Validates the one-shot token from the URL, marks it used, and streams an mbox file. Second GET with the same token returns 404 — tokens are single-use. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadMailboxExport(email, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#downloadMailboxExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#downloadMailboxExport")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **kotlin.String**|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="exportMailbox"></a>
# **exportMailbox**
> ExportMailbox201Response exportMailbox(email)

Request a mailbox export

Issues a one-shot \&quot;presigned\&quot; download URL for the mailbox&#39;s content in mbox format. The URL works without an Authorization header — the token in the query string is the authz. TTL is 5 minutes; the token is consumed on first GET.  **v1 caveat:** the synthesized mbox only contains outbound mail (from &#x60;lockally.messages&#x60;). v2 swaps in Stalwart&#39;s export primitive for full inbox + folder structure + flags. The endpoint contract stays unchanged.  **Scope changed:** this used to accept &#x60;mailboxes:read&#x60;. It takes any mailbox in the tenant and returns that mailbox&#39;s mail, so it now requires &#x60;tenant:admin&#x60;, matching &#x60;POST /v1/ediscovery/export&#x60;. A key scoped &#x60;mailboxes:read&#x60; gets 403 and has to be reissued; admin console sessions are unaffected. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : ExportMailbox201Response = apiInstance.exportMailbox(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#exportMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#exportMailbox")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**ExportMailbox201Response**](ExportMailbox201Response.md)

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

<a id="getMailbox"></a>
# **getMailbox**
> Mailbox getMailbox(email)

Get a mailbox

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : Mailbox = apiInstance.getMailbox(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#getMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#getMailbox")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**Mailbox**](Mailbox.md)

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

<a id="getVacationResponder"></a>
# **getVacationResponder**
> VacationResponder getVacationResponder(email)

Get the vacation responder

Returns the stored vacation rule or 404 if none is set.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : VacationResponder = apiInstance.getVacationResponder(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#getVacationResponder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#getVacationResponder")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**VacationResponder**](VacationResponder.md)

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

<a id="listMailboxes"></a>
# **listMailboxes**
> ListMailboxes200Response listMailboxes(limit)

List mailboxes

Returns mailboxes under the calling tenant — active and soft-deleted. &#x60;?limit&#x3D;N&#x60; between 1 and 200 (default 50). 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListMailboxes200Response = apiInstance.listMailboxes(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#listMailboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#listMailboxes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**ListMailboxes200Response**](ListMailboxes200Response.md)

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

<a id="listSharedMembers"></a>
# **listSharedMembers**
> ListSharedMembers200Response listSharedMembers(email)

List shared mailbox members

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : ListSharedMembers200Response = apiInstance.listSharedMembers(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#listSharedMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#listSharedMembers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**ListSharedMembers200Response**](ListSharedMembers200Response.md)

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

<a id="listVacationResponders"></a>
# **listVacationResponders**
> ListVacationResponders200Response listVacationResponders()

List all vacation responders

Returns every vacation responder for the calling tenant.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
try {
    val result : ListVacationResponders200Response = apiInstance.listVacationResponders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#listVacationResponders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#listVacationResponders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListVacationResponders200Response**](ListVacationResponders200Response.md)

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

<a id="removeSharedMember"></a>
# **removeSharedMember**
> removeSharedMember(email, memberEmail)

Remove a shared mailbox member

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val memberEmail : kotlin.String = memberEmail_example // kotlin.String | 
try {
    apiInstance.removeSharedMember(email, memberEmail)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#removeSharedMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#removeSharedMember")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **memberEmail** | **kotlin.String**|  | |

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

<a id="setVacationResponder"></a>
# **setVacationResponder**
> VacationResponder setVacationResponder(email, setVacationResponderRequest)

Set the vacation responder

Upsert — same endpoint creates or replaces the rule. Clears &#x60;synced_at&#x60;; the rule is staged on lockally until a sync worker pushes it to the mail server. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val setVacationResponderRequest : SetVacationResponderRequest =  // SetVacationResponderRequest | 
try {
    val result : VacationResponder = apiInstance.setVacationResponder(email, setVacationResponderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#setVacationResponder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#setVacationResponder")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setVacationResponderRequest** | [**SetVacationResponderRequest**](SetVacationResponderRequest.md)|  | |

### Return type

[**VacationResponder**](VacationResponder.md)

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

<a id="updateMailbox"></a>
# **updateMailbox**
> Mailbox updateMailbox(email, updateMailboxRequest)

Update a mailbox

Supply at least one of &#x60;password&#x60;, &#x60;quota_bytes&#x60;, &#x60;disabled&#x60;. Returns the updated mailbox. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val updateMailboxRequest : UpdateMailboxRequest =  // UpdateMailboxRequest | 
try {
    val result : Mailbox = apiInstance.updateMailbox(email, updateMailboxRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#updateMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#updateMailbox")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMailboxRequest** | [**UpdateMailboxRequest**](UpdateMailboxRequest.md)|  | |

### Return type

[**Mailbox**](Mailbox.md)

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

