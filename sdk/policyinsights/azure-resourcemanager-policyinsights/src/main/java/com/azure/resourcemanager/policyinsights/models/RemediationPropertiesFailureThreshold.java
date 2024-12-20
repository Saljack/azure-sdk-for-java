// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The remediation failure threshold settings.
 */
@Fluent
public final class RemediationPropertiesFailureThreshold
    implements JsonSerializable<RemediationPropertiesFailureThreshold> {
    /*
     * A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the
     * percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
     */
    private Float percentage;

    /**
     * Creates an instance of RemediationPropertiesFailureThreshold class.
     */
    public RemediationPropertiesFailureThreshold() {
    }

    /**
     * Get the percentage property: A number between 0.0 to 1.0 representing the percentage failure threshold. The
     * remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this
     * threshold.
     * 
     * @return the percentage value.
     */
    public Float percentage() {
        return this.percentage;
    }

    /**
     * Set the percentage property: A number between 0.0 to 1.0 representing the percentage failure threshold. The
     * remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this
     * threshold.
     * 
     * @param percentage the percentage value to set.
     * @return the RemediationPropertiesFailureThreshold object itself.
     */
    public RemediationPropertiesFailureThreshold withPercentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("percentage", this.percentage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RemediationPropertiesFailureThreshold from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemediationPropertiesFailureThreshold if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RemediationPropertiesFailureThreshold.
     */
    public static RemediationPropertiesFailureThreshold fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemediationPropertiesFailureThreshold deserializedRemediationPropertiesFailureThreshold
                = new RemediationPropertiesFailureThreshold();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("percentage".equals(fieldName)) {
                    deserializedRemediationPropertiesFailureThreshold.percentage
                        = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRemediationPropertiesFailureThreshold;
        });
    }
}
