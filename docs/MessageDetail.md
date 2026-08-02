
# MessageDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **messageId** | **kotlin.String** | RFC 5322 Message-ID header, including angle brackets. |  |
| **sender** | **kotlin.String** |  |  |
| **recipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **queuedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **subject** | **kotlin.String** |  |  [optional] |
| **bounceReason** | **kotlin.String** |  |  [optional] |
| **sizeBytes** | **kotlin.Int** |  |  [optional] |
| **from** | **kotlin.String** |  |  [optional] |
| **to** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **text** | **kotlin.String** |  |  [optional] |
| **html** | **kotlin.String** |  |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | queued, sending, delivered, bounced, deferred, complaint |



