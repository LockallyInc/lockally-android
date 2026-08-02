
# Migration

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **credentialId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **sourceProvider** | **kotlin.String** |  |  |
| **mailboxCount** | **kotlin.Int** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **sourceSummary** | **kotlin.String** |  |  [optional] |
| **settings** | [**MigrationSettings**](MigrationSettings.md) |  |  [optional] |
| **errorMessage** | **kotlin.String** |  |  [optional] |
| **startedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **completedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | draft, discovering, discovered, mapped, pilot_running, pilot_complete, running, staged, cutover_pending, final_syncing, validating, completed, failed, cancelled |



