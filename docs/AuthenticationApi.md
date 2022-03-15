# AuthenticationApi

All URIs are relative to *http://api.vcita.biz/client_api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**portalsBusinessUidAuthenticationsLogoutPost**](AuthenticationApi.md#portalsBusinessUidAuthenticationsLogoutPost) | **POST** /portals/{business_uid}/authentications/logout | 
[**portalsBusinessUidAuthenticationsSendCodePost**](AuthenticationApi.md#portalsBusinessUidAuthenticationsSendCodePost) | **POST** /portals/{business_uid}/authentications/send_code | 
[**portalsBusinessUidAuthenticationsVerifyCodePost**](AuthenticationApi.md#portalsBusinessUidAuthenticationsVerifyCodePost) | **POST** /portals/{business_uid}/authentications/verify_code | 


<a name="portalsBusinessUidAuthenticationsLogoutPost"></a>
# **portalsBusinessUidAuthenticationsLogoutPost**
> InlineResponse200 portalsBusinessUidAuthenticationsLogoutPost(businessUid)



### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessUid** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="portalsBusinessUidAuthenticationsSendCodePost"></a>
# **portalsBusinessUidAuthenticationsSendCodePost**
> PortalsBusinessUidAuthenticationsSendCodePost200Response portalsBusinessUidAuthenticationsSendCodePost(businessUid, inlineObject2)



### Example
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
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      PortalsBusinessUidAuthenticationsSendCodePost200Response result = apiInstance.portalsBusinessUidAuthenticationsSendCodePost(businessUid, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#portalsBusinessUidAuthenticationsSendCodePost");
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
 **businessUid** | **String**|  |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**PortalsBusinessUidAuthenticationsSendCodePost200Response**](PortalsBusinessUidAuthenticationsSendCodePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="portalsBusinessUidAuthenticationsVerifyCodePost"></a>
# **portalsBusinessUidAuthenticationsVerifyCodePost**
> InlineResponse2001 portalsBusinessUidAuthenticationsVerifyCodePost(businessUid, inlineObject3)



### Example
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
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      InlineResponse2001 result = apiInstance.portalsBusinessUidAuthenticationsVerifyCodePost(businessUid, inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#portalsBusinessUidAuthenticationsVerifyCodePost");
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
 **businessUid** | **String**|  |
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

