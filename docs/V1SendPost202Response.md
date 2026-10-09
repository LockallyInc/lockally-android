
# V1SendPost202Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Lockally identifier; use with GET /v1/messages/{id}. |  |
| **messageId** | **kotlin.String** | RFC 5322 Message-ID (with angle brackets). |  |
| **status** | [**inline**](#Status) | \&quot;scheduled\&quot; when send_at is in the future. |  |
| **warning** | **kotlin.String** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | queued, scheduled |



