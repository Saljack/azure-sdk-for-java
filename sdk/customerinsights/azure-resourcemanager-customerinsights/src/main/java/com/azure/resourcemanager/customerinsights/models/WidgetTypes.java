// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of WidgetTypes.
 */
public interface WidgetTypes {
    /**
     * Gets all available widget types in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available widget types in the specified hub as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WidgetTypeResourceFormat> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all available widget types in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available widget types in the specified hub as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WidgetTypeResourceFormat> listByHub(String resourceGroupName, String hubName, Context context);

    /**
     * Gets a widget type in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param widgetTypeName The name of the widget type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a widget type in the specified hub along with {@link Response}.
     */
    Response<WidgetTypeResourceFormat> getWithResponse(String resourceGroupName, String hubName, String widgetTypeName,
        Context context);

    /**
     * Gets a widget type in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param widgetTypeName The name of the widget type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a widget type in the specified hub.
     */
    WidgetTypeResourceFormat get(String resourceGroupName, String hubName, String widgetTypeName);
}
