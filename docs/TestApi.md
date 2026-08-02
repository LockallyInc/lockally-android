# TestApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1TestInboundPost**](TestApi.md#v1TestInboundPost) | **POST** /v1/test/inbound | Simulate an inbound email (test keys only) |


<a id="v1TestInboundPost"></a>
# **v1TestInboundPost**
> kotlin.Any v1TestInboundPost()

Simulate an inbound email (test keys only)

Runs a synthetic message through the REAL indexing pipeline — thread adoption, deterministic extraction (incl. injection_risk), and the message.received webhook — so the whole agent loop is testable without a real domain or MTA. Requires an lk_test_* key (create with {\&quot;test\&quot;: true} on POST /v1/api-keys). Body: {mailbox, from, subject, text, in_reply_to?, references?}.

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = TestApi()
try {
    val result : kotlin.Any = apiInstance.v1TestInboundPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestApi#v1TestInboundPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestApi#v1TestInboundPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
 - **Accept**: application/json

