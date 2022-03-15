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
import com.vcita.client.client.model.PortalsBusinessUidShareDocumentsFormSubmitFields;
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
 * PortalsBusinessUidShareDocumentsFormSubmitFormData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortalsBusinessUidShareDocumentsFormSubmitFormData {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private PortalsBusinessUidShareDocumentsFormSubmitFields fields;

  public PortalsBusinessUidShareDocumentsFormSubmitFormData() { 
  }

  public PortalsBusinessUidShareDocumentsFormSubmitFormData fields(PortalsBusinessUidShareDocumentsFormSubmitFields fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PortalsBusinessUidShareDocumentsFormSubmitFields getFields() {
    return fields;
  }


  public void setFields(PortalsBusinessUidShareDocumentsFormSubmitFields fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalsBusinessUidShareDocumentsFormSubmitFormData portalsBusinessUidShareDocumentsFormSubmitFormData = (PortalsBusinessUidShareDocumentsFormSubmitFormData) o;
    return Objects.equals(this.fields, portalsBusinessUidShareDocumentsFormSubmitFormData.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalsBusinessUidShareDocumentsFormSubmitFormData {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortalsBusinessUidShareDocumentsFormSubmitFormData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PortalsBusinessUidShareDocumentsFormSubmitFormData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortalsBusinessUidShareDocumentsFormSubmitFormData is not found in the empty JSON string", PortalsBusinessUidShareDocumentsFormSubmitFormData.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PortalsBusinessUidShareDocumentsFormSubmitFormData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortalsBusinessUidShareDocumentsFormSubmitFormData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `fields`
      if (jsonObj.getAsJsonObject("fields") != null) {
        PortalsBusinessUidShareDocumentsFormSubmitFields.validateJsonObject(jsonObj.getAsJsonObject("fields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortalsBusinessUidShareDocumentsFormSubmitFormData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortalsBusinessUidShareDocumentsFormSubmitFormData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortalsBusinessUidShareDocumentsFormSubmitFormData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortalsBusinessUidShareDocumentsFormSubmitFormData.class));

       return (TypeAdapter<T>) new TypeAdapter<PortalsBusinessUidShareDocumentsFormSubmitFormData>() {
           @Override
           public void write(JsonWriter out, PortalsBusinessUidShareDocumentsFormSubmitFormData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortalsBusinessUidShareDocumentsFormSubmitFormData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PortalsBusinessUidShareDocumentsFormSubmitFormData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortalsBusinessUidShareDocumentsFormSubmitFormData
  * @throws IOException if the JSON string is invalid with respect to PortalsBusinessUidShareDocumentsFormSubmitFormData
  */
  public static PortalsBusinessUidShareDocumentsFormSubmitFormData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortalsBusinessUidShareDocumentsFormSubmitFormData.class);
  }

 /**
  * Convert an instance of PortalsBusinessUidShareDocumentsFormSubmitFormData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
