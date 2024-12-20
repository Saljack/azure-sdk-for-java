// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A collection of network authorization rules.
 */
@Fluent
public final class NetworkAcls implements JsonSerializable<NetworkAcls> {
    /*
     * List of IP rules.
     */
    private List<IpRule> ipRules;

    /*
     * A default (public Internet) network authorization rule, which contains rights if no other network rule matches.
     */
    private PublicInternetAuthorizationRule publicNetworkRule;

    /**
     * Creates an instance of NetworkAcls class.
     */
    public NetworkAcls() {
    }

    /**
     * Get the ipRules property: List of IP rules.
     * 
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IP rules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkAcls object itself.
     */
    public NetworkAcls withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the publicNetworkRule property: A default (public Internet) network authorization rule, which contains rights
     * if no other network rule matches.
     * 
     * @return the publicNetworkRule value.
     */
    public PublicInternetAuthorizationRule publicNetworkRule() {
        return this.publicNetworkRule;
    }

    /**
     * Set the publicNetworkRule property: A default (public Internet) network authorization rule, which contains rights
     * if no other network rule matches.
     * 
     * @param publicNetworkRule the publicNetworkRule value to set.
     * @return the NetworkAcls object itself.
     */
    public NetworkAcls withPublicNetworkRule(PublicInternetAuthorizationRule publicNetworkRule) {
        this.publicNetworkRule = publicNetworkRule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (publicNetworkRule() != null) {
            publicNetworkRule().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("ipRules", this.ipRules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("publicNetworkRule", this.publicNetworkRule);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkAcls from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkAcls if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkAcls.
     */
    public static NetworkAcls fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkAcls deserializedNetworkAcls = new NetworkAcls();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipRules".equals(fieldName)) {
                    List<IpRule> ipRules = reader.readArray(reader1 -> IpRule.fromJson(reader1));
                    deserializedNetworkAcls.ipRules = ipRules;
                } else if ("publicNetworkRule".equals(fieldName)) {
                    deserializedNetworkAcls.publicNetworkRule = PublicInternetAuthorizationRule.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkAcls;
        });
    }
}
