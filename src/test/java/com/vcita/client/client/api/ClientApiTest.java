/*
 * client_api API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vcita.client.client.api;

import com.vcita.client.client.ApiException;
import com.vcita.client.client.model.InlineResponse401;
import com.vcita.client.client.model.PortalsBusinessUidClientGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientApi
 */
@Disabled
public class ClientApiTest {

    private final ClientApi api = new ClientApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portalsBusinessUidClientGetTest() throws ApiException {
        String authorization = null;
        String businessUid = null;
        PortalsBusinessUidClientGet200Response response = api.portalsBusinessUidClientGet(authorization, businessUid);
        // TODO: test validations
    }

}
