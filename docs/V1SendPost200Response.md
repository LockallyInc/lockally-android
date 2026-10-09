
# V1SendPost200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Present on a test-mode send; absent when suppressed. |  [optional] |
| **messageId** | **kotlin.String** | RFC 5322 Message-ID. On a test send the domain is test.lockally.com. Absent when suppressed. |  [optional] |
| **warning** | **kotlin.String** | On a suppressed send, explains that nothing was sent. |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | suppressed, delivered |



