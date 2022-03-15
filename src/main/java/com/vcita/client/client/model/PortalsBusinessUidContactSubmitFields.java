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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.vcita.client.client.JSON;

/**
 * PortalsBusinessUidContactSubmitFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortalsBusinessUidContactSubmitFields {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public PortalsBusinessUidContactSubmitFields() { 
  }

  public PortalsBusinessUidContactSubmitFields key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Field Id
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field Id")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public PortalsBusinessUidContactSubmitFields value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Field Value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field Value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalsBusinessUidContactSubmitFields portalsBusinessUidContactSubmitFields = (PortalsBusinessUidContactSubmitFields) o;
    return Objects.equals(this.key, portalsBusinessUidContactSubmitFields.key) &&
        Objects.equals(this.value, portalsBusinessUidContactSubmitFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalsBusinessUidContactSubmitFields {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortalsBusinessUidContactSubmitFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortalsBusinessUidContactSubmitFields.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortalsBusinessUidContactSubmitFields is not found in the empty JSON string", PortalsBusinessUidContactSubmitFields.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortalsBusinessUidContactSubmitFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortalsBusinessUidContactSubmitFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortalsBusinessUidContactSubmitFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortalsBusinessUidContactSubmitFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortalsBusinessUidContactSubmitFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortalsBusinessUidContactSubmitFields.class));

       return (TypeAdapter<T>) new TypeAdapter<PortalsBusinessUidContactSubmitFields>() {
           @Override
           public void write(JsonWriter out, PortalsBusinessUidContactSubmitFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortalsBusinessUidContactSubmitFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortalsBusinessUidContactSubmitFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortalsBusinessUidContactSubmitFields
  * @throws IOException if the JSON string is invalid with respect to PortalsBusinessUidContactSubmitFields
  */
  public static PortalsBusinessUidContactSubmitFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortalsBusinessUidContactSubmitFields.class);
  }

 /**
  * Convert an instance of PortalsBusinessUidContactSubmitFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

