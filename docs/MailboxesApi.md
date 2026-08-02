# MailboxesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addSharedMember**](MailboxesApi.md#addSharedMember) | **POST** /v1/mailboxes/{email}/members | Add a shared mailbox member |
| [**listSharedMembers**](MailboxesApi.md#listSharedMembers) | **GET** /v1/mailboxes/{email}/members | List shared mailbox members |
| [**removeSharedMember**](MailboxesApi.md#removeSharedMember) | **DELETE** /v1/mailboxes/{email}/members/{memberEmail} | Remove a shared mailbox member |
| [**v1MailboxesEmailDelete**](MailboxesApi.md#v1MailboxesEmailDelete) | **DELETE** /v1/mailboxes/{email} | Soft-delete a mailbox |
| [**v1MailboxesEmailExportDownloadGet**](MailboxesApi.md#v1MailboxesEmailExportDownloadGet) | **GET** /v1/mailboxes/{email}/export/download | Download a previously-issued mailbox export |
| [**v1MailboxesEmailExportPost**](MailboxesApi.md#v1MailboxesEmailExportPost) | **POST** /v1/mailboxes/{email}/export | Request a mailbox export |
| [**v1MailboxesEmailGet**](MailboxesApi.md#v1MailboxesEmailGet) | **GET** /v1/mailboxes/{email} | Get a mailbox |
| [**v1MailboxesEmailPatch**](MailboxesApi.md#v1MailboxesEmailPatch) | **PATCH** /v1/mailboxes/{email} | Update a mailbox |
| [**v1MailboxesEmailVacationDelete**](MailboxesApi.md#v1MailboxesEmailVacationDelete) | **DELETE** /v1/mailboxes/{email}/vacation | Remove the vacation responder |
| [**v1MailboxesEmailVacationGet**](MailboxesApi.md#v1MailboxesEmailVacationGet) | **GET** /v1/mailboxes/{email}/vacation | Get the vacation responder |
| [**v1MailboxesEmailVacationPut**](MailboxesApi.md#v1MailboxesEmailVacationPut) | **PUT** /v1/mailboxes/{email}/vacation | Set the vacation responder |
| [**v1MailboxesGet**](MailboxesApi.md#v1MailboxesGet) | **GET** /v1/mailboxes | List mailboxes |
| [**v1MailboxesPost**](MailboxesApi.md#v1MailboxesPost) | **POST** /v1/mailboxes | Create a mailbox |
| [**v1VacationGet**](MailboxesApi.md#v1VacationGet) | **GET** /v1/vacation | List all vacation responders |


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

<a id="v1MailboxesEmailDelete"></a>
# **v1MailboxesEmailDelete**
> v1MailboxesEmailDelete(email)

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
    apiInstance.v1MailboxesEmailDelete(email)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailDelete")
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

<a id="v1MailboxesEmailExportDownloadGet"></a>
# **v1MailboxesEmailExportDownloadGet**
> java.io.File v1MailboxesEmailExportDownloadGet(email, token)

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
    val result : java.io.File = apiInstance.v1MailboxesEmailExportDownloadGet(email, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailExportDownloadGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailExportDownloadGet")
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

<a id="v1MailboxesEmailExportPost"></a>
# **v1MailboxesEmailExportPost**
> V1MailboxesEmailExportPost201Response v1MailboxesEmailExportPost(email)

Request a mailbox export

Issues a one-shot \&quot;presigned\&quot; download URL for the mailbox&#39;s content in mbox format. The URL works without an Authorization header — the token in the query string is the authz. TTL is 5 minutes; the token is consumed on first GET.  **v1 caveat:** the synthesized mbox only contains outbound mail (from &#x60;lockally.messages&#x60;). v2 swaps in Stalwart&#39;s export primitive for full inbox + folder structure + flags. The endpoint contract stays unchanged. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : V1MailboxesEmailExportPost201Response = apiInstance.v1MailboxesEmailExportPost(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailExportPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailExportPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**V1MailboxesEmailExportPost201Response**](V1MailboxesEmailExportPost201Response.md)

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

<a id="v1MailboxesEmailGet"></a>
# **v1MailboxesEmailGet**
> Mailbox v1MailboxesEmailGet(email)

Get a mailbox

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : Mailbox = apiInstance.v1MailboxesEmailGet(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailGet")
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

<a id="v1MailboxesEmailPatch"></a>
# **v1MailboxesEmailPatch**
> Mailbox v1MailboxesEmailPatch(email, v1MailboxesEmailPatchRequest)

Update a mailbox

Supply at least one of &#x60;password&#x60;, &#x60;quota_bytes&#x60;, &#x60;disabled&#x60;. Returns the updated mailbox. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val v1MailboxesEmailPatchRequest : V1MailboxesEmailPatchRequest =  // V1MailboxesEmailPatchRequest | 
try {
    val result : Mailbox = apiInstance.v1MailboxesEmailPatch(email, v1MailboxesEmailPatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailPatch")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1MailboxesEmailPatchRequest** | [**V1MailboxesEmailPatchRequest**](V1MailboxesEmailPatchRequest.md)|  | |

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

<a id="v1MailboxesEmailVacationDelete"></a>
# **v1MailboxesEmailVacationDelete**
> v1MailboxesEmailVacationDelete(email)

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
    apiInstance.v1MailboxesEmailVacationDelete(email)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailVacationDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailVacationDelete")
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

<a id="v1MailboxesEmailVacationGet"></a>
# **v1MailboxesEmailVacationGet**
> VacationResponder v1MailboxesEmailVacationGet(email)

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
    val result : VacationResponder = apiInstance.v1MailboxesEmailVacationGet(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailVacationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailVacationGet")
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

<a id="v1MailboxesEmailVacationPut"></a>
# **v1MailboxesEmailVacationPut**
> VacationResponder v1MailboxesEmailVacationPut(email, v1MailboxesEmailVacationPutRequest)

Set the vacation responder

Upsert — same endpoint creates or replaces the rule. Clears &#x60;synced_at&#x60;; the rule is staged on lockally until a sync worker pushes it to the mail server. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val email : kotlin.String = email_example // kotlin.String | 
val v1MailboxesEmailVacationPutRequest : V1MailboxesEmailVacationPutRequest =  // V1MailboxesEmailVacationPutRequest | 
try {
    val result : VacationResponder = apiInstance.v1MailboxesEmailVacationPut(email, v1MailboxesEmailVacationPutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesEmailVacationPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesEmailVacationPut")
    e.printStackTrace()
}
```

### Parameters
| **email** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1MailboxesEmailVacationPutRequest** | [**V1MailboxesEmailVacationPutRequest**](V1MailboxesEmailVacationPutRequest.md)|  | |

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

<a id="v1MailboxesGet"></a>
# **v1MailboxesGet**
> V1MailboxesGet200Response v1MailboxesGet(limit)

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
    val result : V1MailboxesGet200Response = apiInstance.v1MailboxesGet(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**V1MailboxesGet200Response**](V1MailboxesGet200Response.md)

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

<a id="v1MailboxesPost"></a>
# **v1MailboxesPost**
> Mailbox v1MailboxesPost(v1MailboxesPostRequest)

Create a mailbox

Creates a mailbox on a tenant-verified domain. If &#x60;password&#x60; is omitted, lockally generates a 16-char password and returns it in the response — shown once.  **Gate.** The mailbox&#39;s domain must already be registered AND verified for this tenant (via &#x60;/v1/domains&#x60; + &#x60;/v1/domains/{domain}/verify&#x60;).  **Idempotent.** Re-posting the same email returns the existing mailbox UNTOUCHED — password is NOT regenerated. To change a password, use PATCH instead. 

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
val v1MailboxesPostRequest : V1MailboxesPostRequest =  // V1MailboxesPostRequest | 
try {
    val result : Mailbox = apiInstance.v1MailboxesPost(v1MailboxesPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1MailboxesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1MailboxesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1MailboxesPostRequest** | [**V1MailboxesPostRequest**](V1MailboxesPostRequest.md)|  | |

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

<a id="v1VacationGet"></a>
# **v1VacationGet**
> V1VacationGet200Response v1VacationGet()

List all vacation responders

Returns every vacation responder for the calling tenant.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MailboxesApi()
try {
    val result : V1VacationGet200Response = apiInstance.v1VacationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailboxesApi#v1VacationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailboxesApi#v1VacationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1VacationGet200Response**](V1VacationGet200Response.md)

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

