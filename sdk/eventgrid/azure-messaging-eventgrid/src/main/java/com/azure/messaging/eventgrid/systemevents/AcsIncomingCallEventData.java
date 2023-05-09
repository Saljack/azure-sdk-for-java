// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for an Microsoft.Communication.IncomingCall event. */
@Fluent
public final class AcsIncomingCallEventData {
    /*
     * The communication identifier of the target user.
     */
    @JsonProperty(value = "to")
    private CommunicationIdentifierModel toCommunicationIdentifier;

    /*
     * The communication identifier of the user who initiated the call.
     */
    @JsonProperty(value = "from")
    private CommunicationIdentifierModel fromCommunicationIdentifier;

    /*
     * The Id of the server call
     */
    @JsonProperty(value = "serverCallId")
    private String serverCallId;

    /*
     * Display name of caller.
     */
    @JsonProperty(value = "callerDisplayName")
    private String callerDisplayName;

    /*
     * Custom Context of Incoming Call
     */
    @JsonProperty(value = "customContext")
    private AcsIncomingCallCustomContext customContext;

    /*
     * Signed incoming call context.
     */
    @JsonProperty(value = "incomingCallContext")
    private String incomingCallContext;

    /*
     * CorrelationId (CallId).
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /** Creates an instance of AcsIncomingCallEventData class. */
    public AcsIncomingCallEventData() {}

    /**
     * Get the toCommunicationIdentifier property: The communication identifier of the target user.
     *
     * @return the toCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getToCommunicationIdentifier() {
        return this.toCommunicationIdentifier;
    }

    /**
     * Set the toCommunicationIdentifier property: The communication identifier of the target user.
     *
     * @param toCommunicationIdentifier the toCommunicationIdentifier value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setToCommunicationIdentifier(
            CommunicationIdentifierModel toCommunicationIdentifier) {
        this.toCommunicationIdentifier = toCommunicationIdentifier;
        return this;
    }

    /**
     * Get the fromCommunicationIdentifier property: The communication identifier of the user who initiated the call.
     *
     * @return the fromCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getFromCommunicationIdentifier() {
        return this.fromCommunicationIdentifier;
    }

    /**
     * Set the fromCommunicationIdentifier property: The communication identifier of the user who initiated the call.
     *
     * @param fromCommunicationIdentifier the fromCommunicationIdentifier value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setFromCommunicationIdentifier(
            CommunicationIdentifierModel fromCommunicationIdentifier) {
        this.fromCommunicationIdentifier = fromCommunicationIdentifier;
        return this;
    }

    /**
     * Get the serverCallId property: The Id of the server call.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Set the serverCallId property: The Id of the server call.
     *
     * @param serverCallId the serverCallId value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setServerCallId(String serverCallId) {
        this.serverCallId = serverCallId;
        return this;
    }

    /**
     * Get the callerDisplayName property: Display name of caller.
     *
     * @return the callerDisplayName value.
     */
    public String getCallerDisplayName() {
        return this.callerDisplayName;
    }

    /**
     * Set the callerDisplayName property: Display name of caller.
     *
     * @param callerDisplayName the callerDisplayName value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setCallerDisplayName(String callerDisplayName) {
        this.callerDisplayName = callerDisplayName;
        return this;
    }

    /**
     * Get the customContext property: Custom Context of Incoming Call.
     *
     * @return the customContext value.
     */
    public AcsIncomingCallCustomContext getCustomContext() {
        return this.customContext;
    }

    /**
     * Set the customContext property: Custom Context of Incoming Call.
     *
     * @param customContext the customContext value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setCustomContext(AcsIncomingCallCustomContext customContext) {
        this.customContext = customContext;
        return this;
    }

    /**
     * Get the incomingCallContext property: Signed incoming call context.
     *
     * @return the incomingCallContext value.
     */
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: Signed incoming call context.
     *
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the correlationId property: CorrelationId (CallId).
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: CorrelationId (CallId).
     *
     * @param correlationId the correlationId value to set.
     * @return the AcsIncomingCallEventData object itself.
     */
    public AcsIncomingCallEventData setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
}