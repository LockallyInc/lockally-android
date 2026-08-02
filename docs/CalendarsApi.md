# CalendarsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addCalendarMember**](CalendarsApi.md#addCalendarMember) | **POST** /v1/calendars/{id}/members | Add a member to a calendar |
| [**createCalendar**](CalendarsApi.md#createCalendar) | **POST** /v1/calendars | Create a calendar |
| [**createCalendarEvent**](CalendarsApi.md#createCalendarEvent) | **POST** /v1/calendars/{id}/events | Create an event in a calendar |
| [**createCalendarIntegration**](CalendarsApi.md#createCalendarIntegration) | **POST** /v1/calendar-integrations | Create a calendar integration |
| [**deleteCalendar**](CalendarsApi.md#deleteCalendar) | **DELETE** /v1/calendars/{id} | Delete a calendar |
| [**deleteCalendarEvent**](CalendarsApi.md#deleteCalendarEvent) | **DELETE** /v1/calendars/{id}/events/{eventId} | Delete a calendar event |
| [**deleteCalendarIntegration**](CalendarsApi.md#deleteCalendarIntegration) | **DELETE** /v1/calendar-integrations/{id} | Delete a calendar integration |
| [**getCalendar**](CalendarsApi.md#getCalendar) | **GET** /v1/calendars/{id} | Get a calendar |
| [**getCalendarPolicies**](CalendarsApi.md#getCalendarPolicies) | **GET** /v1/calendar-policies | Get calendar policies |
| [**getCalendarSecurity**](CalendarsApi.md#getCalendarSecurity) | **GET** /v1/calendar-security | Get calendar security overview |
| [**listCalendarEvents**](CalendarsApi.md#listCalendarEvents) | **GET** /v1/calendars/{id}/events | List events in a calendar |
| [**listCalendarIntegrations**](CalendarsApi.md#listCalendarIntegrations) | **GET** /v1/calendar-integrations | List calendar integrations |
| [**listCalendarMembers**](CalendarsApi.md#listCalendarMembers) | **GET** /v1/calendars/{id}/members | List calendar members |
| [**listCalendars**](CalendarsApi.md#listCalendars) | **GET** /v1/calendars | List calendars |
| [**removeCalendarMember**](CalendarsApi.md#removeCalendarMember) | **DELETE** /v1/calendars/{id}/members/{memberId} | Remove a member from a calendar |
| [**syncCalendarIntegration**](CalendarsApi.md#syncCalendarIntegration) | **POST** /v1/calendar-integrations/{id}/sync | Trigger sync for a calendar integration |
| [**updateCalendar**](CalendarsApi.md#updateCalendar) | **PATCH** /v1/calendars/{id} | Update a calendar |
| [**updateCalendarEvent**](CalendarsApi.md#updateCalendarEvent) | **PATCH** /v1/calendars/{id}/events/{eventId} | Update a calendar event |
| [**updateCalendarIntegration**](CalendarsApi.md#updateCalendarIntegration) | **PATCH** /v1/calendar-integrations/{id} | Update a calendar integration |
| [**updateCalendarMember**](CalendarsApi.md#updateCalendarMember) | **PATCH** /v1/calendars/{id}/members/{memberId} | Update a calendar member&#39;s role |
| [**updateCalendarPolicies**](CalendarsApi.md#updateCalendarPolicies) | **PATCH** /v1/calendar-policies | Update calendar policies |


<a id="addCalendarMember"></a>
# **addCalendarMember**
> CalendarMember addCalendarMember(id, addCalendarMemberRequest)

Add a member to a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val addCalendarMemberRequest : AddCalendarMemberRequest =  // AddCalendarMemberRequest | 
try {
    val result : CalendarMember = apiInstance.addCalendarMember(id, addCalendarMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#addCalendarMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#addCalendarMember")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addCalendarMemberRequest** | [**AddCalendarMemberRequest**](AddCalendarMemberRequest.md)|  | |

### Return type

[**CalendarMember**](CalendarMember.md)

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

<a id="createCalendar"></a>
# **createCalendar**
> Calendar createCalendar(createCalendarRequest)

Create a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val createCalendarRequest : CreateCalendarRequest =  // CreateCalendarRequest | 
try {
    val result : Calendar = apiInstance.createCalendar(createCalendarRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#createCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#createCalendar")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCalendarRequest** | [**CreateCalendarRequest**](CreateCalendarRequest.md)|  | |

### Return type

[**Calendar**](Calendar.md)

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

<a id="createCalendarEvent"></a>
# **createCalendarEvent**
> CalendarEvent createCalendarEvent(id, createCalendarEventRequest)

Create an event in a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createCalendarEventRequest : CreateCalendarEventRequest =  // CreateCalendarEventRequest | 
try {
    val result : CalendarEvent = apiInstance.createCalendarEvent(id, createCalendarEventRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#createCalendarEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#createCalendarEvent")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCalendarEventRequest** | [**CreateCalendarEventRequest**](CreateCalendarEventRequest.md)|  | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

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

<a id="createCalendarIntegration"></a>
# **createCalendarIntegration**
> CalendarIntegration createCalendarIntegration(createCalendarIntegrationRequest)

Create a calendar integration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val createCalendarIntegrationRequest : CreateCalendarIntegrationRequest =  // CreateCalendarIntegrationRequest | 
try {
    val result : CalendarIntegration = apiInstance.createCalendarIntegration(createCalendarIntegrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#createCalendarIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#createCalendarIntegration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCalendarIntegrationRequest** | [**CreateCalendarIntegrationRequest**](CreateCalendarIntegrationRequest.md)|  | |

### Return type

[**CalendarIntegration**](CalendarIntegration.md)

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

<a id="deleteCalendar"></a>
# **deleteCalendar**
> deleteCalendar(id)

Delete a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteCalendar(id)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#deleteCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#deleteCalendar")
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

<a id="deleteCalendarEvent"></a>
# **deleteCalendarEvent**
> deleteCalendarEvent(id, eventId)

Delete a calendar event

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val eventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteCalendarEvent(id, eventId)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#deleteCalendarEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#deleteCalendarEvent")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventId** | **java.util.UUID**|  | |

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

<a id="deleteCalendarIntegration"></a>
# **deleteCalendarIntegration**
> deleteCalendarIntegration(id)

Delete a calendar integration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteCalendarIntegration(id)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#deleteCalendarIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#deleteCalendarIntegration")
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

<a id="getCalendar"></a>
# **getCalendar**
> Calendar getCalendar(id)

Get a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Calendar = apiInstance.getCalendar(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#getCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#getCalendar")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**Calendar**](Calendar.md)

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

<a id="getCalendarPolicies"></a>
# **getCalendarPolicies**
> CalendarPolicies getCalendarPolicies()

Get calendar policies

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
try {
    val result : CalendarPolicies = apiInstance.getCalendarPolicies()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#getCalendarPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#getCalendarPolicies")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CalendarPolicies**](CalendarPolicies.md)

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

<a id="getCalendarSecurity"></a>
# **getCalendarSecurity**
> GetCalendarSecurity200Response getCalendarSecurity()

Get calendar security overview

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
try {
    val result : GetCalendarSecurity200Response = apiInstance.getCalendarSecurity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#getCalendarSecurity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#getCalendarSecurity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCalendarSecurity200Response**](GetCalendarSecurity200Response.md)

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

<a id="listCalendarEvents"></a>
# **listCalendarEvents**
> ListCalendarEvents200Response listCalendarEvents(id, from, to)

List events in a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val from : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | 
val to : kotlin.time.Instant = 2013-10-20T19:20:30+01:00 // kotlin.time.Instant | 
try {
    val result : ListCalendarEvents200Response = apiInstance.listCalendarEvents(id, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#listCalendarEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#listCalendarEvents")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **from** | **kotlin.time.Instant**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **to** | **kotlin.time.Instant**|  | [optional] |

### Return type

[**ListCalendarEvents200Response**](ListCalendarEvents200Response.md)

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

<a id="listCalendarIntegrations"></a>
# **listCalendarIntegrations**
> ListCalendarIntegrations200Response listCalendarIntegrations()

List calendar integrations

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
try {
    val result : ListCalendarIntegrations200Response = apiInstance.listCalendarIntegrations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#listCalendarIntegrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#listCalendarIntegrations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCalendarIntegrations200Response**](ListCalendarIntegrations200Response.md)

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

<a id="listCalendarMembers"></a>
# **listCalendarMembers**
> ListCalendarMembers200Response listCalendarMembers(id)

List calendar members

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListCalendarMembers200Response = apiInstance.listCalendarMembers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#listCalendarMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#listCalendarMembers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**ListCalendarMembers200Response**](ListCalendarMembers200Response.md)

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

<a id="listCalendars"></a>
# **listCalendars**
> ListCalendars200Response listCalendars()

List calendars

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
try {
    val result : ListCalendars200Response = apiInstance.listCalendars()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#listCalendars")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#listCalendars")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCalendars200Response**](ListCalendars200Response.md)

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

<a id="removeCalendarMember"></a>
# **removeCalendarMember**
> removeCalendarMember(id, memberId)

Remove a member from a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val memberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.removeCalendarMember(id, memberId)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#removeCalendarMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#removeCalendarMember")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **memberId** | **java.util.UUID**|  | |

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

<a id="syncCalendarIntegration"></a>
# **syncCalendarIntegration**
> CalendarIntegration syncCalendarIntegration(id)

Trigger sync for a calendar integration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CalendarIntegration = apiInstance.syncCalendarIntegration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#syncCalendarIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#syncCalendarIntegration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**CalendarIntegration**](CalendarIntegration.md)

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

<a id="updateCalendar"></a>
# **updateCalendar**
> Calendar updateCalendar(id, updateCalendarRequest)

Update a calendar

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCalendarRequest : UpdateCalendarRequest =  // UpdateCalendarRequest | 
try {
    val result : Calendar = apiInstance.updateCalendar(id, updateCalendarRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#updateCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#updateCalendar")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCalendarRequest** | [**UpdateCalendarRequest**](UpdateCalendarRequest.md)|  | |

### Return type

[**Calendar**](Calendar.md)

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

<a id="updateCalendarEvent"></a>
# **updateCalendarEvent**
> CalendarEvent updateCalendarEvent(id, eventId, updateCalendarEventRequest)

Update a calendar event

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val eventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCalendarEventRequest : UpdateCalendarEventRequest =  // UpdateCalendarEventRequest | 
try {
    val result : CalendarEvent = apiInstance.updateCalendarEvent(id, eventId, updateCalendarEventRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#updateCalendarEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#updateCalendarEvent")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **eventId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCalendarEventRequest** | [**UpdateCalendarEventRequest**](UpdateCalendarEventRequest.md)|  | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

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

<a id="updateCalendarIntegration"></a>
# **updateCalendarIntegration**
> CalendarIntegration updateCalendarIntegration(id, updateCalendarIntegrationRequest)

Update a calendar integration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCalendarIntegrationRequest : UpdateCalendarIntegrationRequest =  // UpdateCalendarIntegrationRequest | 
try {
    val result : CalendarIntegration = apiInstance.updateCalendarIntegration(id, updateCalendarIntegrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#updateCalendarIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#updateCalendarIntegration")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCalendarIntegrationRequest** | [**UpdateCalendarIntegrationRequest**](UpdateCalendarIntegrationRequest.md)|  | |

### Return type

[**CalendarIntegration**](CalendarIntegration.md)

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

<a id="updateCalendarMember"></a>
# **updateCalendarMember**
> CalendarMember updateCalendarMember(id, memberId, updateCalendarMemberRequest)

Update a calendar member&#39;s role

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val memberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateCalendarMemberRequest : UpdateCalendarMemberRequest =  // UpdateCalendarMemberRequest | 
try {
    val result : CalendarMember = apiInstance.updateCalendarMember(id, memberId, updateCalendarMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#updateCalendarMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#updateCalendarMember")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **memberId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCalendarMemberRequest** | [**UpdateCalendarMemberRequest**](UpdateCalendarMemberRequest.md)|  | |

### Return type

[**CalendarMember**](CalendarMember.md)

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

<a id="updateCalendarPolicies"></a>
# **updateCalendarPolicies**
> CalendarPolicies updateCalendarPolicies(updateCalendarPoliciesRequest)

Update calendar policies

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = CalendarsApi()
val updateCalendarPoliciesRequest : UpdateCalendarPoliciesRequest =  // UpdateCalendarPoliciesRequest | 
try {
    val result : CalendarPolicies = apiInstance.updateCalendarPolicies(updateCalendarPoliciesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarsApi#updateCalendarPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarsApi#updateCalendarPolicies")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCalendarPoliciesRequest** | [**UpdateCalendarPoliciesRequest**](UpdateCalendarPoliciesRequest.md)|  | |

### Return type

[**CalendarPolicies**](CalendarPolicies.md)

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

