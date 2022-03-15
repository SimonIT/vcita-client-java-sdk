# FormsApi

All URIs are relative to *http://api.vcita.biz/client_api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**portalsBusinessUidContactGetFormGet**](FormsApi.md#portalsBusinessUidContactGetFormGet) | **GET** /portals/{business_uid}/contact/get_form | Get Leave Details Form
[**portalsBusinessUidContactSubmitPost**](FormsApi.md#portalsBusinessUidContactSubmitPost) | **POST** /portals/{business_uid}/contact/submit | Submits Leave Details Form
[**portalsBusinessUidShareDocumentsFormGetFormGet**](FormsApi.md#portalsBusinessUidShareDocumentsFormGetFormGet) | **GET** /portals/{business_uid}/share_documents_form/get_form | Get Share Documents Form
[**portalsBusinessUidShareDocumentsFormSubmitPost**](FormsApi.md#portalsBusinessUidShareDocumentsFormSubmitPost) | **POST** /portals/{business_uid}/share_documents_form/submit | Submits Share Documents Form


<a name="portalsBusinessUidContactGetFormGet"></a>
# **portalsBusinessUidContactGetFormGet**
> PortalsBusinessUidContactGetFormGet200Response portalsBusinessUidContactGetFormGet(businessUid, authorization)

Get Leave Details Form

Gets the leave details form of the business.

### Example
```java
// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.auth.*;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.FormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FormsApi apiInstance = new FormsApi(defaultClient);
    String businessUid = "businessUid_example"; // String | business_uid
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    try {
      PortalsBusinessUidContactGetFormGet200Response result = apiInstance.portalsBusinessUidContactGetFormGet(businessUid, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#portalsBusinessUidContactGetFormGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessUid** | **String**| business_uid |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |

### Return type

[**PortalsBusinessUidContactGetFormGet200Response**](PortalsBusinessUidContactGetFormGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="portalsBusinessUidContactSubmitPost"></a>
# **portalsBusinessUidContactSubmitPost**
> PortalsBusinessUidContactSubmitPost200Response portalsBusinessUidContactSubmitPost(businessUid, authorization, inlineObject)

Submits Leave Details Form

Submits Leave Details Form to the business.

### Example
```java
// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.auth.*;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.FormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FormsApi apiInstance = new FormsApi(defaultClient);
    String businessUid = "businessUid_example"; // String | business_uid
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      PortalsBusinessUidContactSubmitPost200Response result = apiInstance.portalsBusinessUidContactSubmitPost(businessUid, authorization, inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#portalsBusinessUidContactSubmitPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessUid** | **String**| business_uid |
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**PortalsBusinessUidContactSubmitPost200Response**](PortalsBusinessUidContactSubmitPost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="portalsBusinessUidShareDocumentsFormGetFormGet"></a>
# **portalsBusinessUidShareDocumentsFormGetFormGet**
> PortalsBusinessUidShareDocumentsFormGetFormGet200Response portalsBusinessUidShareDocumentsFormGetFormGet(authorization, businessUid)

Get Share Documents Form

Gets the share documents form of the business.

### Example
```java
// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.auth.*;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.FormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FormsApi apiInstance = new FormsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessUid = "businessUid_example"; // String | 
    try {
      PortalsBusinessUidShareDocumentsFormGetFormGet200Response result = apiInstance.portalsBusinessUidShareDocumentsFormGetFormGet(authorization, businessUid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#portalsBusinessUidShareDocumentsFormGetFormGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **businessUid** | **String**|  |

### Return type

[**PortalsBusinessUidShareDocumentsFormGetFormGet200Response**](PortalsBusinessUidShareDocumentsFormGetFormGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Share Documents Form |  -  |

<a name="portalsBusinessUidShareDocumentsFormSubmitPost"></a>
# **portalsBusinessUidShareDocumentsFormSubmitPost**
> PortalsBusinessUidShareDocumentsFormSubmitPost200Response portalsBusinessUidShareDocumentsFormSubmitPost(authorization, businessUid, formData)

Submits Share Documents Form

Submits Share Documents Form to the business.

### Example
```java
// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.auth.*;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.FormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    FormsApi apiInstance = new FormsApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessUid = "businessUid_example"; // String | 
    List<PortalsBusinessUidShareDocumentsFormSubmitFormData> formData = Arrays.asList(); // List<PortalsBusinessUidShareDocumentsFormSubmitFormData> | 
    try {
      PortalsBusinessUidShareDocumentsFormSubmitPost200Response result = apiInstance.portalsBusinessUidShareDocumentsFormSubmitPost(authorization, businessUid, formData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#portalsBusinessUidShareDocumentsFormSubmitPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API Token. The resulting header should look like this: &#39;Authorization: \&quot;Bearer API_TOKEN\&quot;&#39; |
 **businessUid** | **String**|  |
 **formData** | [**List&lt;PortalsBusinessUidShareDocumentsFormSubmitFormData&gt;**](PortalsBusinessUidShareDocumentsFormSubmitFormData.md)|  | [optional]

### Return type

[**PortalsBusinessUidShareDocumentsFormSubmitPost200Response**](PortalsBusinessUidShareDocumentsFormSubmitPost200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Share Documents Form |  -  |

