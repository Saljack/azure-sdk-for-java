// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkLinkInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkLinkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkLinkInner model = BinaryData.fromString(
            "{\"etag\":\"w\",\"properties\":{\"virtualNetwork\":{\"id\":\"sjttgzfbish\"},\"metadata\":{\"alpbuxwgipwhon\":\"hajdeyeamdpha\"},\"provisioningState\":\"Creating\"},\"id\":\"shwankixzbinje\",\"name\":\"uttmrywnuzoqft\",\"type\":\"yqzrnkcqvyxlw\"}")
            .toObject(VirtualNetworkLinkInner.class);
        Assertions.assertEquals("sjttgzfbish", model.virtualNetwork().id());
        Assertions.assertEquals("hajdeyeamdpha", model.metadata().get("alpbuxwgipwhon"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkLinkInner model
            = new VirtualNetworkLinkInner().withVirtualNetwork(new SubResource().withId("sjttgzfbish"))
                .withMetadata(mapOf("alpbuxwgipwhon", "hajdeyeamdpha"));
        model = BinaryData.fromObject(model).toObject(VirtualNetworkLinkInner.class);
        Assertions.assertEquals("sjttgzfbish", model.virtualNetwork().id());
        Assertions.assertEquals("hajdeyeamdpha", model.metadata().get("alpbuxwgipwhon"));
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
