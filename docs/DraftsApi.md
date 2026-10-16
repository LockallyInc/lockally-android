# DraftsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**approveDraft**](DraftsApi.md#approveDraft) | **POST** /v1/drafts/{draftID}/approve | Approve a pending draft (human) |
| [**cancelDraft**](DraftsApi.md#cancelDraft) | **POST** /v1/drafts/{draftID}/cancel | Withdraw a pending draft |
| [**createConversationDraft**](DraftsApi.md#createConversationDraft) | **POST** /v1/inboxes/{mailbox}/drafts | Propose a new conversation as a draft |
| [**createReplyDraft**](DraftsApi.md#createReplyDraft) | **POST** /v1/threads/{threadID}/drafts | Propose a reply as a draft |
| [**getDraft**](DraftsApi.md#getDraft) | **GET** /v1/drafts/{draftID} | Get a draft |
| [**listDrafts**](DraftsApi.md#listDrafts) | **GET** /v1/drafts | List drafts |
| [**rejectDraft**](DraftsApi.md#rejectDraft) | **POST** /v1/drafts/{draftID}/reject | Reject a pending draft (human) |


<a id="approveDraft"></a>
# **approveDraft**
> DraftResult approveDraft(draftID)

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
    val result : DraftResult = apiInstance.approveDraft(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#approveDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#approveDraft")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**DraftResult**](DraftResult.md)

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

<a id="cancelDraft"></a>
# **cancelDraft**
> Draft cancelDraft(draftID)

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
    val result : Draft = apiInstance.cancelDraft(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#cancelDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#cancelDraft")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**Draft**](Draft.md)

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

<a id="createConversationDraft"></a>
# **createConversationDraft**
> DraftResult createConversationDraft(mailbox, idempotencyKey)

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
    val result : DraftResult = apiInstance.createConversationDraft(mailbox, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#createConversationDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#createConversationDraft")
    e.printStackTrace()
}
```

### Parameters
| **mailbox** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey** | **kotlin.String**|  | |

### Return type

[**DraftResult**](DraftResult.md)

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

<a id="createReplyDraft"></a>
# **createReplyDraft**
> DraftResult createReplyDraft(threadID, idempotencyKey)

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
    val result : DraftResult = apiInstance.createReplyDraft(threadID, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#createReplyDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#createReplyDraft")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey** | **kotlin.String**|  | |

### Return type

[**DraftResult**](DraftResult.md)

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

<a id="getDraft"></a>
# **getDraft**
> Draft getDraft(draftID)

Get a draft

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DraftsApi()
val draftID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Draft = apiInstance.getDraft(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#getDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#getDraft")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**Draft**](Draft.md)

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

<a id="listDrafts"></a>
# **listDrafts**
> DraftList listDrafts(status, limit)

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
    val result : DraftList = apiInstance.listDrafts(status, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#listDrafts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#listDrafts")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**DraftList**](DraftList.md)

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

<a id="rejectDraft"></a>
# **rejectDraft**
> Draft rejectDraft(draftID)

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
    val result : Draft = apiInstance.rejectDraft(draftID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#rejectDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#rejectDraft")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **draftID** | **java.util.UUID**|  | |

### Return type

[**Draft**](Draft.md)

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

