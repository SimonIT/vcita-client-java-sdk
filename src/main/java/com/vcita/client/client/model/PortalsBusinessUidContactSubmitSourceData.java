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


package com.vcita.client.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.vcita.client.client.JSON;

/**
 * PortalsBusinessUidContactSubmitSourceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortalsBusinessUidContactSubmitSourceData {
  public static final String SERIALIZED_NAME_IS_WIDGET = "isWidget";
  @SerializedName(SERIALIZED_NAME_IS_WIDGET)
  private Boolean isWidget;

  public static final String SERIALIZED_NAME_O = "o";
  @SerializedName(SERIALIZED_NAME_O)
  private String o;

  public static final String SERIALIZED_NAME_S = "s";
  @SerializedName(SERIALIZED_NAME_S)
  private String s;

  public static final String SERIALIZED_NAME_TOP_URL = "topUrl";
  @SerializedName(SERIALIZED_NAME_TOP_URL)
  private String topUrl;

  public PortalsBusinessUidContactSubmitSourceData() { 
  }

  public PortalsBusinessUidContactSubmitSourceData isWidget(Boolean isWidget) {
    
    this.isWidget = isWidget;
    return this;
  }

   /**
   * The form submitted from widget or not
   * @return isWidget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The form submitted from widget or not")

  public Boolean getIsWidget() {
    return isWidget;
  }


  public void setIsWidget(Boolean isWidget) {
    this.isWidget = isWidget;
  }


  public PortalsBusinessUidContactSubmitSourceData o(String o) {
    
    this.o = o;
    return this;
  }

   /**
   * The origin type in Base64
   * @return o
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The origin type in Base64")

  public String getO() {
    return o;
  }


  public void setO(String o) {
    this.o = o;
  }


  public PortalsBusinessUidContactSubmitSourceData s(String s) {
    
    this.s = s;
    return this;
  }

   /**
   * The source url
   * @return s
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source url")

  public String getS() {
    return s;
  }


  public void setS(String s) {
    this.s = s;
  }


  public PortalsBusinessUidContactSubmitSourceData topUrl(String topUrl) {
    
    this.topUrl = topUrl;
    return this;
  }

   /**
   * The top url in Base64
   * @return topUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The top url in Base64")

  public String getTopUrl() {
    return topUrl;
  }


  public void setTopUrl(String topUrl) {
    this.topUrl = topUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalsBusinessUidContactSubmitSourceData portalsBusinessUidContactSubmitSourceData = (PortalsBusinessUidContactSubmitSourceData) o;
    return Objects.equals(this.isWidget, portalsBusinessUidContactSubmitSourceData.isWidget) &&
        Objects.equals(this.o, portalsBusinessUidContactSubmitSourceData.o) &&
        Objects.equals(this.s, portalsBusinessUidContactSubmitSourceData.s) &&
        Objects.equals(this.topUrl, portalsBusinessUidContactSubmitSourceData.topUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWidget, o, s, topUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalsBusinessUidContactSubmitSourceData {\n");
    sb.append("    isWidget: ").append(toIndentedString(isWidget)).append("\n");
    sb.append("    o: ").append(toIndentedString(o)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    topUrl: ").append(toIndentedString(topUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("isWidget");
    openapiFields.add("o");
    openapiFields.add("s");
    openapiFields.add("topUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortalsBusinessUidContactSubmitSourceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortalsBusinessUidContactSubmitSourceData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortalsBusinessUidContactSubmitSourceData is not found in the empty JSON string", PortalsBusinessUidContactSubmitSourceData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortalsBusinessUidContactSubmitSourceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortalsBusinessUidContactSubmitSourceData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortalsBusinessUidContactSubmitSourceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortalsBusinessUidContactSubmitSourceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortalsBusinessUidContactSubmitSourceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortalsBusinessUidContactSubmitSourceData.class));

       return (TypeAdapter<T>) new TypeAdapter<PortalsBusinessUidContactSubmitSourceData>() {
           @Override
           public void write(JsonWriter out, PortalsBusinessUidContactSubmitSourceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortalsBusinessUidContactSubmitSourceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortalsBusinessUidContactSubmitSourceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortalsBusinessUidContactSubmitSourceData
  * @throws IOException if the JSON string is invalid with respect to PortalsBusinessUidContactSubmitSourceData
  */
  public static PortalsBusinessUidContactSubmitSourceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortalsBusinessUidContactSubmitSourceData.class);
  }

 /**
  * Convert an instance of PortalsBusinessUidContactSubmitSourceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

