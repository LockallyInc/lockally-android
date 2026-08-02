
# BatchResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **index** | **kotlin.Int** |  |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **messageId** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **error** | **kotlin.String** | Present when this message failed; the others are then absent. |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | queued, scheduled, suppressed |



