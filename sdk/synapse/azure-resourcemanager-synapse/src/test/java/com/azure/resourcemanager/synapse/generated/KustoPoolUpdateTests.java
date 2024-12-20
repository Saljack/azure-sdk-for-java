// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.KustoPoolUpdate;
import com.azure.resourcemanager.synapse.models.OptimizedAutoscale;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KustoPoolUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KustoPoolUpdate model = BinaryData.fromString(
            "{\"tags\":{\"zhhh\":\"ewnf\",\"mffjkutycyarn\":\"o\",\"pyc\":\"oohguabzoghkt\",\"ot\":\"hcoeocnhzq\"},\"sku\":{\"name\":\"Storage optimized\",\"capacity\":1955213837,\"size\":\"Extra small\"},\"properties\":{\"state\":\"Creating\",\"provisioningState\":\"Running\",\"uri\":\"lohap\",\"dataIngestionUri\":\"nfszpyglqdhmrjz\",\"stateReason\":\"l\",\"optimizedAutoscale\":{\"version\":968773203,\"isEnabled\":false,\"minimum\":1606890839,\"maximum\":2002700390},\"enableStreamingIngest\":true,\"enablePurge\":true,\"languageExtensions\":{\"value\":[{\"languageExtensionName\":\"PYTHON\"},{\"languageExtensionName\":\"R\"},{\"languageExtensionName\":\"PYTHON\"},{\"languageExtensionName\":\"PYTHON\"}]},\"workspaceUID\":\"vsqxfxjelgcmpzqj\"},\"id\":\"hhqxuwyvcacoyviv\",\"name\":\"s\",\"type\":\"zusjsz\"}")
            .toObject(KustoPoolUpdate.class);
        Assertions.assertEquals("ewnf", model.tags().get("zhhh"));
        Assertions.assertEquals(SkuName.STORAGE_OPTIMIZED, model.sku().name());
        Assertions.assertEquals(1955213837, model.sku().capacity());
        Assertions.assertEquals(SkuSize.EXTRA_SMALL, model.sku().size());
        Assertions.assertEquals(968773203, model.optimizedAutoscale().version());
        Assertions.assertEquals(false, model.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1606890839, model.optimizedAutoscale().minimum());
        Assertions.assertEquals(2002700390, model.optimizedAutoscale().maximum());
        Assertions.assertEquals(true, model.enableStreamingIngest());
        Assertions.assertEquals(true, model.enablePurge());
        Assertions.assertEquals("vsqxfxjelgcmpzqj", model.workspaceUid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KustoPoolUpdate model = new KustoPoolUpdate()
            .withTags(mapOf("zhhh", "ewnf", "mffjkutycyarn", "o", "pyc", "oohguabzoghkt", "ot", "hcoeocnhzq"))
            .withSku(new AzureSku().withName(SkuName.STORAGE_OPTIMIZED)
                .withCapacity(1955213837)
                .withSize(SkuSize.EXTRA_SMALL))
            .withOptimizedAutoscale(new OptimizedAutoscale().withVersion(968773203)
                .withIsEnabled(false)
                .withMinimum(1606890839)
                .withMaximum(2002700390))
            .withEnableStreamingIngest(true)
            .withEnablePurge(true)
            .withWorkspaceUid("vsqxfxjelgcmpzqj");
        model = BinaryData.fromObject(model).toObject(KustoPoolUpdate.class);
        Assertions.assertEquals("ewnf", model.tags().get("zhhh"));
        Assertions.assertEquals(SkuName.STORAGE_OPTIMIZED, model.sku().name());
        Assertions.assertEquals(1955213837, model.sku().capacity());
        Assertions.assertEquals(SkuSize.EXTRA_SMALL, model.sku().size());
        Assertions.assertEquals(968773203, model.optimizedAutoscale().version());
        Assertions.assertEquals(false, model.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1606890839, model.optimizedAutoscale().minimum());
        Assertions.assertEquals(2002700390, model.optimizedAutoscale().maximum());
        Assertions.assertEquals(true, model.enableStreamingIngest());
        Assertions.assertEquals(true, model.enablePurge());
        Assertions.assertEquals("vsqxfxjelgcmpzqj", model.workspaceUid());
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
