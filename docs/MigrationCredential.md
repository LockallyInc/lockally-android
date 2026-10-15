
# MigrationCredential

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **provider** | [**inline**](#Provider) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **encryptionKeyId** | **kotlin.String** |  |  [optional] |
| **label** | **kotlin.String** |  |  [optional] |


<a id="Provider"></a>
## Enum: provider
| Name | Value |
| ---- | ----- |
| provider | imap, google, microsoft, generic |



