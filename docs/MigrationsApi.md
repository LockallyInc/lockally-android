# MigrationsApi

All URIs are relative to *https://api.lockally.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelMigration**](MigrationsApi.md#cancelMigration) | **POST** /v1/migrations/{id}/cancel | Cancel a running migration |
| [**checkMigrationDNS**](MigrationsApi.md#checkMigrationDNS) | **GET** /v1/migrations/{id}/dns-check | Check DNS readiness for cutover |
| [**createMigration**](MigrationsApi.md#createMigration) | **POST** /v1/migrations | Create a migration |
| [**createMigrationCredential**](MigrationsApi.md#createMigrationCredential) | **POST** /v1/migrations/credentials | Store a migration credential |
| [**deleteMigration**](MigrationsApi.md#deleteMigration) | **DELETE** /v1/migrations/{id} | Delete a migration |
| [**deleteMigrationCredential**](MigrationsApi.md#deleteMigrationCredential) | **DELETE** /v1/migrations/credentials/{id} | Delete a migration credential |
| [**deltaSyncMigration**](MigrationsApi.md#deltaSyncMigration) | **POST** /v1/migrations/{id}/delta-sync | Run a delta sync |
| [**discoverMigration**](MigrationsApi.md#discoverMigration) | **POST** /v1/migrations/{id}/discover | Discover source mailboxes |
| [**finalSyncMigration**](MigrationsApi.md#finalSyncMigration) | **POST** /v1/migrations/{id}/final-sync | Run the final sync before cutover |
| [**getMigration**](MigrationsApi.md#getMigration) | **GET** /v1/migrations/{id} | Get a migration |
| [**getMigrationProgress**](MigrationsApi.md#getMigrationProgress) | **GET** /v1/migrations/{id}/progress | Get migration progress |
| [**listMigrationCredentials**](MigrationsApi.md#listMigrationCredentials) | **GET** /v1/migrations/credentials | List migration credentials |
| [**listMigrationEvents**](MigrationsApi.md#listMigrationEvents) | **GET** /v1/migrations/{id}/events | List migration events |
| [**listMigrationMailboxes**](MigrationsApi.md#listMigrationMailboxes) | **GET** /v1/migrations/{id}/mailboxes | List migration mailboxes |
| [**listMigrations**](MigrationsApi.md#listMigrations) | **GET** /v1/migrations | List migrations |
| [**mapMigration**](MigrationsApi.md#mapMigration) | **POST** /v1/migrations/{id}/map | Map source to destination mailboxes |
| [**retryMigration**](MigrationsApi.md#retryMigration) | **POST** /v1/migrations/{id}/retry | Retry a failed or cancelled migration |
| [**startMigration**](MigrationsApi.md#startMigration) | **POST** /v1/migrations/{id}/start | Start the migration |
| [**updateMigration**](MigrationsApi.md#updateMigration) | **PATCH** /v1/migrations/{id} | Update a migration |
| [**updateMigrationMailbox**](MigrationsApi.md#updateMigrationMailbox) | **PATCH** /v1/migrations/{id}/mailboxes/{mbxId} | Update a migration mailbox |
| [**validateMigration**](MigrationsApi.md#validateMigration) | **POST** /v1/migrations/{id}/validate | Validate migrated data |


<a id="cancelMigration"></a>
# **cancelMigration**
> DiscoverMigration202Response cancelMigration(id)

Cancel a running migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscoverMigration202Response = apiInstance.cancelMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#cancelMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#cancelMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**DiscoverMigration202Response**](DiscoverMigration202Response.md)

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

<a id="checkMigrationDNS"></a>
# **checkMigrationDNS**
> kotlin.Any checkMigrationDNS(id)

Check DNS readiness for cutover

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Any = apiInstance.checkMigrationDNS(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#checkMigrationDNS")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#checkMigrationDNS")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

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
 - **Accept**: application/json, application/problem+json

<a id="createMigration"></a>
# **createMigration**
> Migration createMigration(createMigrationRequest)

Create a migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val createMigrationRequest : CreateMigrationRequest =  // CreateMigrationRequest | 
try {
    val result : Migration = apiInstance.createMigration(createMigrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#createMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#createMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createMigrationRequest** | [**CreateMigrationRequest**](CreateMigrationRequest.md)|  | |

### Return type

[**Migration**](Migration.md)

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

<a id="createMigrationCredential"></a>
# **createMigrationCredential**
> MigrationCredential createMigrationCredential(createMigrationCredentialRequest)

Store a migration credential

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val createMigrationCredentialRequest : CreateMigrationCredentialRequest =  // CreateMigrationCredentialRequest | 
try {
    val result : MigrationCredential = apiInstance.createMigrationCredential(createMigrationCredentialRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#createMigrationCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#createMigrationCredential")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createMigrationCredentialRequest** | [**CreateMigrationCredentialRequest**](CreateMigrationCredentialRequest.md)|  | |

### Return type

[**MigrationCredential**](MigrationCredential.md)

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

<a id="deleteMigration"></a>
# **deleteMigration**
> deleteMigration(id)

Delete a migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteMigration(id)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#deleteMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#deleteMigration")
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

<a id="deleteMigrationCredential"></a>
# **deleteMigrationCredential**
> deleteMigrationCredential(id)

Delete a migration credential

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteMigrationCredential(id)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#deleteMigrationCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#deleteMigrationCredential")
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

<a id="deltaSyncMigration"></a>
# **deltaSyncMigration**
> StartMigration202Response deltaSyncMigration(id)

Run a delta sync

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StartMigration202Response = apiInstance.deltaSyncMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#deltaSyncMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#deltaSyncMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**StartMigration202Response**](StartMigration202Response.md)

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

<a id="discoverMigration"></a>
# **discoverMigration**
> DiscoverMigration202Response discoverMigration(id)

Discover source mailboxes

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscoverMigration202Response = apiInstance.discoverMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#discoverMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#discoverMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**DiscoverMigration202Response**](DiscoverMigration202Response.md)

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

<a id="finalSyncMigration"></a>
# **finalSyncMigration**
> StartMigration202Response finalSyncMigration(id)

Run the final sync before cutover

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StartMigration202Response = apiInstance.finalSyncMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#finalSyncMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#finalSyncMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**StartMigration202Response**](StartMigration202Response.md)

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

<a id="getMigration"></a>
# **getMigration**
> Migration getMigration(id)

Get a migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Migration = apiInstance.getMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#getMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#getMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**Migration**](Migration.md)

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

<a id="getMigrationProgress"></a>
# **getMigrationProgress**
> MigrationProgress getMigrationProgress(id)

Get migration progress

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MigrationProgress = apiInstance.getMigrationProgress(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#getMigrationProgress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#getMigrationProgress")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**MigrationProgress**](MigrationProgress.md)

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

<a id="listMigrationCredentials"></a>
# **listMigrationCredentials**
> ListMigrationCredentials200Response listMigrationCredentials()

List migration credentials

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
try {
    val result : ListMigrationCredentials200Response = apiInstance.listMigrationCredentials()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#listMigrationCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#listMigrationCredentials")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMigrationCredentials200Response**](ListMigrationCredentials200Response.md)

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

<a id="listMigrationEvents"></a>
# **listMigrationEvents**
> ListMigrationEvents200Response listMigrationEvents(id)

List migration events

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListMigrationEvents200Response = apiInstance.listMigrationEvents(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#listMigrationEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#listMigrationEvents")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**ListMigrationEvents200Response**](ListMigrationEvents200Response.md)

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

<a id="listMigrationMailboxes"></a>
# **listMigrationMailboxes**
> ListMigrationMailboxes200Response listMigrationMailboxes(id)

List migration mailboxes

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListMigrationMailboxes200Response = apiInstance.listMigrationMailboxes(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#listMigrationMailboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#listMigrationMailboxes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**ListMigrationMailboxes200Response**](ListMigrationMailboxes200Response.md)

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

<a id="listMigrations"></a>
# **listMigrations**
> ListMigrations200Response listMigrations()

List migrations

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
try {
    val result : ListMigrations200Response = apiInstance.listMigrations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#listMigrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#listMigrations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMigrations200Response**](ListMigrations200Response.md)

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

<a id="mapMigration"></a>
# **mapMigration**
> DiscoverMigration202Response mapMigration(id, mapMigrationRequest)

Map source to destination mailboxes

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mapMigrationRequest : MapMigrationRequest =  // MapMigrationRequest | 
try {
    val result : DiscoverMigration202Response = apiInstance.mapMigration(id, mapMigrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#mapMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#mapMigration")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mapMigrationRequest** | [**MapMigrationRequest**](MapMigrationRequest.md)|  | |

### Return type

[**DiscoverMigration202Response**](DiscoverMigration202Response.md)

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

<a id="retryMigration"></a>
# **retryMigration**
> DiscoverMigration202Response retryMigration(id)

Retry a failed or cancelled migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscoverMigration202Response = apiInstance.retryMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#retryMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#retryMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**DiscoverMigration202Response**](DiscoverMigration202Response.md)

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

<a id="startMigration"></a>
# **startMigration**
> StartMigration202Response startMigration(id)

Start the migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StartMigration202Response = apiInstance.startMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#startMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#startMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**StartMigration202Response**](StartMigration202Response.md)

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

<a id="updateMigration"></a>
# **updateMigration**
> Migration updateMigration(id, updateMigrationRequest)

Update a migration

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateMigrationRequest : UpdateMigrationRequest =  // UpdateMigrationRequest | 
try {
    val result : Migration = apiInstance.updateMigration(id, updateMigrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#updateMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#updateMigration")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMigrationRequest** | [**UpdateMigrationRequest**](UpdateMigrationRequest.md)|  | |

### Return type

[**Migration**](Migration.md)

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

<a id="updateMigrationMailbox"></a>
# **updateMigrationMailbox**
> updateMigrationMailbox(id, mbxId, updateMigrationMailboxRequest)

Update a migration mailbox

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val mbxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateMigrationMailboxRequest : UpdateMigrationMailboxRequest =  // UpdateMigrationMailboxRequest | 
try {
    apiInstance.updateMigrationMailbox(id, mbxId, updateMigrationMailboxRequest)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#updateMigrationMailbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#updateMigrationMailbox")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **mbxId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMigrationMailboxRequest** | [**UpdateMigrationMailboxRequest**](UpdateMigrationMailboxRequest.md)|  | |

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

<a id="validateMigration"></a>
# **validateMigration**
> StartMigration202Response validateMigration(id)

Validate migrated data

### Example
```kotlin
// Import classes:
//import com.lockally.sdk.infrastructure.*
//import com.lockally.sdk.model.*

val apiInstance = MigrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StartMigration202Response = apiInstance.validateMigration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#validateMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#validateMigration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**StartMigration202Response**](StartMigration202Response.md)

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

