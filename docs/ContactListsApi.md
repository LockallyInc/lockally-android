# ContactListsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addContactListMember**](ContactListsApi.md#addContactListMember) | **POST** /v1/contact-lists/{id}/members | Add a member to a contact list |
| [**createContactList**](ContactListsApi.md#createContactList) | **POST** /v1/contact-lists | Create a contact list |
| [**deleteContactList**](ContactListsApi.md#deleteContactList) | **DELETE** /v1/contact-lists/{id} | Delete a contact list |
| [**getContactList**](ContactListsApi.md#getContactList) | **GET** /v1/contact-lists/{id} | Get a contact list with members |
| [**listContactLists**](ContactListsApi.md#listContactLists) | **GET** /v1/contact-lists | List contact lists |
| [**removeContactListMember**](ContactListsApi.md#removeContactListMember) | **DELETE** /v1/contact-lists/{id}/members/{contactId} | Remove a member from a contact list |
| [**updateContactList**](ContactListsApi.md#updateContactList) | **PATCH** /v1/contact-lists/{id} | Update a contact list |


<a id="addContactListMember"></a>
# **addContactListMember**
> addContactListMember(id, addContactListMemberRequest)

Add a member to a contact list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val addContactListMemberRequest : AddContactListMemberRequest =  // AddContactListMemberRequest | 
try {
    apiInstance.addContactListMember(id, addContactListMemberRequest)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#addContactListMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#addContactListMember")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addContactListMemberRequest** | [**AddContactListMemberRequest**](AddContactListMemberRequest.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a id="createContactList"></a>
# **createContactList**
> ContactList createContactList(createContactListRequest)

Create a contact list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val createContactListRequest : CreateContactListRequest =  // CreateContactListRequest | 
try {
    val result : ContactList = apiInstance.createContactList(createContactListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#createContactList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#createContactList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createContactListRequest** | [**CreateContactListRequest**](CreateContactListRequest.md)|  | |

### Return type

[**ContactList**](ContactList.md)

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

<a id="deleteContactList"></a>
# **deleteContactList**
> deleteContactList(id)

Delete a contact list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteContactList(id)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#deleteContactList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#deleteContactList")
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

<a id="getContactList"></a>
# **getContactList**
> GetContactList200Response getContactList(id)

Get a contact list with members

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetContactList200Response = apiInstance.getContactList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#getContactList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#getContactList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**GetContactList200Response**](GetContactList200Response.md)

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

<a id="listContactLists"></a>
# **listContactLists**
> ListContactLists200Response listContactLists()

List contact lists

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
try {
    val result : ListContactLists200Response = apiInstance.listContactLists()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#listContactLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#listContactLists")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListContactLists200Response**](ListContactLists200Response.md)

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

<a id="removeContactListMember"></a>
# **removeContactListMember**
> removeContactListMember(id, contactId)

Remove a member from a contact list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.removeContactListMember(id, contactId)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#removeContactListMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#removeContactListMember")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **java.util.UUID**|  | |

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

<a id="updateContactList"></a>
# **updateContactList**
> ContactList updateContactList(id, updateContactListRequest)

Update a contact list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ContactListsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateContactListRequest : UpdateContactListRequest =  // UpdateContactListRequest | 
try {
    val result : ContactList = apiInstance.updateContactList(id, updateContactListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactListsApi#updateContactList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactListsApi#updateContactList")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateContactListRequest** | [**UpdateContactListRequest**](UpdateContactListRequest.md)|  | |

### Return type

[**ContactList**](ContactList.md)

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

