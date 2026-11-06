# TemplatesApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /v1/templates | Create a template |
| [**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /v1/templates/{id} | Delete a template |
| [**getTemplate**](TemplatesApi.md#getTemplate) | **GET** /v1/templates/{id} | Get a template |
| [**listTemplates**](TemplatesApi.md#listTemplates) | **GET** /v1/templates | List templates |
| [**updateTemplate**](TemplatesApi.md#updateTemplate) | **PUT** /v1/templates/{id} | Update a template |


<a id="createTemplate"></a>
# **createTemplate**
> Template createTemplate(templateInput)

Create a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val templateInput : TemplateInput =  // TemplateInput | 
try {
    val result : Template = apiInstance.createTemplate(templateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createTemplate")
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

<a id="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id)

Delete a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteTemplate(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#deleteTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#deleteTemplate")
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

<a id="getTemplate"></a>
# **getTemplate**
> Template getTemplate(id)

Get a template

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Template = apiInstance.getTemplate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#getTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#getTemplate")
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

<a id="listTemplates"></a>
# **listTemplates**
> ListTemplates200Response listTemplates(sort, order)

List templates

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TemplatesApi()
val sort : kotlin.String = sort_example // kotlin.String | Field to order by. This list holds tens of rows per account, so every column is offered and none needs an index.
val order : kotlin.String = order_example // kotlin.String | Defaults to asc for the default field and asc for any other. Always tie-broken on id, so the order is total.
try {
    val result : ListTemplates200Response = apiInstance.listTemplates(sort, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#listTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#listTemplates")
    e.printStackTrace()
}
```

### Parameters
| **sort** | **kotlin.String**| Field to order by. This list holds tens of rows per account, so every column is offered and none needs an index. | [optional] [default to Sort.name_] [enum: name, created_at, updated_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| Defaults to asc for the default field and asc for any other. Always tie-broken on id, so the order is total. | [optional] [enum: asc, desc] |

### Return type

[**ListTemplates200Response**](ListTemplates200Response.md)

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

<a id="updateTemplate"></a>
# **updateTemplate**
> Template updateTemplate(id, templateInput)

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
    val result : Template = apiInstance.updateTemplate(id, templateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#updateTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#updateTemplate")
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

