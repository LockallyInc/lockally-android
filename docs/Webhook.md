
# Webhook

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **url** | [**java.net.URI**](java.net.URI.md) |  |  |
| **events** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **paused** | **kotlin.Boolean** |  |  |
| **consecutiveFailures** | **kotlin.Int** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **pausedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **lastSuccessAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **lastFailureAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **signingSecret** | **kotlin.String** | Hex-encoded HMAC-SHA256 key. Present ONLY on POST response. |  [optional] |



