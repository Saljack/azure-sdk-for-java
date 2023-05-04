// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.CertBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import com.azure.resourcemanager.confidentialledger.models.RunningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LedgerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LedgerProperties model =
            BinaryData
                .fromString(
                    "{\"ledgerName\":\"mfdatscmdvpj\",\"ledgerUri\":\"lsuuvmkjozkrwfnd\",\"identityServiceUri\":\"djpslw\",\"ledgerInternalNamespace\":\"dpvwryoqpsoaccta\",\"runningState\":\"Active\",\"ledgerType\":\"Unknown\",\"provisioningState\":\"Succeeded\",\"aadBasedSecurityPrincipals\":[{\"principalId\":\"ryffdfdosy\",\"tenantId\":\"xpaojakhmsbz\",\"ledgerRoleName\":\"Administrator\"},{\"principalId\":\"zevdphlx\",\"tenantId\":\"lthqtrgqjbp\",\"ledgerRoleName\":\"Administrator\"},{\"principalId\":\"inzgvfcj\",\"tenantId\":\"zoxxjtf\",\"ledgerRoleName\":\"Administrator\"}],\"certBasedSecurityPrincipals\":[{\"cert\":\"zitonpeqfpjkjl\",\"ledgerRoleName\":\"Reader\"},{\"cert\":\"dvhpfxxypininm\",\"ledgerRoleName\":\"Administrator\"},{\"cert\":\"ybb\",\"ledgerRoleName\":\"Contributor\"},{\"cert\":\"epoo\",\"ledgerRoleName\":\"Administrator\"}]}")
                .toObject(LedgerProperties.class);
        Assertions.assertEquals(RunningState.ACTIVE, model.runningState());
        Assertions.assertEquals(LedgerType.UNKNOWN, model.ledgerType());
        Assertions.assertEquals("ryffdfdosy", model.aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("xpaojakhmsbz", model.aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions
            .assertEquals(LedgerRoleName.ADMINISTRATOR, model.aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("zitonpeqfpjkjl", model.certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.READER, model.certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LedgerProperties model =
            new LedgerProperties()
                .withRunningState(RunningState.ACTIVE)
                .withLedgerType(LedgerType.UNKNOWN)
                .withAadBasedSecurityPrincipals(
                    Arrays
                        .asList(
                            new AadBasedSecurityPrincipal()
                                .withPrincipalId("ryffdfdosy")
                                .withTenantId("xpaojakhmsbz")
                                .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                            new AadBasedSecurityPrincipal()
                                .withPrincipalId("zevdphlx")
                                .withTenantId("lthqtrgqjbp")
                                .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                            new AadBasedSecurityPrincipal()
                                .withPrincipalId("inzgvfcj")
                                .withTenantId("zoxxjtf")
                                .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR)))
                .withCertBasedSecurityPrincipals(
                    Arrays
                        .asList(
                            new CertBasedSecurityPrincipal()
                                .withCert("zitonpeqfpjkjl")
                                .withLedgerRoleName(LedgerRoleName.READER),
                            new CertBasedSecurityPrincipal()
                                .withCert("dvhpfxxypininm")
                                .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                            new CertBasedSecurityPrincipal()
                                .withCert("ybb")
                                .withLedgerRoleName(LedgerRoleName.CONTRIBUTOR),
                            new CertBasedSecurityPrincipal()
                                .withCert("epoo")
                                .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR)));
        model = BinaryData.fromObject(model).toObject(LedgerProperties.class);
        Assertions.assertEquals(RunningState.ACTIVE, model.runningState());
        Assertions.assertEquals(LedgerType.UNKNOWN, model.ledgerType());
        Assertions.assertEquals("ryffdfdosy", model.aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("xpaojakhmsbz", model.aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions
            .assertEquals(LedgerRoleName.ADMINISTRATOR, model.aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("zitonpeqfpjkjl", model.certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.READER, model.certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }
}