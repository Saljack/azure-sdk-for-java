// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The access level allowed for the users in this key set. */
public final class BmcKeySetPrivilegeLevel extends ExpandableStringEnum<BmcKeySetPrivilegeLevel> {
    /** Static value ReadOnly for BmcKeySetPrivilegeLevel. */
    public static final BmcKeySetPrivilegeLevel READ_ONLY = fromString("ReadOnly");

    /** Static value Administrator for BmcKeySetPrivilegeLevel. */
    public static final BmcKeySetPrivilegeLevel ADMINISTRATOR = fromString("Administrator");

    /**
     * Creates a new instance of BmcKeySetPrivilegeLevel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BmcKeySetPrivilegeLevel() {
    }

    /**
     * Creates or finds a BmcKeySetPrivilegeLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BmcKeySetPrivilegeLevel.
     */
    @JsonCreator
    public static BmcKeySetPrivilegeLevel fromString(String name) {
        return fromString(name, BmcKeySetPrivilegeLevel.class);
    }

    /**
     * Gets known BmcKeySetPrivilegeLevel values.
     *
     * @return known BmcKeySetPrivilegeLevel values.
     */
    public static Collection<BmcKeySetPrivilegeLevel> values() {
        return values(BmcKeySetPrivilegeLevel.class);
    }
}