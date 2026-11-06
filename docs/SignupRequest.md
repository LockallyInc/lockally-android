
# SignupRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **slug** | **kotlin.String** | Workspace id. 3 to 63 characters of lowercase a-z, 0-9 and hyphens, starting and ending with a letter or digit. Anything else is refused with 400 Invalid workspace id. |  |
| **adminEmail** | **kotlin.String** |  |  |
| **password** | **kotlin.String** |  |  |
| **displayName** | **kotlin.String** |  |  [optional] |
| **mode** | [**inline**](#Mode) |  |  [optional] |


<a id="Mode"></a>
## Enum: mode
| Name | Value |
| ---- | ----- |
| mode | api, business, both |



