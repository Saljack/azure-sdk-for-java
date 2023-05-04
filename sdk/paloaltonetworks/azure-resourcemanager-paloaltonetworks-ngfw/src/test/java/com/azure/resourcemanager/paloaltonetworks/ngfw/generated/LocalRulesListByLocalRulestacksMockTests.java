// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulesResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LocalRulesListByLocalRulestacksMockTests {
    @Test
    public void testListByLocalRulestacks() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"etag\":\"nynkbwet\",\"ruleName\":\"juhpsprkzyau\",\"priority\":1975569692,\"description\":\"cxnafbwqrooh\",\"ruleState\":\"ENABLED\",\"source\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[]},\"negateSource\":\"FALSE\",\"destination\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[],\"fqdnLists\":[]},\"negateDestination\":\"TRUE\",\"applications\":[\"ecmslclbl\"],\"category\":{\"urlCustom\":[],\"feeds\":[]},\"protocol\":\"lt\",\"protocolPortList\":[\"uscv\",\"f\"],\"inboundInspectionCertificate\":\"gctmgxuupbezq\",\"auditComment\":\"ydrtc\",\"actionType\":\"DenyResetServer\",\"enableLogging\":\"ENABLED\",\"decryptionRuleType\":\"SSLOutboundInspection\",\"tags\":[],\"provisioningState\":\"Accepted\"},\"id\":\"geqmgqzgwldoych\",\"name\":\"llcecfehuwaoa\",\"type\":\"uhicqllizstacsjv\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PaloAltoNetworksNgfwManager manager =
            PaloAltoNetworksNgfwManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LocalRulesResource> response =
            manager.localRules().listByLocalRulestacks("jhqt", "b", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nynkbwet", response.iterator().next().etag());
        Assertions.assertEquals("juhpsprkzyau", response.iterator().next().ruleName());
        Assertions.assertEquals("cxnafbwqrooh", response.iterator().next().description());
        Assertions.assertEquals(StateEnum.ENABLED, response.iterator().next().ruleState());
        Assertions.assertEquals(BooleanEnum.FALSE, response.iterator().next().negateSource());
        Assertions.assertEquals(BooleanEnum.TRUE, response.iterator().next().negateDestination());
        Assertions.assertEquals("ecmslclbl", response.iterator().next().applications().get(0));
        Assertions.assertEquals("lt", response.iterator().next().protocol());
        Assertions.assertEquals("uscv", response.iterator().next().protocolPortList().get(0));
        Assertions.assertEquals("gctmgxuupbezq", response.iterator().next().inboundInspectionCertificate());
        Assertions.assertEquals("ydrtc", response.iterator().next().auditComment());
        Assertions.assertEquals(ActionEnum.DENY_RESET_SERVER, response.iterator().next().actionType());
        Assertions.assertEquals(StateEnum.ENABLED, response.iterator().next().enableLogging());
        Assertions
            .assertEquals(
                DecryptionRuleTypeEnum.SSLOUTBOUND_INSPECTION, response.iterator().next().decryptionRuleType());
    }
}