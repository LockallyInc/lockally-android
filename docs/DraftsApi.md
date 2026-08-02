# DraftsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1DraftsDraftIDApprovePost**](DraftsApi.md#v1DraftsDraftIDApprovePost) | **POST** /v1/drafts/{draftID}/approve | Approve a pending draft (human) |
| [**v1DraftsDraftIDCancelPost**](DraftsApi.md#v1DraftsDraftIDCancelPost) | **POST** /v1/drafts/{draftID}/cancel | Withdraw a pending draft |
| [**v1DraftsDraftIDGet**](DraftsApi.md#v1DraftsDraftIDGet) | **GET** /v1/drafts/{draftID} | Get a draft |
| [**v1DraftsDraftIDRejectPost**](DraftsApi.md#v1DraftsDraftIDRejectPost) | **POST** /v1/drafts/{draftID}/reject | Reject a pending draft (human) |
| [**v1DraftsGet**](DraftsApi.md#v1DraftsGet) | **GET** /v1/drafts | List drafts |
| [**v1InboxesMailboxDraftsPost**](DraftsApi.md#v1InboxesMailboxDraftsPost) | **POST** /v1/inboxes/{mailbox}/drafts | Propose a new conversation as a draft |
| [**v1ThreadsThreadIDDraftsPost**](DraftsApi.md#v1ThreadsThreadIDDraftsPost) | **POST** /v1/threads/{threadID}/drafts | Propose a reply as a draft |


<a id="v1DraftsDraftIDApprovePost"></a>
# **v1DraftsDraftIDApprovePost**
> kotlin.Any v1DraftsDraftIDApprovePost(draftID)

Approve a pending draft (human)

Sends the draft exactly as reviewed, through the agent stream (loop detector included). Fires draft.approved.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val draftID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1DraftsDraftIDApprovePost(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1DraftsDraftIDApprovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1DraftsDraftIDApprovePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1DraftsDraftIDCancelPost"></a>
# **v1DraftsDraftIDCancelPost**
> kotlin.Any v1DraftsDraftIDCancelPost(draftID)

Withdraw a pending draft

Only the API key that created the draft may cancel it.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val draftID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1DraftsDraftIDCancelPost(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1DraftsDraftIDCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1DraftsDraftIDCancelPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1DraftsDraftIDGet"></a>
# **v1DraftsDraftIDGet**
> kotlin.Any v1DraftsDraftIDGet(draftID)

Get a draft

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val draftID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1DraftsDraftIDGet(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1DraftsDraftIDGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1DraftsDraftIDGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1DraftsDraftIDRejectPost"></a>
# **v1DraftsDraftIDRejectPost**
> kotlin.Any v1DraftsDraftIDRejectPost(draftID)

Reject a pending draft (human)

Body: {\&quot;reason\&quot;: \&quot;...\&quot;} (optional). Fires draft.rejected.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val draftID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1DraftsDraftIDRejectPost(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1DraftsDraftIDRejectPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1DraftsDraftIDRejectPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1DraftsGet"></a>
# **v1DraftsGet**
> kotlin.Any v1DraftsGet(status, limit)

List drafts

Filter with ?status&#x3D;pending_approval|sent|rejected|cancelled. Keys see drafts of granted mailboxes; admin sessions see all.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val status : kotlin.String = status_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.v1DraftsGet(status, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1DraftsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1DraftsGet")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1InboxesMailboxDraftsPost"></a>
# **v1InboxesMailboxDraftsPost**
> kotlin.Any v1InboxesMailboxDraftsPost(mailbox, idempotencyKey)

Propose a new conversation as a draft

New-conversation drafts ALWAYS require human approval (policy flag new_thread). Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val mailbox : kotlin.String = mailbox_example // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.v1InboxesMailboxDraftsPost(mailbox, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1InboxesMailboxDraftsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1InboxesMailboxDraftsPost")
    e.printStackTrace()
}
```

### Parameters
| **mailbox** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

<a id="v1ThreadsThreadIDDraftsPost"></a>
# **v1ThreadsThreadIDDraftsPost**
> kotlin.Any v1ThreadsThreadIDDraftsPost(threadID, idempotencyKey)

Propose a reply as a draft

The safe default over /reply: the deterministic policy engine auto-sends clean in-thread replies and holds anything risky (PII, new recipients, injection-flagged threads, always-approve mailboxes) for human approval. Fires draft.pending_approval when held. Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDDraftsPost(threadID, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#v1ThreadsThreadIDDraftsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#v1ThreadsThreadIDDraftsPost")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

