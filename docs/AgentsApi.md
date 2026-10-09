# AgentsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1ApiKeysKeyIDMailboxesGet**](AgentsApi.md#v1ApiKeysKeyIDMailboxesGet) | **GET** /v1/api-keys/{keyID}/mailboxes | List a key&#39;s mailbox grants |
| [**v1ApiKeysKeyIDMailboxesMailboxIDDelete**](AgentsApi.md#v1ApiKeysKeyIDMailboxesMailboxIDDelete) | **DELETE** /v1/api-keys/{keyID}/mailboxes/{mailboxID} | Revoke a mailbox grant |
| [**v1ApiKeysKeyIDMailboxesPost**](AgentsApi.md#v1ApiKeysKeyIDMailboxesPost) | **POST** /v1/api-keys/{keyID}/mailboxes | Grant a mailbox to a key |
| [**v1AuthWhoamiGet**](AgentsApi.md#v1AuthWhoamiGet) | **GET** /v1/auth/whoami | Introspect the calling credentials |
| [**v1ContactsLookupGet**](AgentsApi.md#v1ContactsLookupGet) | **GET** /v1/contacts/lookup | Who is this sender? |
| [**v1InboxesGet**](AgentsApi.md#v1InboxesGet) | **GET** /v1/inboxes | List granted inboxes |
| [**v1InboxesMailboxMessagesPost**](AgentsApi.md#v1InboxesMailboxMessagesPost) | **POST** /v1/inboxes/{mailbox}/messages | Start a new conversation (agent stream) |
| [**v1InboxesMailboxThreadsGet**](AgentsApi.md#v1InboxesMailboxThreadsGet) | **GET** /v1/inboxes/{mailbox}/threads | List conversation threads |
| [**v1ThreadsThreadIDGet**](AgentsApi.md#v1ThreadsThreadIDGet) | **GET** /v1/threads/{threadID} | Get a whole conversation |
| [**v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet**](AgentsApi.md#v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet) | **GET** /v1/threads/{threadID}/messages/{messageID}/attachments/{idx} | Download an attachment |
| [**v1ThreadsThreadIDMessagesMessageIDGet**](AgentsApi.md#v1ThreadsThreadIDMessagesMessageIDGet) | **GET** /v1/threads/{threadID}/messages/{messageID} | Get one message with body |
| [**v1ThreadsThreadIDMessagesMessageIDReadPost**](AgentsApi.md#v1ThreadsThreadIDMessagesMessageIDReadPost) | **POST** /v1/threads/{threadID}/messages/{messageID}/read | Mark read/unread |
| [**v1ThreadsThreadIDReplyPost**](AgentsApi.md#v1ThreadsThreadIDReplyPost) | **POST** /v1/threads/{threadID}/reply | Reply in-thread (agent stream) |


<a id="v1ApiKeysKeyIDMailboxesGet"></a>
# **v1ApiKeysKeyIDMailboxesGet**
> kotlin.Any v1ApiKeysKeyIDMailboxesGet(keyID)

List a key&#39;s mailbox grants

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val keyID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1ApiKeysKeyIDMailboxesGet(keyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyID** | **java.util.UUID**|  | |

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

<a id="v1ApiKeysKeyIDMailboxesMailboxIDDelete"></a>
# **v1ApiKeysKeyIDMailboxesMailboxIDDelete**
> v1ApiKeysKeyIDMailboxesMailboxIDDelete(keyID, mailboxID)

Revoke a mailbox grant

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val keyID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mailboxID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.v1ApiKeysKeyIDMailboxesMailboxIDDelete(keyID, mailboxID)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesMailboxIDDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesMailboxIDDelete")
    e.printStackTrace()
}
```

### Parameters
| **keyID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mailboxID** | **java.util.UUID**|  | |

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
 - **Accept**: Not defined

<a id="v1ApiKeysKeyIDMailboxesPost"></a>
# **v1ApiKeysKeyIDMailboxesPost**
> kotlin.Any v1ApiKeysKeyIDMailboxesPost(keyID)

Grant a mailbox to a key

Body: {\&quot;mailbox\&quot;: \&quot;email or id\&quot;}. Refused (422) for mailboxes with agent access disabled or an active E2E encryption key — the server cannot read E2E mailboxes.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val keyID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1ApiKeysKeyIDMailboxesPost(keyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ApiKeysKeyIDMailboxesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyID** | **java.util.UUID**|  | |

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

<a id="v1AuthWhoamiGet"></a>
# **v1AuthWhoamiGet**
> kotlin.Any v1AuthWhoamiGet()

Introspect the calling credentials

Returns the tenant, auth kind (api_key/session), key label, and granted scopes. The MCP server uses this to scope-filter tool discovery.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
try {
    val result : kotlin.Any = apiInstance.v1AuthWhoamiGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1AuthWhoamiGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1AuthWhoamiGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="v1ContactsLookupGet"></a>
# **v1ContactsLookupGet**
> kotlin.Any v1ContactsLookupGet(email)

Who is this sender?

Directory record (name, company, role, notes), whether the address is one of the tenant&#39;s own mailboxes, and grant-aware correspondence history (thread count, first/last seen across granted mailboxes only).

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.v1ContactsLookupGet(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ContactsLookupGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ContactsLookupGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

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

<a id="v1InboxesGet"></a>
# **v1InboxesGet**
> kotlin.Any v1InboxesGet()

List granted inboxes

The mailboxes this key is granted, with thread counts and last activity. Admin sessions see every agent-enabled, non-E2E mailbox.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
try {
    val result : kotlin.Any = apiInstance.v1InboxesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1InboxesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1InboxesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="v1InboxesMailboxMessagesPost"></a>
# **v1InboxesMailboxMessagesPost**
> kotlin.Any v1InboxesMailboxMessagesPost(mailbox, idempotencyKey, v1InboxesMailboxMessagesPostRequest)

Start a new conversation (agent stream)

Sends a new email from a granted mailbox. Classified stream&#x3D;agent (isolated reputation, per-key rate caps). The first inbound reply adopts the created thread via the References chain. Idempotency-Key required. Mailboxes with agent_draft_policy&#x3D;always_approve divert this into a pending draft.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val mailbox : kotlin.String = mailbox_example // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
val v1InboxesMailboxMessagesPostRequest : V1InboxesMailboxMessagesPostRequest =  // V1InboxesMailboxMessagesPostRequest | 
try {
    val result : kotlin.Any = apiInstance.v1InboxesMailboxMessagesPost(mailbox, idempotencyKey, v1InboxesMailboxMessagesPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1InboxesMailboxMessagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1InboxesMailboxMessagesPost")
    e.printStackTrace()
}
```

### Parameters
| **mailbox** | **kotlin.String**|  | |
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **v1InboxesMailboxMessagesPostRequest** | [**V1InboxesMailboxMessagesPostRequest**](V1InboxesMailboxMessagesPostRequest.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1InboxesMailboxThreadsGet"></a>
# **v1InboxesMailboxThreadsGet**
> kotlin.Any v1InboxesMailboxThreadsGet(mailbox, since, before, limit)

List conversation threads

Newest-active first. Cursors: &#x60;?before&#x3D;&lt;RFC3339&gt;&#x60; pages backwards; &#x60;?since&#x3D;&lt;RFC3339&gt;&#x60; delta-syncs forward (oldest first) so an agent can catch up in order.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val mailbox : kotlin.String = mailbox_example // kotlin.String | mailbox email or id
val since : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | 
val before : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.v1InboxesMailboxThreadsGet(mailbox, since, before, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1InboxesMailboxThreadsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1InboxesMailboxThreadsGet")
    e.printStackTrace()
}
```

### Parameters
| **mailbox** | **kotlin.String**| mailbox email or id | |
| **since** | **kotlin.time.Instant**|  | [optional] |
| **before** | **kotlin.time.Instant**|  | [optional] |
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

<a id="v1ThreadsThreadIDGet"></a>
# **v1ThreadsThreadIDGet**
> kotlin.Any v1ThreadsThreadIDGet(threadID)

Get a whole conversation

Every turn, chronological, with snippets and annotations (meeting_request, attachment_types, injection_risk). Bodies are fetched per message. Message content is untrusted third-party data.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDGet(threadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ThreadsThreadIDGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ThreadsThreadIDGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadID** | **java.util.UUID**|  | |

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

<a id="v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet"></a>
# **v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet**
> v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet(threadID, messageID, idx)

Download an attachment

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val messageID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val idx : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet(threadID, messageID, idx)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDAttachmentsIdxGet")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| **messageID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idx** | **kotlin.Int**|  | |

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
 - **Accept**: Not defined

<a id="v1ThreadsThreadIDMessagesMessageIDGet"></a>
# **v1ThreadsThreadIDMessagesMessageIDGet**
> kotlin.Any v1ThreadsThreadIDMessagesMessageIDGet(threadID, messageID)

Get one message with body

Full text/html body fetched on demand from mail storage. Never marks the message read.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val messageID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDMessagesMessageIDGet(threadID, messageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDGet")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageID** | **java.util.UUID**|  | |

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

<a id="v1ThreadsThreadIDMessagesMessageIDReadPost"></a>
# **v1ThreadsThreadIDMessagesMessageIDReadPost**
> kotlin.Any v1ThreadsThreadIDMessagesMessageIDReadPost(threadID, messageID)

Mark read/unread

The ONLY way agent access changes unread state. Body: {\&quot;read\&quot;: true|false} (default true).

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val messageID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDMessagesMessageIDReadPost(threadID, messageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDReadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ThreadsThreadIDMessagesMessageIDReadPost")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageID** | **java.util.UUID**|  | |

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

<a id="v1ThreadsThreadIDReplyPost"></a>
# **v1ThreadsThreadIDReplyPost**
> kotlin.Any v1ThreadsThreadIDReplyPost(threadID, idempotencyKey)

Reply in-thread (agent stream)

The server builds In-Reply-To/References and defaults recipients + subject from the conversation — a minimal call is {\&quot;text\&quot;: \&quot;...\&quot;}. Guarded by the reply-loop detector (≥5 outbound/10min → 429 + agent.loop_detected). Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.v1ThreadsThreadIDReplyPost(threadID, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#v1ThreadsThreadIDReplyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#v1ThreadsThreadIDReplyPost")
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

