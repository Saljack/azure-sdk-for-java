// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

/**
 * Samples for NotificationHubs Get.
 */
public final class NotificationHubsGetSamples {
    /*
     * x-ms-original-file:
     * specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/preview/2023-10-01-preview/examples/
     * NotificationHubs/Get.json
     */
    /**
     * Sample code: NotificationHubs_Get.
     * 
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void notificationHubsGet(com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.notificationHubs()
            .getWithResponse("5ktrial", "nh-sdk-ns", "nh-sdk-hub", com.azure.core.util.Context.NONE);
    }
}
