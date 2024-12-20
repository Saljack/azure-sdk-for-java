// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.ForecastDatasetConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ForecastDatasetConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForecastDatasetConfiguration model
            = BinaryData.fromString("{\"columns\":[\"wcfzqljyxgt\"]}").toObject(ForecastDatasetConfiguration.class);
        Assertions.assertEquals("wcfzqljyxgt", model.columns().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForecastDatasetConfiguration model
            = new ForecastDatasetConfiguration().withColumns(Arrays.asList("wcfzqljyxgt"));
        model = BinaryData.fromObject(model).toObject(ForecastDatasetConfiguration.class);
        Assertions.assertEquals("wcfzqljyxgt", model.columns().get(0));
    }
}
