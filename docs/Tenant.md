
# Tenant

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **slug** | **kotlin.String** |  |  |
| **displayName** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **plan** | **kotlin.String** |  |  |
| **rateCapPerMin** | **kotlin.Int** | Per-tenant share of the per-VPS 5/min outbound cap (L6). |  |
| **dailyMsgQuota** | **kotlin.Int** |  |  |
| **adminEmail** | **kotlin.String** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **suspendedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **closedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **hardDeleteAfter** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, suspended, closing, closed |



