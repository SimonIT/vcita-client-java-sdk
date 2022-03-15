# ClientApi

All URIs are relative to *http://api.vcita.biz/client_api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**portalsBusinessUidClientGet**](ClientApi.md#portalsBusinessUidClientGet) | **GET** /portals/{business_uid}/client | 


<a name="portalsBusinessUidClientGet"></a>
# **portalsBusinessUidClientGet**
> PortalsBusinessUidClientGet200Response portalsBusinessUidClientGet(authorization, businessUid)



### Example
```java
// Import classes:
import com.vcita.client.client.ApiClient;
import com.vcita.client.client.ApiException;
import com.vcita.client.client.Configuration;
import com.vcita.client.client.auth.*;
import com.vcita.client.client.models.*;
import com.vcita.client.client.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.vcita.biz/client_api/v1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String authorization = "authorization_example"; // String | API Token. The resulting header should look like this: 'Authorization: \"Bearer API_TOKEN\"'
    String businessUid = "businessUid_example"; // String | 
    try {
      PortalsBusinessUidClientGet200Response result = apiInstance.portalsBusinessUidClientGet(authorization, businessUid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#portalsBusinessUidClientGet");
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

[**PortalsBusinessUidClientGet200Response**](PortalsBusinessUidClientGet200Response.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**401** |  |  -  |
**200** | OK |  -  |

