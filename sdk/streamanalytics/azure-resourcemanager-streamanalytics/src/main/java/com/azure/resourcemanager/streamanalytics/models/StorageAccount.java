// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties that are associated with an Azure Storage account.
 */
@Fluent
public class StorageAccount implements JsonSerializable<StorageAccount> {
    /*
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     */
    private String accountName;

    /*
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     */
    private String accountKey;

    /*
     * Authentication Mode.
     */
    private AuthenticationMode authenticationMode;

    /**
     * Creates an instance of StorageAccount class.
     */
    public StorageAccount() {
    }

    /**
     * Get the accountName property: The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     * @param accountName the accountName value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accountKey property: The account key for the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The account key for the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @param accountKey the accountKey value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
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
        jsonWriter.writeStringField("accountName", this.accountName);
        jsonWriter.writeStringField("accountKey", this.accountKey);
        jsonWriter.writeStringField("authenticationMode",
            this.authenticationMode == null ? null : this.authenticationMode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageAccount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageAccount if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageAccount.
     */
    public static StorageAccount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageAccount deserializedStorageAccount = new StorageAccount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountName".equals(fieldName)) {
                    deserializedStorageAccount.accountName = reader.getString();
                } else if ("accountKey".equals(fieldName)) {
                    deserializedStorageAccount.accountKey = reader.getString();
                } else if ("authenticationMode".equals(fieldName)) {
                    deserializedStorageAccount.authenticationMode = AuthenticationMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageAccount;
        });
    }
}
