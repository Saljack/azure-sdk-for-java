// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.TrunkedNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** TrunkedNetworkList represents a list of trunked networks. */
@Fluent
public final class TrunkedNetworkList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of trunked networks.
     */
    @JsonProperty(value = "value")
    private List<TrunkedNetworkInner> value;

    /** Creates an instance of TrunkedNetworkList class. */
    public TrunkedNetworkList() {
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
     * @return the TrunkedNetworkList object itself.
     */
    public TrunkedNetworkList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of trunked networks.
     *
     * @return the value value.
     */
    public List<TrunkedNetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of trunked networks.
     *
     * @param value the value value to set.
     * @return the TrunkedNetworkList object itself.
     */
    public TrunkedNetworkList withValue(List<TrunkedNetworkInner> value) {
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