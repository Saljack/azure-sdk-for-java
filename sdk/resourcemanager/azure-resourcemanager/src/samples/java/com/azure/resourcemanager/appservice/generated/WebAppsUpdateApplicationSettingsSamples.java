// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StringDictionaryInner;
import java.util.HashMap;
import java.util.Map;

/** Samples for WebApps UpdateApplicationSettings. */
public final class WebAppsUpdateApplicationSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/UpdateAppSettings.json
     */
    /**
     * Sample code: Update App Settings.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAppSettings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .updateApplicationSettingsWithResponse(
                "testrg123",
                "sitef6141",
                new StringDictionaryInner().withProperties(mapOf("Setting1", "Value1", "Setting2", "Value2")),
                com.azure.core.util.Context.NONE);
    }

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