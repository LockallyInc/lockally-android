# ContactsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bulkUpsertExternalContacts**](ContactsApi.md#bulkUpsertExternalContacts) | **PUT** /v1/contacts/external/{system} | Create or update up to 500 contacts by their ids in another system |
| [**createContact**](ContactsApi.md#createContact) | **POST** /v1/contacts | Create a contact |
| [**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /v1/contacts/{id} | Delete a contact |
| [**deleteExternalContact**](ContactsApi.md#deleteExternalContact) | **DELETE** /v1/contacts/external/{system}/{external_id} | Delete a contact by its id in another system |
| [**getContact**](ContactsApi.md#getContact) | **GET** /v1/contacts/{id} | Get a contact |
| [**getContactLists**](ContactsApi.md#getContactLists) | **GET** /v1/contacts/{id}/lists | Get lists a contact belongs to |
| [**getExternalContact**](ContactsApi.md#getExternalContact) | **GET** /v1/contacts/external/{system}/{external_id} | Get a contact by its id in another system |
| [**listContacts**](ContactsApi.md#listContacts) | **GET** /v1/contacts | List contacts |
| [**updateContact**](ContactsApi.md#updateContact) | **PATCH** /v1/contacts/{id} | Update a contact |
| [**upsertExternalContact**](ContactsApi.md#upsertExternalContact) | **PUT** /v1/contacts/external/{system}/{external_id} | Create or update a contact by its id in another system |


<a id="bulkUpsertExternalContacts"></a>
# **bulkUpsertExternalContacts**
> BulkUpsertExternalContacts200Response bulkUpsertExternalContacts(system, bulkUpsertExternalContactsRequest)

Create or update up to 500 contacts by their ids in another system

For a sync. Each row stands alone: a bad row is reported in &#x60;results&#x60; with its index and the rest are stored, so the response is 200 whenever the request itself is well formed. Read &#x60;failed&#x60; and &#x60;results&#x60;. Two rows with the same &#x60;external_id&#x60; in one request are refused (the later one), because which is current cannot be known. Rerunning the same payload updates rather than duplicates.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val system : kotlin.String = system_example // kotlin.String | 
val bulkUpsertExternalContactsRequest : BulkUpsertExternalContactsRequest =  // BulkUpsertExternalContactsRequest | 
try {
    val result : BulkUpsertExternalContacts200Response = apiInstance.bulkUpsertExternalContacts(system, bulkUpsertExternalContactsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#bulkUpsertExternalContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#bulkUpsertExternalContacts")
    e.printStackTrace()
}
```

### Parameters
| **system** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bulkUpsertExternalContactsRequest** | [**BulkUpsertExternalContactsRequest**](BulkUpsertExternalContactsRequest.md)|  | |

### Return type

[**BulkUpsertExternalContacts200Response**](BulkUpsertExternalContacts200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="createContact"></a>
# **createContact**
> Contact createContact(createContactRequest)

Create a contact

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val createContactRequest : CreateContactRequest =  // CreateContactRequest | 
try {
    val result : Contact = apiInstance.createContact(createContactRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#createContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#createContact")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createContactRequest** | [**CreateContactRequest**](CreateContactRequest.md)|  | |

### Return type

[**Contact**](Contact.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="deleteContact"></a>
# **deleteContact**
> deleteContact(id)

Delete a contact

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteContact(id)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteContact")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="deleteExternalContact"></a>
# **deleteExternalContact**
> deleteExternalContact(system, externalId)

Delete a contact by its id in another system

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val system : kotlin.String = system_example // kotlin.String | Your label for the system the record comes from, for example `salesforce`, `hubspot` or `odoo`. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded).
val externalId : kotlin.String = externalId_example // kotlin.String | The record's id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it.
try {
    apiInstance.deleteExternalContact(system, externalId)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteExternalContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteExternalContact")
    e.printStackTrace()
}
```

### Parameters
| **system** | **kotlin.String**| Your label for the system the record comes from, for example &#x60;salesforce&#x60;, &#x60;hubspot&#x60; or &#x60;odoo&#x60;. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded). | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| The record&#39;s id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it. | |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="getContact"></a>
# **getContact**
> Contact getContact(id)

Get a contact

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Contact = apiInstance.getContact(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContact")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**Contact**](Contact.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getContactLists"></a>
# **getContactLists**
> GetContactLists200Response getContactLists(id)

Get lists a contact belongs to

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetContactLists200Response = apiInstance.getContactLists(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactLists")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**GetContactLists200Response**](GetContactLists200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getExternalContact"></a>
# **getExternalContact**
> Contact getExternalContact(system, externalId)

Get a contact by its id in another system

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val system : kotlin.String = system_example // kotlin.String | Your label for the system the record comes from, for example `salesforce`, `hubspot` or `odoo`. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded).
val externalId : kotlin.String = externalId_example // kotlin.String | The record's id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it.
try {
    val result : Contact = apiInstance.getExternalContact(system, externalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getExternalContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getExternalContact")
    e.printStackTrace()
}
```

### Parameters
| **system** | **kotlin.String**| Your label for the system the record comes from, for example &#x60;salesforce&#x60;, &#x60;hubspot&#x60; or &#x60;odoo&#x60;. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded). | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| The record&#39;s id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it. | |

### Return type

[**Contact**](Contact.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listContacts"></a>
# **listContacts**
> ListContacts200Response listContacts(q, type, department, status, source)

List contacts

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val q : kotlin.String = q_example // kotlin.String | Free-text search across name, email, company
val type : kotlin.String = type_example // kotlin.String | Filter by contact_type
val department : kotlin.String = department_example // kotlin.String | Filter by department
val status : kotlin.String = status_example // kotlin.String | Filter by status
val source : kotlin.String = source_example // kotlin.String | Filter by source
try {
    val result : ListContacts200Response = apiInstance.listContacts(q, type, department, status, source)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#listContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#listContacts")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Free-text search across name, email, company | [optional] |
| **type** | **kotlin.String**| Filter by contact_type | [optional] |
| **department** | **kotlin.String**| Filter by department | [optional] |
| **status** | **kotlin.String**| Filter by status | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **source** | **kotlin.String**| Filter by source | [optional] |

### Return type

[**ListContacts200Response**](ListContacts200Response.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="updateContact"></a>
# **updateContact**
> Contact updateContact(id, updateContactRequest)

Update a contact

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateContactRequest : UpdateContactRequest =  // UpdateContactRequest | 
try {
    val result : Contact = apiInstance.updateContact(id, updateContactRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#updateContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#updateContact")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateContactRequest** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | |

### Return type

[**Contact**](Contact.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="upsertExternalContact"></a>
# **upsertExternalContact**
> Contact upsertExternalContact(system, externalId, externalContactInput)

Create or update a contact by its id in another system

Idempotent: the path is the identity, so sending the same request twice cannot create a second contact, and you never need to store our id. Returns 201 when the contact was created and 200 when it already existed. The body is the full representation: a field you leave out is cleared. Email is an ordinary attribute, not a key, so changing it updates the same contact. &#x60;mailboxes:write&#x60; is also accepted.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactsApi()
val system : kotlin.String = system_example // kotlin.String | Your label for the system the record comes from, for example `salesforce`, `hubspot` or `odoo`. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded).
val externalId : kotlin.String = externalId_example // kotlin.String | The record's id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it.
val externalContactInput : ExternalContactInput =  // ExternalContactInput | 
try {
    val result : Contact = apiInstance.upsertExternalContact(system, externalId, externalContactInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#upsertExternalContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#upsertExternalContact")
    e.printStackTrace()
}
```

### Parameters
| **system** | **kotlin.String**| Your label for the system the record comes from, for example &#x60;salesforce&#x60;, &#x60;hubspot&#x60; or &#x60;odoo&#x60;. 1 to 64 characters: lowercase letters, digits, dot, underscore or hyphen (upper case is folded). | |
| **externalId** | **kotlin.String**| The record&#39;s id in that system, kept exactly as given (case matters). 1 to 255 characters, no spaces. URL-encode it. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactInput** | [**ExternalContactInput**](ExternalContactInput.md)|  | |

### Return type

[**Contact**](Contact.md)

### Authorization


Configure bearerAuth statically:
```kotlin
ApiClient.accessToken = ""
```
Configure bearerAuth dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

