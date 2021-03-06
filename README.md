# vcita-client-java-sdk

client_api API
- API version: v2.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.vcita.client</groupId>
  <artifactId>vcita-client-java-sdk</artifactId>
  <version>v2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'vcita-client-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'vcita-client-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.vcita.client:vcita-client-java-sdk:v2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/vcita-client-java-sdk-v2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String businessUid = "businessUid_example"; // String | 
    try {
      InlineResponse200 result = apiInstance.portalsBusinessUidAuthenticationsLogoutPost(businessUid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#portalsBusinessUidAuthenticationsLogoutPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.vcita.biz/client_api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**portalsBusinessUidAuthenticationsLogoutPost**](docs/AuthenticationApi.md#portalsBusinessUidAuthenticationsLogoutPost) | **POST** /portals/{business_uid}/authentications/logout | 
*AuthenticationApi* | [**portalsBusinessUidAuthenticationsSendCodePost**](docs/AuthenticationApi.md#portalsBusinessUidAuthenticationsSendCodePost) | **POST** /portals/{business_uid}/authentications/send_code | 
*AuthenticationApi* | [**portalsBusinessUidAuthenticationsVerifyCodePost**](docs/AuthenticationApi.md#portalsBusinessUidAuthenticationsVerifyCodePost) | **POST** /portals/{business_uid}/authentications/verify_code | 
*ClientApi* | [**portalsBusinessUidClientGet**](docs/ClientApi.md#portalsBusinessUidClientGet) | **GET** /portals/{business_uid}/client | 
*FormsApi* | [**portalsBusinessUidContactGetFormGet**](docs/FormsApi.md#portalsBusinessUidContactGetFormGet) | **GET** /portals/{business_uid}/contact/get_form | Get Leave Details Form
*FormsApi* | [**portalsBusinessUidContactSubmitPost**](docs/FormsApi.md#portalsBusinessUidContactSubmitPost) | **POST** /portals/{business_uid}/contact/submit | Submits Leave Details Form
*FormsApi* | [**portalsBusinessUidShareDocumentsFormGetFormGet**](docs/FormsApi.md#portalsBusinessUidShareDocumentsFormGetFormGet) | **GET** /portals/{business_uid}/share_documents_form/get_form | Get Share Documents Form
*FormsApi* | [**portalsBusinessUidShareDocumentsFormSubmitPost**](docs/FormsApi.md#portalsBusinessUidShareDocumentsFormSubmitPost) | **POST** /portals/{business_uid}/share_documents_form/submit | Submits Share Documents Form


## Documentation for Models

 - [Client](docs/Client.md)
 - [Data](docs/Data.md)
 - [Data1](docs/Data1.md)
 - [Data2](docs/Data2.md)
 - [Data3](docs/Data3.md)
 - [Field](docs/Field.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [Matter](docs/Matter.md)
 - [PortalsBusinessUidAuthenticationsSendCodePost200Response](docs/PortalsBusinessUidAuthenticationsSendCodePost200Response.md)
 - [PortalsBusinessUidClientGet200Response](docs/PortalsBusinessUidClientGet200Response.md)
 - [PortalsBusinessUidContactGetFormGet200Response](docs/PortalsBusinessUidContactGetFormGet200Response.md)
 - [PortalsBusinessUidContactSubmitFields](docs/PortalsBusinessUidContactSubmitFields.md)
 - [PortalsBusinessUidContactSubmitFormData](docs/PortalsBusinessUidContactSubmitFormData.md)
 - [PortalsBusinessUidContactSubmitPost200Response](docs/PortalsBusinessUidContactSubmitPost200Response.md)
 - [PortalsBusinessUidContactSubmitSourceData](docs/PortalsBusinessUidContactSubmitSourceData.md)
 - [PortalsBusinessUidShareDocumentsFormGetFormGet200Response](docs/PortalsBusinessUidShareDocumentsFormGetFormGet200Response.md)
 - [PortalsBusinessUidShareDocumentsFormSubmitFields](docs/PortalsBusinessUidShareDocumentsFormSubmitFields.md)
 - [PortalsBusinessUidShareDocumentsFormSubmitFormData](docs/PortalsBusinessUidShareDocumentsFormSubmitFormData.md)
 - [PortalsBusinessUidShareDocumentsFormSubmitPost200Response](docs/PortalsBusinessUidShareDocumentsFormSubmitPost200Response.md)
 - [Section](docs/Section.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### default

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://ignore.myclients.io
- **Scopes**: 
  - client_api: All client_api related operations
  - client_api_create: client_api create scope
  - client_api_delete: client_api delete scope
  - client_api_read: client_api read scope
  - client_api_update: client_api update scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



