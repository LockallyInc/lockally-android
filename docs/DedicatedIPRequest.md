
# DedicatedIPRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **status** | [**inline**](#Status) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **note** | **kotlin.String** |  |  [optional] |
| **adminNote** | **kotlin.String** |  |  [optional] |
| **resolvedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | pending, approved, rejected |



