# BillingApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBillingCheckout**](BillingApi.md#createBillingCheckout) | **POST** /v1/billing/checkout | Create a plan checkout session |
| [**createUnitsCheckout**](BillingApi.md#createUnitsCheckout) | **POST** /v1/billing/units/checkout | Create a send-units checkout session |
| [**getBilling**](BillingApi.md#getBilling) | **GET** /v1/billing | Get billing status |


<a id="createBillingCheckout"></a>
# **createBillingCheckout**
> CreateBillingCheckout200Response createBillingCheckout(createBillingCheckoutRequest)

Create a plan checkout session

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = BillingApi()
val createBillingCheckoutRequest : CreateBillingCheckoutRequest =  // CreateBillingCheckoutRequest | 
try {
    val result : CreateBillingCheckout200Response = apiInstance.createBillingCheckout(createBillingCheckoutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#createBillingCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#createBillingCheckout")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createBillingCheckoutRequest** | [**CreateBillingCheckoutRequest**](CreateBillingCheckoutRequest.md)|  | |

### Return type

[**CreateBillingCheckout200Response**](CreateBillingCheckout200Response.md)

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

<a id="createUnitsCheckout"></a>
# **createUnitsCheckout**
> CreateUnitsCheckout200Response createUnitsCheckout(createUnitsCheckoutRequest)

Create a send-units checkout session

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = BillingApi()
val createUnitsCheckoutRequest : CreateUnitsCheckoutRequest =  // CreateUnitsCheckoutRequest | 
try {
    val result : CreateUnitsCheckout200Response = apiInstance.createUnitsCheckout(createUnitsCheckoutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#createUnitsCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#createUnitsCheckout")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createUnitsCheckoutRequest** | [**CreateUnitsCheckoutRequest**](CreateUnitsCheckoutRequest.md)|  | |

### Return type

[**CreateUnitsCheckout200Response**](CreateUnitsCheckout200Response.md)

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

<a id="getBilling"></a>
# **getBilling**
> BillingStatus getBilling()

Get billing status

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = BillingApi()
try {
    val result : BillingStatus = apiInstance.getBilling()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#getBilling")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#getBilling")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingStatus**](BillingStatus.md)

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

