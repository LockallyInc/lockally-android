
# V1UsageGet200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mailboxesActive** | **kotlin.Int** | Mailboxes that are neither disabled nor soft-deleted. |  |
| **generatedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) | When this snapshot was generated, RFC 3339 UTC. |  |
| **mailboxesTotal** | **kotlin.Int** | All mailboxes for this tenant, including disabled/soft-deleted. |  [optional] |
| **domainsVerified** | **kotlin.Int** | Domains that have passed DNS verification. |  [optional] |
| **domainsTotal** | **kotlin.Int** |  |  [optional] |
| **messagesSentLast60s** | **kotlin.Int** | Sends in the 60-second window ending now. Used by the rate-cap check. |  [optional] |
| **messagesSentTodayUtc** | **kotlin.Int** | Sends since 00:00 UTC. Compared against &#x60;daily_msg_quota&#x60;. |  [optional] |
| **messagesSentLast30d** | **kotlin.Int** | Rolling 30-day send count (not calendar month). |  [optional] |
| **bytesStored** | **kotlin.Long** | Lifetime sum of &#x60;messages.size_bytes&#x60; for this tenant. |  [optional] |
| **rateCapPerMin** | **kotlin.Int** | Per-tenant outbound rate cap (sends per minute). |  [optional] |
| **dailyMsgQuota** | **kotlin.Int** | Per-tenant daily send quota (UTC day boundary). |  [optional] |
| **webhooksTotal** | **kotlin.Int** |  |  [optional] |
| **webhooksPaused** | **kotlin.Int** | Webhook subscriptions auto-paused after 50 consecutive failures (LT2). |  [optional] |



