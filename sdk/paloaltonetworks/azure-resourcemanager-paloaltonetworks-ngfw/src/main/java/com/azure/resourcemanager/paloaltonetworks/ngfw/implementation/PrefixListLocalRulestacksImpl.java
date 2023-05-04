// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PrefixListLocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListLocalRulestacks;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListResource;

public final class PrefixListLocalRulestacksImpl implements PrefixListLocalRulestacks {
    private static final ClientLogger LOGGER = new ClientLogger(PrefixListLocalRulestacksImpl.class);

    private final PrefixListLocalRulestacksClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public PrefixListLocalRulestacksImpl(
        PrefixListLocalRulestacksClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrefixListResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName) {
        PagedIterable<PrefixListResourceInner> inner =
            this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName);
        return Utils.mapPage(inner, inner1 -> new PrefixListResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrefixListResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName, Context context) {
        PagedIterable<PrefixListResourceInner> inner =
            this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName, context);
        return Utils.mapPage(inner, inner1 -> new PrefixListResourceImpl(inner1, this.manager()));
    }

    public Response<PrefixListResource> getWithResponse(
        String resourceGroupName, String localRulestackName, String name, Context context) {
        Response<PrefixListResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, localRulestackName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrefixListResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrefixListResource get(String resourceGroupName, String localRulestackName, String name) {
        PrefixListResourceInner inner = this.serviceClient().get(resourceGroupName, localRulestackName, name);
        if (inner != null) {
            return new PrefixListResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String localRulestackName, String name) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name);
    }

    public void delete(String resourceGroupName, String localRulestackName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name, context);
    }

    public PrefixListResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "prefixlists");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixlists'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, Context.NONE).getValue();
    }

    public Response<PrefixListResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "prefixlists");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixlists'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "prefixlists");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixlists'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "prefixlists");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixlists'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, context);
    }

    private PrefixListLocalRulestacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    public PrefixListResourceImpl define(String name) {
        return new PrefixListResourceImpl(name, this.manager());
    }
}