
# V1ApiKeysPost201Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **prefix** | **kotlin.String** | 8-char public prefix; safe to store and display. |  |
| **scopes** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **label** | **kotlin.String** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **secret** | **kotlin.String** | The full &#x60;lk_live_&lt;prefix&gt;_&lt;secret&gt;&#x60; token. Shown ONCE. |  |
| **lastUsedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **revokedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |



