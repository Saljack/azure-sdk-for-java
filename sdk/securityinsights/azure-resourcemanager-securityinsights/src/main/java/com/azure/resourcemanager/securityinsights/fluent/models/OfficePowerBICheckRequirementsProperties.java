// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.models.DataConnectorTenantId;
import java.io.IOException;

/**
 * Office PowerBI requirements check properties.
 */
@Fluent
public final class OfficePowerBICheckRequirementsProperties extends DataConnectorTenantId {
    /**
     * Creates an instance of OfficePowerBICheckRequirementsProperties class.
     */
    public OfficePowerBICheckRequirementsProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfficePowerBICheckRequirementsProperties withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (tenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tenantId in model OfficePowerBICheckRequirementsProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OfficePowerBICheckRequirementsProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tenantId", tenantId());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OfficePowerBICheckRequirementsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OfficePowerBICheckRequirementsProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OfficePowerBICheckRequirementsProperties.
     */
    public static OfficePowerBICheckRequirementsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OfficePowerBICheckRequirementsProperties deserializedOfficePowerBICheckRequirementsProperties
                = new OfficePowerBICheckRequirementsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tenantId".equals(fieldName)) {
                    deserializedOfficePowerBICheckRequirementsProperties.withTenantId(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOfficePowerBICheckRequirementsProperties;
        });
    }
}
