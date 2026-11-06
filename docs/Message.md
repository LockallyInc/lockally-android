
# Message

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
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The sender&#39;s own key/value from the send request. Always present; &#x60;{}&#x60; when none was set. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Grouping labels, lowercased and deduplicated. Always present; &#x60;[]&#x60; when none were set. |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | queued, sending, delivered, bounced, deferred, complaint |



