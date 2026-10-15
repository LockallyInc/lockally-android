
# GetCalendarOverview200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **totalCalendars** | **kotlin.Int** |  |  [optional] |
| **activeCalendars** | **kotlin.Int** | Calendars with an event created, edited or held in the last 30 days. |  [optional] |
| **sharedCalendars** | **kotlin.Int** | Calendars visible to the whole organization. |  [optional] |
| **eventsThisMonth** | **kotlin.Int** | Events on every calendar, in the account&#39;s own timezone. |  [optional] |
| **upcomingOrgEvents** | **kotlin.Int** | Future events on organization-visible calendars. |  [optional] |
| **bookableResources** | **kotlin.Int** | Resources that are not disabled. |  [optional] |
| **accessGranted** | **kotlin.Int** | People who own a calendar or are named on one. |  [optional] |
| **accessOrgWide** | **kotlin.Int** | Everyone who can see an organization calendar; 0 when none exists. |  [optional] |
| **activity** | [**kotlin.collections.List&lt;GetCalendarOverview200ResponseActivityInner&gt;**](GetCalendarOverview200ResponseActivityInner.md) |  |  [optional] |



