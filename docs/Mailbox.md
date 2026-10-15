
# Mailbox

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **domainId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **email** | **kotlin.String** |  |  |
| **quotaBytes** | **kotlin.Long** |  |  |
| **disabled** | **kotlin.Boolean** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **disabledAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **softDeletedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **hardDeleteAfter** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **password** | **kotlin.String** | ONLY present on POST response when lockally generated the password. Shown once. |  [optional] |



