// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LabelFields. */
public final class LabelFields extends ExpandableStringEnum<LabelFields> {
    /** Static value name for LabelFields. */
    public static final LabelFields NAME = fromString("name");

    /**
     * Creates a new instance of LabelFields value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LabelFields() {}

    /**
     * Creates or finds a LabelFields from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LabelFields.
     */
    @JsonCreator
    public static LabelFields fromString(String name) {
        return fromString(name, LabelFields.class);
    }

    /**
     * Gets known LabelFields values.
     *
     * @return known LabelFields values.
     */
    public static Collection<LabelFields> values() {
        return values(LabelFields.class);
    }
}