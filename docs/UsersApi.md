# UsersApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createUser**](UsersApi.md#createUser) | **POST** /v1/users | Create a user |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /v1/users/{id} | Delete a user |
| [**getUser**](UsersApi.md#getUser) | **GET** /v1/users/{id} | Get a user |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /v1/users | List users |
| [**updateUser**](UsersApi.md#updateUser) | **PATCH** /v1/users/{id} | Update a user |


<a id="createUser"></a>
# **createUser**
> User createUser(createUserRequest)

Create a user

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = UsersApi()
val createUserRequest : CreateUserRequest =  // CreateUserRequest | 
try {
    val result : User = apiInstance.createUser(createUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**User**](User.md)

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

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(id)

Delete a user

Soft-deletes the user by setting status to deprovisioned.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = UsersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUser")
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

<a id="getUser"></a>
# **getUser**
> User getUser(id)

Get a user

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = UsersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : User = apiInstance.getUser(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**User**](User.md)

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

<a id="listUsers"></a>
# **listUsers**
> ListUsers200Response listUsers(limit)

List users

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = UsersApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListUsers200Response = apiInstance.listUsers(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUsers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 100] |

### Return type

[**ListUsers200Response**](ListUsers200Response.md)

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

<a id="updateUser"></a>
# **updateUser**
> User updateUser(id, updateUserRequest)

Update a user

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = UsersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateUserRequest : UpdateUserRequest =  // UpdateUserRequest | 
try {
    val result : User = apiInstance.updateUser(id, updateUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | |

### Return type

[**User**](User.md)

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

