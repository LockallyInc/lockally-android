# AgentsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**downloadThreadAttachment**](AgentsApi.md#downloadThreadAttachment) | **GET** /v1/threads/{threadID}/messages/{messageID}/attachments/{idx} | Download an attachment |
| [**getThread**](AgentsApi.md#getThread) | **GET** /v1/threads/{threadID} | Get a whole conversation |
| [**getThreadMessage**](AgentsApi.md#getThreadMessage) | **GET** /v1/threads/{threadID}/messages/{messageID} | Get one message with body |
| [**grantApiKeyMailbox**](AgentsApi.md#grantApiKeyMailbox) | **POST** /v1/api-keys/{keyID}/mailboxes | Grant a mailbox to a key |
| [**listApiKeyMailboxes**](AgentsApi.md#listApiKeyMailboxes) | **GET** /v1/api-keys/{keyID}/mailboxes | List a key&#39;s mailbox grants |
| [**listInboxes**](AgentsApi.md#listInboxes) | **GET** /v1/inboxes | List granted inboxes |
| [**listThreads**](AgentsApi.md#listThreads) | **GET** /v1/inboxes/{mailbox}/threads | List conversation threads |
| [**lookupContact**](AgentsApi.md#lookupContact) | **GET** /v1/contacts/lookup | Who is this sender? |
| [**markThreadMessageRead**](AgentsApi.md#markThreadMessageRead) | **POST** /v1/threads/{threadID}/messages/{messageID}/read | Mark read/unread |
| [**replyToThread**](AgentsApi.md#replyToThread) | **POST** /v1/threads/{threadID}/reply | Reply in-thread (agent stream) |
| [**revokeApiKeyMailbox**](AgentsApi.md#revokeApiKeyMailbox) | **DELETE** /v1/api-keys/{keyID}/mailboxes/{mailboxID} | Revoke a mailbox grant |
| [**startConversation**](AgentsApi.md#startConversation) | **POST** /v1/inboxes/{mailbox}/messages | Start a new conversation (agent stream) |
| [**whoami**](AgentsApi.md#whoami) | **GET** /v1/auth/whoami | Introspect the calling credentials |


<a id="downloadThreadAttachment"></a>
# **downloadThreadAttachment**
> downloadThreadAttachment(threadID, messageID, idx)

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
    apiInstance.downloadThreadAttachment(threadID, messageID, idx)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#downloadThreadAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#downloadThreadAttachment")
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

<a id="getThread"></a>
# **getThread**
> Thread getThread(threadID)

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
    val result : Thread = apiInstance.getThread(threadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#getThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#getThread")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadID** | **java.util.UUID**|  | |

### Return type

[**Thread**](Thread.md)

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

<a id="getThreadMessage"></a>
# **getThreadMessage**
> ThreadMessageBody getThreadMessage(threadID, messageID)

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
    val result : ThreadMessageBody = apiInstance.getThreadMessage(threadID, messageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#getThreadMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#getThreadMessage")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageID** | **java.util.UUID**|  | |

### Return type

[**ThreadMessageBody**](ThreadMessageBody.md)

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

<a id="grantApiKeyMailbox"></a>
# **grantApiKeyMailbox**
> MailboxGrant grantApiKeyMailbox(keyID)

Grant a mailbox to a key

Body: {\&quot;mailbox\&quot;: \&quot;email or id\&quot;}. Refused (422) for mailboxes with agent access disabled or an active E2E encryption key, the server cannot read E2E mailboxes.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val keyID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MailboxGrant = apiInstance.grantApiKeyMailbox(keyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#grantApiKeyMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#grantApiKeyMailbox")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyID** | **java.util.UUID**|  | |

### Return type

[**MailboxGrant**](MailboxGrant.md)

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

<a id="listApiKeyMailboxes"></a>
# **listApiKeyMailboxes**
> MailboxGrantList listApiKeyMailboxes(keyID)

List a key&#39;s mailbox grants

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val keyID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MailboxGrantList = apiInstance.listApiKeyMailboxes(keyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#listApiKeyMailboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#listApiKeyMailboxes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyID** | **java.util.UUID**|  | |

### Return type

[**MailboxGrantList**](MailboxGrantList.md)

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

<a id="listInboxes"></a>
# **listInboxes**
> InboxList listInboxes()

List granted inboxes

The mailboxes this key is granted, with thread counts and last activity. Admin sessions see every agent-enabled, non-E2E mailbox.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
try {
    val result : InboxList = apiInstance.listInboxes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#listInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#listInboxes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InboxList**](InboxList.md)

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

<a id="listThreads"></a>
# **listThreads**
> ThreadList listThreads(mailbox, since, before, limit)

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
    val result : ThreadList = apiInstance.listThreads(mailbox, since, before, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#listThreads")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#listThreads")
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

[**ThreadList**](ThreadList.md)

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

<a id="lookupContact"></a>
# **lookupContact**
> ContactLookup lookupContact(email)

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
    val result : ContactLookup = apiInstance.lookupContact(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#lookupContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#lookupContact")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **kotlin.String**|  | |

### Return type

[**ContactLookup**](ContactLookup.md)

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

<a id="markThreadMessageRead"></a>
# **markThreadMessageRead**
> MarkReadResult markThreadMessageRead(threadID, messageID)

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
    val result : MarkReadResult = apiInstance.markThreadMessageRead(threadID, messageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#markThreadMessageRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#markThreadMessageRead")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageID** | **java.util.UUID**|  | |

### Return type

[**MarkReadResult**](MarkReadResult.md)

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

<a id="replyToThread"></a>
# **replyToThread**
> AgentSendResult replyToThread(threadID, idempotencyKey)

Reply in-thread (agent stream)

The server builds In-Reply-To/References and defaults recipients + subject from the conversation, a minimal call is {\&quot;text\&quot;: \&quot;...\&quot;}. Guarded by the reply-loop detector (≥5 outbound/10min → 429 + agent.loop_detected). Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
val threadID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 
try {
    val result : AgentSendResult = apiInstance.replyToThread(threadID, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#replyToThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#replyToThread")
    e.printStackTrace()
}
```

### Parameters
| **threadID** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey** | **kotlin.String**|  | |

### Return type

[**AgentSendResult**](AgentSendResult.md)

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

<a id="revokeApiKeyMailbox"></a>
# **revokeApiKeyMailbox**
> revokeApiKeyMailbox(keyID, mailboxID)

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
    apiInstance.revokeApiKeyMailbox(keyID, mailboxID)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#revokeApiKeyMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#revokeApiKeyMailbox")
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

<a id="startConversation"></a>
# **startConversation**
> AgentSendResult startConversation(mailbox, idempotencyKey, startConversationRequest)

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
val startConversationRequest : StartConversationRequest =  // StartConversationRequest | 
try {
    val result : AgentSendResult = apiInstance.startConversation(mailbox, idempotencyKey, startConversationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#startConversation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#startConversation")
    e.printStackTrace()
}
```

### Parameters
| **mailbox** | **kotlin.String**|  | |
| **idempotencyKey** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startConversationRequest** | [**StartConversationRequest**](StartConversationRequest.md)|  | |

### Return type

[**AgentSendResult**](AgentSendResult.md)

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

<a id="whoami"></a>
# **whoami**
> Whoami whoami()

Introspect the calling credentials

Returns the tenant, auth kind (api_key/session), key label, and granted scopes. The MCP server uses this to scope-filter tool discovery.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AgentsApi()
try {
    val result : Whoami = apiInstance.whoami()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AgentsApi#whoami")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AgentsApi#whoami")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Whoami**](Whoami.md)

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

