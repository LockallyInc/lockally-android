
# DNSRecord

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) |  |  |
| **name** | **kotlin.String** |  |  |
| **&#x60;value&#x60;** | **kotlin.String** |  |  |
| **ttl** | **kotlin.Int** |  |  |
| **purpose** | [**inline**](#Purpose) |  |  |
| **priority** | **kotlin.Int** | MX records only. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | TXT, MX |


<a id="Purpose"></a>
## Enum: purpose
| Name | Value |
| ---- | ----- |
| purpose | verification, spf, dkim, mx-primary, mx-backup, dmarc |



