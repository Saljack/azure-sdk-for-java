// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.notificationhubs.NotificationHubsManager;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityParameters;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityResult;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import com.azure.resourcemanager.notificationhubs.models.SkuName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NotificationHubsCheckNotificationHubAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNotificationHubAvailabilityWithResponse() throws Exception {
        String responseStr
            = "{\"isAvailiable\":false,\"location\":\"qqkdltfzxmhhvhgu\",\"tags\":{\"ibqdxbxwakbogqx\":\"dkwobdagx\",\"lbpodxunk\":\"dlkzgxhuri\"},\"sku\":{\"name\":\"Basic\",\"tier\":\"mubyynt\",\"size\":\"rbqtkoie\",\"family\":\"eotg\",\"capacity\":209864806},\"id\":\"tmuwlauwzi\",\"name\":\"xbmp\",\"type\":\"cjefuzmu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NotificationHubsManager manager = NotificationHubsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckAvailabilityResult response = manager.notificationHubs()
            .checkNotificationHubAvailabilityWithResponse("mdnbbglzpswiy", "mcwyhzdxssadb",
                new CheckAvailabilityParameters().withName("dvxzbncblylpst")
                    .withLocation("rzdzucerscdnt")
                    .withTags(mapOf("tmweriofzpyq", "fiwjmygtdssls", "hhszh", "emwabnet", "lvwiwubmwmbesl", "d"))
                    .withIsAvailiable(false)
                    .withSku(new Sku().withName(SkuName.FREE)
                        .withTier("pp")
                        .withSize("lcxog")
                        .withFamily("konzmnsik")
                        .withCapacity(1013346228)),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(false, response.isAvailiable());
        Assertions.assertEquals("qqkdltfzxmhhvhgu", response.location());
        Assertions.assertEquals("dkwobdagx", response.tags().get("ibqdxbxwakbogqx"));
        Assertions.assertEquals(SkuName.BASIC, response.sku().name());
        Assertions.assertEquals("mubyynt", response.sku().tier());
        Assertions.assertEquals("rbqtkoie", response.sku().size());
        Assertions.assertEquals("eotg", response.sku().family());
        Assertions.assertEquals(209864806, response.sku().capacity());
    }

    // Use "Map.of" if available
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
