// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotoperations.fluent.models.BrokerAuthorizationResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a BrokerAuthorizationResource list operation.
 */
@Immutable
public final class BrokerAuthorizationResourceListResult
    implements JsonSerializable<BrokerAuthorizationResourceListResult> {
    /*
     * The BrokerAuthorizationResource items on this page
     */
    private List<BrokerAuthorizationResourceInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of BrokerAuthorizationResourceListResult class.
     */
    private BrokerAuthorizationResourceListResult() {
    }

    /**
     * Get the value property: The BrokerAuthorizationResource items on this page.
     * 
     * @return the value value.
     */
    public List<BrokerAuthorizationResourceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model BrokerAuthorizationResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BrokerAuthorizationResourceListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BrokerAuthorizationResourceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BrokerAuthorizationResourceListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BrokerAuthorizationResourceListResult.
     */
    public static BrokerAuthorizationResourceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BrokerAuthorizationResourceListResult deserializedBrokerAuthorizationResourceListResult
                = new BrokerAuthorizationResourceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BrokerAuthorizationResourceInner> value
                        = reader.readArray(reader1 -> BrokerAuthorizationResourceInner.fromJson(reader1));
                    deserializedBrokerAuthorizationResourceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedBrokerAuthorizationResourceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBrokerAuthorizationResourceListResult;
        });
    }
}
