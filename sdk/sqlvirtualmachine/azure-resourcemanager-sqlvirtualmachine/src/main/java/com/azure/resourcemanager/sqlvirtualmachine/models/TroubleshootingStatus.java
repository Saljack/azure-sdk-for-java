// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Status of last troubleshooting operation on this SQL VM. */
@Immutable
public final class TroubleshootingStatus {
    /*
     * Root cause of the issue
     */
    @JsonProperty(value = "rootCause", access = JsonProperty.Access.WRITE_ONLY)
    private String rootCause;

    /*
     * Last troubleshooting trigger time in UTC timezone
     */
    @JsonProperty(value = "lastTriggerTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastTriggerTimeUtc;

    /*
     * Start time in UTC timezone.
     */
    @JsonProperty(value = "startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTimeUtc;

    /*
     * End time in UTC timezone.
     */
    @JsonProperty(value = "endTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTimeUtc;

    /*
     * SQL VM troubleshooting scenario.
     */
    @JsonProperty(value = "troubleshootingScenario", access = JsonProperty.Access.WRITE_ONLY)
    private TroubleshootingScenario troubleshootingScenario;

    /*
     * Troubleshooting properties
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private TroubleshootingAdditionalProperties properties;

    /** Creates an instance of TroubleshootingStatus class. */
    public TroubleshootingStatus() {
    }

    /**
     * Get the rootCause property: Root cause of the issue.
     *
     * @return the rootCause value.
     */
    public String rootCause() {
        return this.rootCause;
    }

    /**
     * Get the lastTriggerTimeUtc property: Last troubleshooting trigger time in UTC timezone.
     *
     * @return the lastTriggerTimeUtc value.
     */
    public OffsetDateTime lastTriggerTimeUtc() {
        return this.lastTriggerTimeUtc;
    }

    /**
     * Get the startTimeUtc property: Start time in UTC timezone.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the endTimeUtc property: End time in UTC timezone.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Get the troubleshootingScenario property: SQL VM troubleshooting scenario.
     *
     * @return the troubleshootingScenario value.
     */
    public TroubleshootingScenario troubleshootingScenario() {
        return this.troubleshootingScenario;
    }

    /**
     * Get the properties property: Troubleshooting properties.
     *
     * @return the properties value.
     */
    public TroubleshootingAdditionalProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}