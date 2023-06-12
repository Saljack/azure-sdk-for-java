// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.OperationInner;
import com.azure.resourcemanager.databricks.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"iwqvhkh\",\"display\":{\"provider\":\"igdtopbob\",\"resource\":\"ghmewuam\",\"operation\":\"hrzayvvtpgvdf\",\"description\":\"otkftutqxlngx\"}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("iwqvhkh", model.name());
        Assertions.assertEquals("igdtopbob", model.display().provider());
        Assertions.assertEquals("ghmewuam", model.display().resource());
        Assertions.assertEquals("hrzayvvtpgvdf", model.display().operation());
        Assertions.assertEquals("otkftutqxlngx", model.display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withName("iwqvhkh")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("igdtopbob")
                        .withResource("ghmewuam")
                        .withOperation("hrzayvvtpgvdf")
                        .withDescription("otkftutqxlngx"));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("iwqvhkh", model.name());
        Assertions.assertEquals("igdtopbob", model.display().provider());
        Assertions.assertEquals("ghmewuam", model.display().resource());
        Assertions.assertEquals("hrzayvvtpgvdf", model.display().operation());
        Assertions.assertEquals("otkftutqxlngx", model.display().description());
    }
}