
# AdminFull

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **email** | **kotlin.String** |  |  |
| **role** | [**inline**](#Role) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **disabled** | **kotlin.Boolean** |  |  |
| **displayName** | **kotlin.String** |  |  [optional] |
| **lastLoginAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **disabledAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **password** | **kotlin.String** | Present ONLY on POST response when lockally generated the password. Shown once. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | admin, viewer |



