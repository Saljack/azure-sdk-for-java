// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The allowed type DNS record types for this profile. */
public final class AllowedEndpointRecordType extends ExpandableStringEnum<AllowedEndpointRecordType> {
    /** Static value DomainName for AllowedEndpointRecordType. */
    public static final AllowedEndpointRecordType DOMAIN_NAME = fromString("DomainName");

    /** Static value IPv4Address for AllowedEndpointRecordType. */
    public static final AllowedEndpointRecordType IPV4ADDRESS = fromString("IPv4Address");

    /** Static value IPv6Address for AllowedEndpointRecordType. */
    public static final AllowedEndpointRecordType IPV6ADDRESS = fromString("IPv6Address");

    /** Static value Any for AllowedEndpointRecordType. */
    public static final AllowedEndpointRecordType ANY = fromString("Any");

    /**
     * Creates a new instance of AllowedEndpointRecordType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AllowedEndpointRecordType() {
    }

    /**
     * Creates or finds a AllowedEndpointRecordType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AllowedEndpointRecordType.
     */
    @JsonCreator
    public static AllowedEndpointRecordType fromString(String name) {
        return fromString(name, AllowedEndpointRecordType.class);
    }

    /**
     * Gets known AllowedEndpointRecordType values.
     *
     * @return known AllowedEndpointRecordType values.
     */
    public static Collection<AllowedEndpointRecordType> values() {
        return values(AllowedEndpointRecordType.class);
    }
}