
# GetUserInsights200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **recentlyAdded** | [**kotlin.collections.List&lt;UserEvent&gt;**](UserEvent.md) |  |  [optional] |
| **recentlySuspended** | [**kotlin.collections.List&lt;UserEvent&gt;**](UserEvent.md) |  |  [optional] |
| **inactive30d** | [**kotlin.collections.List&lt;UserEvent&gt;**](UserEvent.md) |  |  [optional] |
| **seatsUsed** | **kotlin.Int** |  |  [optional] |
| **seatsAlloc** | **kotlin.Int** |  |  [optional] |
| **seatsCapped** | **kotlin.Boolean** | True only on tiers with a hard seat cap (Free, Founder). On unlimited/per-seat tiers seats_alloc merely tracks the live mailbox count, so seats_used &#x3D;&#x3D; seats_alloc is normal and must not be read as &#39;at capacity&#39;. |  [optional] |
| **generatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |



