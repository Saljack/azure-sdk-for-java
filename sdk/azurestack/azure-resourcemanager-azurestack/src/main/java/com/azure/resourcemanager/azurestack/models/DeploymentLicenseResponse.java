// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.resourcemanager.azurestack.fluent.models.DeploymentLicenseResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of DeploymentLicenseResponse.
 */
public interface DeploymentLicenseResponse {
    /**
     * Gets the temporaryLicenseChain property: A license chain that can be used to temporarily activate an Azure Stack
     * device.
     * 
     * @return the temporaryLicenseChain value.
     */
    List<String> temporaryLicenseChain();

    /**
     * Gets the signature property: Signature of the license chain.
     * 
     * @return the signature value.
     */
    String signature();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.fluent.models.DeploymentLicenseResponseInner object.
     * 
     * @return the inner object.
     */
    DeploymentLicenseResponseInner innerModel();
}
