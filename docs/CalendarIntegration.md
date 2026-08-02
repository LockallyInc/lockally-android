
# CalendarIntegration

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **provider** | [**inline**](#Provider) |  |  |
| **status** | [**inline**](#Status) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **label** | **kotlin.String** |  |  [optional] |
| **lastSyncAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **errorMessage** | **kotlin.String** |  |  [optional] |


<a id="Provider"></a>
## Enum: provider
| Name | Value |
| ---- | ----- |
| provider | exchange, google_calendar, teams, zoom, erp |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | connected, disconnected, error, syncing |



