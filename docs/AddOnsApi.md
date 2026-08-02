# AddOnsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activateAddOn**](AddOnsApi.md#activateAddOn) | **POST** /v1/add-ons/{name}/activate | Activate an add-on |
| [**cancelAddOn**](AddOnsApi.md#cancelAddOn) | **POST** /v1/add-ons/{name}/cancel | Cancel an add-on |
| [**getAddOnStatus**](AddOnsApi.md#getAddOnStatus) | **GET** /v1/add-ons/{name} | Get add-on status |
| [**listAddOns**](AddOnsApi.md#listAddOns) | **GET** /v1/add-ons | List add-ons |


<a id="activateAddOn"></a>
# **activateAddOn**
> ActivateAddOn200Response activateAddOn(name)

Activate an add-on

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AddOnsApi()
val name : kotlin.String = name_example // kotlin.String | Add-on key
try {
    val result : ActivateAddOn200Response = apiInstance.activateAddOn(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddOnsApi#activateAddOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddOnsApi#activateAddOn")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| Add-on key | |

### Return type

[**ActivateAddOn200Response**](ActivateAddOn200Response.md)

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

<a id="cancelAddOn"></a>
# **cancelAddOn**
> cancelAddOn(name)

Cancel an add-on

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AddOnsApi()
val name : kotlin.String = name_example // kotlin.String | Add-on key
try {
    apiInstance.cancelAddOn(name)
} catch (e: ClientException) {
    println("4xx response calling AddOnsApi#cancelAddOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddOnsApi#cancelAddOn")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| Add-on key | |

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

<a id="getAddOnStatus"></a>
# **getAddOnStatus**
> GetAddOnStatus200Response getAddOnStatus(name)

Get add-on status

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AddOnsApi()
val name : kotlin.String = name_example // kotlin.String | Add-on key
try {
    val result : GetAddOnStatus200Response = apiInstance.getAddOnStatus(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddOnsApi#getAddOnStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddOnsApi#getAddOnStatus")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| Add-on key | |

### Return type

[**GetAddOnStatus200Response**](GetAddOnStatus200Response.md)

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

<a id="listAddOns"></a>
# **listAddOns**
> ListAddOns200Response listAddOns()

List add-ons

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = AddOnsApi()
try {
    val result : ListAddOns200Response = apiInstance.listAddOns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddOnsApi#listAddOns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddOnsApi#listAddOns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListAddOns200Response**](ListAddOns200Response.md)

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

