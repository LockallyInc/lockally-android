# TemplatesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1TemplatesGet**](TemplatesApi.md#v1TemplatesGet) | **GET** /v1/templates | List templates |
| [**v1TemplatesIdDelete**](TemplatesApi.md#v1TemplatesIdDelete) | **DELETE** /v1/templates/{id} | Delete a template |
| [**v1TemplatesIdGet**](TemplatesApi.md#v1TemplatesIdGet) | **GET** /v1/templates/{id} | Get a template |
| [**v1TemplatesIdPut**](TemplatesApi.md#v1TemplatesIdPut) | **PUT** /v1/templates/{id} | Update a template |
| [**v1TemplatesPost**](TemplatesApi.md#v1TemplatesPost) | **POST** /v1/templates | Create a template |


<a id="v1TemplatesGet"></a>
# **v1TemplatesGet**
> V1TemplatesGet200Response v1TemplatesGet()

List templates

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
try {
    val result : V1TemplatesGet200Response = apiInstance.v1TemplatesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#v1TemplatesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#v1TemplatesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1TemplatesGet200Response**](V1TemplatesGet200Response.md)

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

<a id="v1TemplatesIdDelete"></a>
# **v1TemplatesIdDelete**
> v1TemplatesIdDelete(id)

Delete a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.v1TemplatesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#v1TemplatesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#v1TemplatesIdDelete")
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

<a id="v1TemplatesIdGet"></a>
# **v1TemplatesIdGet**
> Template v1TemplatesIdGet(id)

Get a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Template = apiInstance.v1TemplatesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#v1TemplatesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#v1TemplatesIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**Template**](Template.md)

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

<a id="v1TemplatesIdPut"></a>
# **v1TemplatesIdPut**
> Template v1TemplatesIdPut(id, templateInput)

Update a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val templateInput : TemplateInput =  // TemplateInput | 
try {
    val result : Template = apiInstance.v1TemplatesIdPut(id, templateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#v1TemplatesIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#v1TemplatesIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateInput** | [**TemplateInput**](TemplateInput.md)|  | |

### Return type

[**Template**](Template.md)

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

<a id="v1TemplatesPost"></a>
# **v1TemplatesPost**
> Template v1TemplatesPost(templateInput)

Create a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val templateInput : TemplateInput =  // TemplateInput | 
try {
    val result : Template = apiInstance.v1TemplatesPost(templateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#v1TemplatesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#v1TemplatesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateInput** | [**TemplateInput**](TemplateInput.md)|  | |

### Return type

[**Template**](Template.md)

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

