
# Draft

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **mailboxId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **to** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **policyFlags** | [**PolicyFlags**](PolicyFlags.md) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **mailbox** | **kotlin.String** |  |  [optional] |
| **threadId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **subject** | **kotlin.String** |  |  [optional] |
| **bodyText** | **kotlin.String** |  |  [optional] |
| **reviewedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **sentMessageId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | pending_approval, sent, rejected, cancelled |



