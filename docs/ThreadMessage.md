
# ThreadMessage

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **direction** | [**inline**](#Direction) |  |  |
| **rfcMessageId** | **kotlin.String** | The Internet Message-ID |  |
| **from** | **kotlin.String** |  |  |
| **to** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **hasAttachments** | **kotlin.Boolean** |  |  |
| **receivedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **inReplyTo** | **kotlin.String** |  |  [optional] |
| **subject** | **kotlin.String** |  |  [optional] |
| **snippet** | **kotlin.String** |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;Attachment&gt;**](Attachment.md) |  |  [optional] |
| **annotations** | [**Annotations**](Annotations.md) |  |  [optional] |


<a id="Direction"></a>
## Enum: direction
| Name | Value |
| ---- | ----- |
| direction | inbound, outbound |



