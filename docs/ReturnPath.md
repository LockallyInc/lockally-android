
# ReturnPath

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) |  |  |
| **host** | **kotlin.String** |  |  |
| **records** | [**kotlin.collections.List&lt;DNSRecord&gt;**](DNSRecord.md) |  |  |
| **check** | [**ReturnPathCheck**](ReturnPathCheck.md) |  |  [optional] |
| **requestedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **verifiedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | false, pending, active |



