// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

/**
 * Defines secondary layer of software-based encryption enablement.
 */
public enum DoubleEncryption {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a DoubleEncryption instance.
     */
    private final String value;

    DoubleEncryption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DoubleEncryption instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DoubleEncryption object, or null if unable to parse.
     */
    public static DoubleEncryption fromString(String value) {
        if (value == null) {
            return null;
        }
        DoubleEncryption[] items = DoubleEncryption.values();
        for (DoubleEncryption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
