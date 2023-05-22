// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupFormat;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupSettings;
import org.junit.jupiter.api.Assertions;

public final class BackupSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupSettings model =
            BinaryData
                .fromString("{\"backupName\":\"suuv\",\"backupFormat\":\"CollatedFormat\"}")
                .toObject(BackupSettings.class);
        Assertions.assertEquals("suuv", model.backupName());
        Assertions.assertEquals(BackupFormat.COLLATED_FORMAT, model.backupFormat());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupSettings model =
            new BackupSettings().withBackupName("suuv").withBackupFormat(BackupFormat.COLLATED_FORMAT);
        model = BinaryData.fromObject(model).toObject(BackupSettings.class);
        Assertions.assertEquals("suuv", model.backupName());
        Assertions.assertEquals(BackupFormat.COLLATED_FORMAT, model.backupFormat());
    }
}