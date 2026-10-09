
# DirectoryPermissions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **contactViewAccess** | [**inline**](#ContactViewAccess) |  |  |
| **contactEditAccess** | [**inline**](#ContactEditAccess) |  |  |
| **listManageAccess** | [**inline**](#ListManageAccess) |  |  |
| **externalSharing** | [**inline**](#ExternalSharing) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="ContactViewAccess"></a>
## Enum: contact_view_access
| Name | Value |
| ---- | ----- |
| contactViewAccess | all_users, same_department, admins_only |


<a id="ContactEditAccess"></a>
## Enum: contact_edit_access
| Name | Value |
| ---- | ----- |
| contactEditAccess | all_users, admins_only |


<a id="ListManageAccess"></a>
## Enum: list_manage_access
| Name | Value |
| ---- | ----- |
| listManageAccess | all_users, list_owners, admins_only |


<a id="ExternalSharing"></a>
## Enum: external_sharing
| Name | Value |
| ---- | ----- |
| externalSharing | allowed, restricted, disabled |



