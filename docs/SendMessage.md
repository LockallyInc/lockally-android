
# SendMessage

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **from** | **kotlin.String** |  |  |
| **to** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **subject** | **kotlin.String** |  |  [optional] |
| **text** | **kotlin.String** |  |  [optional] |
| **html** | **kotlin.String** |  |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **replyTo** | **kotlin.String** | Where replies go. Required when &#x60;from&#x60; has no mailbox behind it. The named form &#x60;Acme Support &lt;a@b.com&gt;&#x60; is also accepted. |  [optional] |
| **replyToName** | **kotlin.String** | Display name shown on &#x60;Reply-To&#x60;. Ignored without &#x60;reply_to&#x60;. |  [optional] |
| **unsubscribe** | **kotlin.Boolean** |  |  [optional] |
| **templateId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **variables** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **sendAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;V1SendPostRequestAttachmentsInner&gt;**](V1SendPostRequestAttachmentsInner.md) |  |  [optional] |



