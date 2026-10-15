
# CalendarPolicies

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **maxMeetingDurationMins** | **kotlin.Int** |  |  [optional] |
| **workingHoursStart** | **kotlin.String** |  |  [optional] |
| **workingHoursEnd** | **kotlin.String** |  |  [optional] |
| **bookingWindowDays** | **kotlin.Int** |  |  [optional] |
| **recurringMeetingLimit** | **kotlin.Int** |  |  [optional] |
| **resourceApprovalMode** | [**inline**](#ResourceApprovalMode) |  |  [optional] |
| **externalInvitesAllowed** | **kotlin.Boolean** |  |  [optional] |
| **externalSharingAllowed** | **kotlin.Boolean** |  |  [optional] |
| **publicLinksEnabled** | **kotlin.Boolean** |  |  [optional] |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="ResourceApprovalMode"></a>
## Enum: resource_approval_mode
| Name | Value |
| ---- | ----- |
| resourceApprovalMode | auto_approve, require_approval, restricted |



