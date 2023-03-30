// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.newrelicobservability.fluent.PlansClient;
import com.azure.resourcemanager.newrelicobservability.fluent.models.PlanDataResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.PlanDataResource;
import com.azure.resourcemanager.newrelicobservability.models.Plans;

public final class PlansImpl implements Plans {
    private static final ClientLogger LOGGER = new ClientLogger(PlansImpl.class);

    private final PlansClient innerClient;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    public PlansImpl(
        PlansClient innerClient,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PlanDataResource> list() {
        PagedIterable<PlanDataResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PlanDataResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PlanDataResource> list(String accountId, String organizationId, Context context) {
        PagedIterable<PlanDataResourceInner> inner = this.serviceClient().list(accountId, organizationId, context);
        return Utils.mapPage(inner, inner1 -> new PlanDataResourceImpl(inner1, this.manager()));
    }

    private PlansClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}