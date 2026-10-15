# ContactsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContact**](ContactsApi.md#createContact) | **POST** /v1/contacts | Create a contact |
| [**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /v1/contacts/{id} | Delete a contact |
| [**getContact**](ContactsApi.md#getContact) | **GET** /v1/contacts/{id} | Get a contact |
| [**getContactLists**](ContactsApi.md#getContactLists) | **GET** /v1/contacts/{id}/lists | Get lists a contact belongs to |
| [**listContacts**](ContactsApi.md#listContacts) | **GET** /v1/contacts | List contacts |
| [**updateContact**](ContactsApi.md#updateContact) | **PATCH** /v1/contacts/{id} | Update a contact |


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

