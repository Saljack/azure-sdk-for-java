// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.ReplicaInner;
import org.junit.jupiter.api.Assertions;

public final class ReplicaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaInner model = BinaryData.fromString(
            "{\"location\":\"aqtdoqmcbx\",\"properties\":{\"endpoint\":\"yslqbhsfx\",\"provisioningState\":\"Deleting\"},\"id\":\"ytkblmpew\",\"name\":\"wfbkrvrns\",\"type\":\"shqjohxcrsbf\"}")
            .toObject(ReplicaInner.class);
        Assertions.assertEquals("aqtdoqmcbx", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaInner model = new ReplicaInner().withLocation("aqtdoqmcbx");
        model = BinaryData.fromObject(model).toObject(ReplicaInner.class);
        Assertions.assertEquals("aqtdoqmcbx", model.location());
    }
}
