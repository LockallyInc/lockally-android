
# Domain

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **domain** | **kotlin.String** |  |  |
| **verificationToken** | **kotlin.String** |  |  |
| **verified** | **kotlin.Boolean** |  |  |
| **dkimSelector** | **kotlin.String** |  |  |
| **dkimPublicRecord** | **kotlin.String** |  |  |
| **createdAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  |
| **verifiedAt** | [**kotlin.time.Instant**](kotlin.time.Instant.md) |  |  [optional] |
| **records** | [**kotlin.collections.List&lt;DNSRecord&gt;**](DNSRecord.md) | DNS records the tenant must publish under their own DNS. |  [optional] |



