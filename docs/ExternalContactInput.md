
# ExternalContactInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **kotlin.String** |  |  |
| **name** | **kotlin.String** | Defaults to the email address when empty. |  [optional] |
| **phone** | **kotlin.String** |  |  [optional] |
| **company** | **kotlin.String** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **contactType** | [**inline**](#ContactType) |  |  [optional] |
| **department** | **kotlin.String** |  |  [optional] |
| **role** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |


<a id="ContactType"></a>
## Enum: contact_type
| Name | Value |
| ---- | ----- |
| contactType | internal, external |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, disabled |



