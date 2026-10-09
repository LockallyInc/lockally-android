
# V1ApiKeysPostRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **label** | **kotlin.String** | Free-text identifier shown in the dashboard. |  |
| **scopes** | [**inline**](#kotlin.collections.List&lt;Scopes&gt;) | Allowed scopes on this key. |  |
| **test** | **kotlin.Boolean** | Issue a test key (&#x60;lk_test_&#x60; prefix). A test key accepts sends, records them and fires a simulated delivery webhook without sending mail, and counts against no limit or allowance.  |  [optional] |


<a id="kotlin.collections.List<Scopes>"></a>
## Enum: scopes
| Name | Value |
| ---- | ----- |
| scopes | tenant:read, tenant:admin, mailboxes:read, mailboxes:write, directory:sync, inboxes:read, inboxes:write, send:read, send:write, templates:read, templates:write, suppressions:read, suppressions:write, webhooks:read, webhooks:write, domains:read, domains:write, migrations:read, migrations:write |



