
# Contact

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **email** | **kotlin.String** |  |  |
| **contactType** | [**inline**](#ContactType) |  |  |
| **status** | **kotlin.String** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **phone** | **kotlin.String** |  |  [optional] |
| **company** | **kotlin.String** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **source** | **kotlin.String** |  |  [optional] |
| **department** | **kotlin.String** |  |  [optional] |
| **role** | **kotlin.String** |  |  [optional] |
| **externalSystem** | **kotlin.String** | The system that owns this contact&#39;s external id. Absent on contacts made by hand. |  [optional] |
| **externalId** | **kotlin.String** | The contact&#39;s id in &#x60;external_system&#x60;. Absent on contacts made by hand. |  [optional] |


<a id="ContactType"></a>
## Enum: contact_type
| Name | Value |
| ---- | ----- |
| contactType | internal, external |



