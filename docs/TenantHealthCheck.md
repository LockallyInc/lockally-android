
# TenantHealthCheck

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **kotlin.String** | Stable identifier, today one of &#x60;domain_verification&#x60;, &#x60;smtp&#x60;, &#x60;storage&#x60;, &#x60;security&#x60;. Treat unknown keys as new checks, not errors. |  |
| **label** | **kotlin.String** | Human-readable name for display. |  |
| **status** | **kotlin.String** | &#x60;healthy&#x60;, &#x60;warning&#x60; or &#x60;critical&#x60;. |  |
| **detail** | **kotlin.String** |  |  |



