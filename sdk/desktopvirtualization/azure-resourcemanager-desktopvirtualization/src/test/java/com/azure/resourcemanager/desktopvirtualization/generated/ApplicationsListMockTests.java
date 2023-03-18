// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.Application;
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import com.azure.resourcemanager.desktopvirtualization.models.RemoteApplicationType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApplicationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"objectId\":\"jjidjk\",\"description\":\"xkyxvxevblbj\",\"friendlyName\":\"nljlageuaulx\",\"filePath\":\"smjbnkppxyn\",\"msixPackageFamilyName\":\"lsvxeizz\",\"msixPackageApplicationId\":\"klnsrmffey\",\"applicationType\":\"InBuilt\",\"commandLineSetting\":\"Require\",\"commandLineArguments\":\"piymerteea\",\"showInPortal\":true,\"iconPath\":\"iekkkzddrtkgdojb\",\"iconIndex\":494588403,\"iconHash\":\"vrefdeesv\"},\"id\":\"uij\",\"name\":\"xtxsuwprtujw\",\"type\":\"awddjibab\"}]}";

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

        DesktopVirtualizationManager manager =
            DesktopVirtualizationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Application> response =
            manager
                .applications()
                .list("atjeaahh", "jhhn", 919840845, false, 1060180082, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xkyxvxevblbj", response.iterator().next().description());
        Assertions.assertEquals("nljlageuaulx", response.iterator().next().friendlyName());
        Assertions.assertEquals("smjbnkppxyn", response.iterator().next().filePath());
        Assertions.assertEquals("lsvxeizz", response.iterator().next().msixPackageFamilyName());
        Assertions.assertEquals("klnsrmffey", response.iterator().next().msixPackageApplicationId());
        Assertions.assertEquals(RemoteApplicationType.IN_BUILT, response.iterator().next().applicationType());
        Assertions.assertEquals(CommandLineSetting.REQUIRE, response.iterator().next().commandLineSetting());
        Assertions.assertEquals("piymerteea", response.iterator().next().commandLineArguments());
        Assertions.assertEquals(true, response.iterator().next().showInPortal());
        Assertions.assertEquals("iekkkzddrtkgdojb", response.iterator().next().iconPath());
        Assertions.assertEquals(494588403, response.iterator().next().iconIndex());
    }
}