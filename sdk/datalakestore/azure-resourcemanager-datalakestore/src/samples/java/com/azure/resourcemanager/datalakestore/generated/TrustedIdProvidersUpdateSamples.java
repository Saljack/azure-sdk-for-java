// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.resourcemanager.datalakestore.models.TrustedIdProvider;

/**
 * Samples for TrustedIdProviders Update.
 */
public final class TrustedIdProvidersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/
     * TrustedIdProviders_Update.json
     */
    /**
     * Sample code: Updates the specified trusted identity provider.
     * 
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void updatesTheSpecifiedTrustedIdentityProvider(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        TrustedIdProvider resource = manager.trustedIdProviders()
            .getWithResponse("contosorg", "contosoadla", "test_trusted_id_provider_name",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withIdProvider("https://sts.windows.net/ea9ec534-a3e3-4e45-ad36-3afc5bb291c1").apply();
    }
}
