# DistributionListsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDistributionList**](DistributionListsApi.md#createDistributionList) | **POST** /v1/distribution-lists | Create a distribution list |
| [**deleteDistributionList**](DistributionListsApi.md#deleteDistributionList) | **DELETE** /v1/distribution-lists/{address} | Delete a distribution list |
| [**getDistributionList**](DistributionListsApi.md#getDistributionList) | **GET** /v1/distribution-lists/{address} | Get a distribution list |
| [**listDistributionLists**](DistributionListsApi.md#listDistributionLists) | **GET** /v1/distribution-lists | List distribution lists |
| [**replaceDistributionListMembers**](DistributionListsApi.md#replaceDistributionListMembers) | **PUT** /v1/distribution-lists/{address}/members | Replace distribution list members |


<a id="createDistributionList"></a>
# **createDistributionList**
> DistributionListDetail createDistributionList(createDistributionListRequest)

Create a distribution list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DistributionListsApi()
val createDistributionListRequest : CreateDistributionListRequest =  // CreateDistributionListRequest | 
try {
    val result : DistributionListDetail = apiInstance.createDistributionList(createDistributionListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionListsApi#createDistributionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionListsApi#createDistributionList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createDistributionListRequest** | [**CreateDistributionListRequest**](CreateDistributionListRequest.md)|  | |

### Return type

[**DistributionListDetail**](DistributionListDetail.md)

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

<a id="deleteDistributionList"></a>
# **deleteDistributionList**
> deleteDistributionList(address)

Delete a distribution list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DistributionListsApi()
val address : kotlin.String = address_example // kotlin.String | Distribution list email address
try {
    apiInstance.deleteDistributionList(address)
} catch (e: ClientException) {
    println("4xx response calling DistributionListsApi#deleteDistributionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionListsApi#deleteDistributionList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **address** | **kotlin.String**| Distribution list email address | |

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

<a id="getDistributionList"></a>
# **getDistributionList**
> DistributionListDetail getDistributionList(address)

Get a distribution list

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DistributionListsApi()
val address : kotlin.String = address_example // kotlin.String | Distribution list email address
try {
    val result : DistributionListDetail = apiInstance.getDistributionList(address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionListsApi#getDistributionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionListsApi#getDistributionList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **address** | **kotlin.String**| Distribution list email address | |

### Return type

[**DistributionListDetail**](DistributionListDetail.md)

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

<a id="listDistributionLists"></a>
# **listDistributionLists**
> ListDistributionLists200Response listDistributionLists()

List distribution lists

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DistributionListsApi()
try {
    val result : ListDistributionLists200Response = apiInstance.listDistributionLists()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionListsApi#listDistributionLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionListsApi#listDistributionLists")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDistributionLists200Response**](ListDistributionLists200Response.md)

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

<a id="replaceDistributionListMembers"></a>
# **replaceDistributionListMembers**
> ReplaceDistributionListMembers200Response replaceDistributionListMembers(address, replaceDistributionListMembersRequest)

Replace distribution list members

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = DistributionListsApi()
val address : kotlin.String = address_example // kotlin.String | Distribution list email address
val replaceDistributionListMembersRequest : ReplaceDistributionListMembersRequest =  // ReplaceDistributionListMembersRequest | 
try {
    val result : ReplaceDistributionListMembers200Response = apiInstance.replaceDistributionListMembers(address, replaceDistributionListMembersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionListsApi#replaceDistributionListMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionListsApi#replaceDistributionListMembers")
    e.printStackTrace()
}
```

### Parameters
| **address** | **kotlin.String**| Distribution list email address | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **replaceDistributionListMembersRequest** | [**ReplaceDistributionListMembersRequest**](ReplaceDistributionListMembersRequest.md)|  | |

### Return type

[**ReplaceDistributionListMembers200Response**](ReplaceDistributionListMembers200Response.md)

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

