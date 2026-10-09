# ResourcesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createResource**](ResourcesApi.md#createResource) | **POST** /v1/resources | Create a resource |
| [**deleteResource**](ResourcesApi.md#deleteResource) | **DELETE** /v1/resources/{id} | Delete a resource |
| [**getResource**](ResourcesApi.md#getResource) | **GET** /v1/resources/{id} | Get a resource |
| [**listResources**](ResourcesApi.md#listResources) | **GET** /v1/resources | List resources |
| [**updateResource**](ResourcesApi.md#updateResource) | **PATCH** /v1/resources/{id} | Update a resource |


<a id="createResource"></a>
# **createResource**
> Resource createResource(createResourceRequest)

Create a resource

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ResourcesApi()
val createResourceRequest : CreateResourceRequest =  // CreateResourceRequest | 
try {
    val result : Resource = apiInstance.createResource(createResourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#createResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#createResource")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createResourceRequest** | [**CreateResourceRequest**](CreateResourceRequest.md)|  | |

### Return type

[**Resource**](Resource.md)

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

<a id="deleteResource"></a>
# **deleteResource**
> deleteResource(id)

Delete a resource

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ResourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteResource(id)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#deleteResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#deleteResource")
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

<a id="getResource"></a>
# **getResource**
> Resource getResource(id)

Get a resource

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ResourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Resource = apiInstance.getResource(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#getResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#getResource")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**Resource**](Resource.md)

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

<a id="listResources"></a>
# **listResources**
> ListResources200Response listResources()

List resources

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ResourcesApi()
try {
    val result : ListResources200Response = apiInstance.listResources()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#listResources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#listResources")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResources200Response**](ListResources200Response.md)

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

<a id="updateResource"></a>
# **updateResource**
> Resource updateResource(id, updateResourceRequest)

Update a resource

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = ResourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateResourceRequest : UpdateResourceRequest =  // UpdateResourceRequest | 
try {
    val result : Resource = apiInstance.updateResource(id, updateResourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#updateResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#updateResource")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateResourceRequest** | [**UpdateResourceRequest**](UpdateResourceRequest.md)|  | |

### Return type

[**Resource**](Resource.md)

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

