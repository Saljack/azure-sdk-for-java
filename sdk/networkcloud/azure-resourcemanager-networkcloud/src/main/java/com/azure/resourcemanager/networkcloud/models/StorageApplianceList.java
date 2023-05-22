// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.StorageApplianceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** StorageApplianceList represents a list of storage appliances. */
@Fluent
public final class StorageApplianceList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of storage appliances.
     */
    @JsonProperty(value = "value")
    private List<StorageApplianceInner> value;

    /** Creates an instance of StorageApplianceList class. */
    public StorageApplianceList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the StorageApplianceList object itself.
     */
    public StorageApplianceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of storage appliances.
     *
     * @return the value value.
     */
    public List<StorageApplianceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of storage appliances.
     *
     * @param value the value value to set.
     * @return the StorageApplianceList object itself.
     */
    public StorageApplianceList withValue(List<StorageApplianceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}