
# BillingStatus

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **plan** | **kotlin.String** |  |  |
| **displayName** | **kotlin.String** |  |  |
| **mode** | [**inline**](#Mode) |  |  |
| **rateCapPerMin** | **kotlin.Int** |  |  |
| **monthlyIncludedSends** | **kotlin.Int** |  |  |
| **msgsThisPeriod** | **kotlin.Int** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **priceNairaPerSeat** | **kotlin.Int** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **sendUnitsBalance** | **kotlin.Int** |  |  |
| **unitBundles** | [**kotlin.collections.List&lt;UnitBundle&gt;**](UnitBundle.md) |  |  |
| **catalog** | [**kotlin.collections.List&lt;PlanCatalogEntry&gt;**](PlanCatalogEntry.md) |  |  |
| **subscribedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **currentPeriodEnd** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **sendUnitsNextExpiry** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |


<a id="Mode"></a>
## Enum: mode
| Name | Value |
| ---- | ----- |
| mode | api, business, both |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, suspended |



