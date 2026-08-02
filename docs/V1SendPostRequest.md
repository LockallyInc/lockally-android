
# V1SendPostRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **from** | **kotlin.String** |  |  |
| **to** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **subject** | **kotlin.String** |  |  [optional] |
| **text** | **kotlin.String** | Plain-text body. Required if &#x60;html&#x60; is absent. |  [optional] |
| **html** | **kotlin.String** | HTML body. Required if &#x60;text&#x60; is absent. |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **unsubscribe** | **kotlin.Boolean** | Mark as opt-in/broadcast: skips suppressed recipients and adds a managed one-click List-Unsubscribe header. |  [optional] |
| **templateId** | [**java.util.UUID**](java.util.UUID.md) | Render subject/text/html from a stored template (GET /v1/templates). Mutually exclusive with inline subject/text/html. |  [optional] |
| **variables** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Values substituted into the template&#39;s {{variable}} placeholders. |  [optional] |
| **sendAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) | Schedule delivery for a future RFC3339 time (≤ 30 days out). Omit or past &#x3D; send now. Cancel with DELETE /v1/messages/{id} while scheduled. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;V1SendPostRequestAttachmentsInner&gt;**](V1SendPostRequestAttachmentsInner.md) |  |  [optional] |



