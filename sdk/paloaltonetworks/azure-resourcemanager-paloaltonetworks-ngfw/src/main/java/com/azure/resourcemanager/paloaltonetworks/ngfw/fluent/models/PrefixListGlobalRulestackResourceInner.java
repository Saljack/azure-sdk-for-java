// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** GlobalRulestack prefixList. */
@Fluent
public final class PrefixListGlobalRulestackResourceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties", required = true)
    private PrefixObject innerProperties = new PrefixObject();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of PrefixListGlobalRulestackResourceInner class. */
    public PrefixListGlobalRulestackResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private PrefixObject innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: prefix description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: prefix description.
     *
     * @param description the description value to set.
     * @return the PrefixListGlobalRulestackResourceInner object itself.
     */
    public PrefixListGlobalRulestackResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrefixObject();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the prefixList property: prefix list.
     *
     * @return the prefixList value.
     */
    public List<String> prefixList() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixList();
    }

    /**
     * Set the prefixList property: prefix list.
     *
     * @param prefixList the prefixList value to set.
     * @return the PrefixListGlobalRulestackResourceInner object itself.
     */
    public PrefixListGlobalRulestackResourceInner withPrefixList(List<String> prefixList) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrefixObject();
        }
        this.innerProperties().withPrefixList(prefixList);
        return this;
    }

    /**
     * Get the etag property: etag info.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Set the etag property: etag info.
     *
     * @param etag the etag value to set.
     * @return the PrefixListGlobalRulestackResourceInner object itself.
     */
    public PrefixListGlobalRulestackResourceInner withEtag(String etag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrefixObject();
        }
        this.innerProperties().withEtag(etag);
        return this;
    }

    /**
     * Get the auditComment property: comment for this object.
     *
     * @return the auditComment value.
     */
    public String auditComment() {
        return this.innerProperties() == null ? null : this.innerProperties().auditComment();
    }

    /**
     * Set the auditComment property: comment for this object.
     *
     * @param auditComment the auditComment value to set.
     * @return the PrefixListGlobalRulestackResourceInner object itself.
     */
    public PrefixListGlobalRulestackResourceInner withAuditComment(String auditComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrefixObject();
        }
        this.innerProperties().withAuditComment(auditComment);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model PrefixListGlobalRulestackResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrefixListGlobalRulestackResourceInner.class);
}