
# Calendar

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **visibility** | [**inline**](#Visibility) |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **updatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **color** | **kotlin.String** |  |  [optional] |
| **ownerEmail** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **calendarType** | [**inline**](#CalendarType) | What the calendar is for. Separate from visibility, which is who may see it: a team calendar can be open to everyone and a department one restricted to named people. \&quot;personal\&quot; is a person&#39;s own and is not listed in the console&#39;s management table.  |  [optional] |
| **ownerUnit** | **kotlin.String** | The owning department or office. Empty on a personal calendar, which is owned by owner_email. |  [optional] |
| **accessDepartment** | **kotlin.String** | Which department may see it, when visibility is \&quot;department\&quot;. Matched against the department recorded on a user, so access follows a person between departments with no membership list to maintain.  |  [optional] |
| **status** | [**inline**](#Status) | Archived keeps the calendar, its events and its feed, and stops it taking new events. |  [optional] |
| **feedUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **eventCount** | **kotlin.Int** |  |  [optional] |


<a id="Visibility"></a>
## Enum: visibility
| Name | Value |
| ---- | ----- |
| visibility | private, tenant, department |


<a id="CalendarType"></a>
## Enum: calendar_type
| Name | Value |
| ---- | ----- |
| calendarType | personal, organization, department, team, shared |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, archived |



