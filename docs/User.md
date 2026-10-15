
# User

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **email** | **kotlin.String** |  |  |
| **firstName** | **kotlin.String** |  |  |
| **lastName** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **title** | **kotlin.String** |  |  [optional] |
| **department** | **kotlin.String** |  |  [optional] |
| **mailboxCount** | **kotlin.Int** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, suspended, deprovisioned |



