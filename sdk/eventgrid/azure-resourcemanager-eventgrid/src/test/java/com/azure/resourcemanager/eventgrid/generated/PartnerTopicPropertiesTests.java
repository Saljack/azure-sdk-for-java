// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicProperties;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerTopicPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTopicProperties model = BinaryData.fromString(
            "{\"partnerRegistrationImmutableId\":\"5fb42706-96e5-4f73-81f8-92fa2760bc6e\",\"source\":\"edm\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"uqn\":{\"description\":\"xbcuiiznkt\",\"displayName\":\"ansnvp\",\"documentationUrl\":\"bmikost\",\"dataSchemaUrl\":\"bkiw\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-11-18T18:14:42Z\",\"provisioningState\":\"Failed\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"sgcrpfbcunezzce\",\"messageForActivation\":\"lfwyfwlwxjwetn\"}")
            .toObject(PartnerTopicProperties.class);
        Assertions.assertEquals(UUID.fromString("5fb42706-96e5-4f73-81f8-92fa2760bc6e"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("edm", model.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("xbcuiiznkt", model.eventTypeInfo().inlineEventTypes().get("uqn").description());
        Assertions.assertEquals("ansnvp", model.eventTypeInfo().inlineEventTypes().get("uqn").displayName());
        Assertions.assertEquals("bmikost", model.eventTypeInfo().inlineEventTypes().get("uqn").documentationUrl());
        Assertions.assertEquals("bkiw", model.eventTypeInfo().inlineEventTypes().get("uqn").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T18:14:42Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.activationState());
        Assertions.assertEquals("sgcrpfbcunezzce", model.partnerTopicFriendlyDescription());
        Assertions.assertEquals("lfwyfwlwxjwetn", model.messageForActivation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTopicProperties model = new PartnerTopicProperties()
            .withPartnerRegistrationImmutableId(UUID.fromString("5fb42706-96e5-4f73-81f8-92fa2760bc6e"))
            .withSource("edm")
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("uqn",
                    new InlineEventProperties().withDescription("xbcuiiznkt")
                        .withDisplayName("ansnvp")
                        .withDocumentationUrl("bmikost")
                        .withDataSchemaUrl("bkiw"))))
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-11-18T18:14:42Z"))
            .withActivationState(PartnerTopicActivationState.NEVER_ACTIVATED)
            .withPartnerTopicFriendlyDescription("sgcrpfbcunezzce")
            .withMessageForActivation("lfwyfwlwxjwetn");
        model = BinaryData.fromObject(model).toObject(PartnerTopicProperties.class);
        Assertions.assertEquals(UUID.fromString("5fb42706-96e5-4f73-81f8-92fa2760bc6e"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("edm", model.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("xbcuiiznkt", model.eventTypeInfo().inlineEventTypes().get("uqn").description());
        Assertions.assertEquals("ansnvp", model.eventTypeInfo().inlineEventTypes().get("uqn").displayName());
        Assertions.assertEquals("bmikost", model.eventTypeInfo().inlineEventTypes().get("uqn").documentationUrl());
        Assertions.assertEquals("bkiw", model.eventTypeInfo().inlineEventTypes().get("uqn").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T18:14:42Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.activationState());
        Assertions.assertEquals("sgcrpfbcunezzce", model.partnerTopicFriendlyDescription());
        Assertions.assertEquals("lfwyfwlwxjwetn", model.messageForActivation());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
