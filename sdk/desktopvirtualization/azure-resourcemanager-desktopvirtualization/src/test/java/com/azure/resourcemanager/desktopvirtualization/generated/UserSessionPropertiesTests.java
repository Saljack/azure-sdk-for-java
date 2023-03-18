// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.UserSessionProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionState;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class UserSessionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserSessionProperties model =
            BinaryData
                .fromString(
                    "{\"objectId\":\"orgjhxbldt\",\"userPrincipalName\":\"wrlkdmtn\",\"applicationType\":\"RemoteApp\",\"sessionState\":\"Unknown\",\"activeDirectoryUserName\":\"llxdyhgs\",\"createTime\":\"2021-10-24T07:42:50Z\"}")
                .toObject(UserSessionProperties.class);
        Assertions.assertEquals("wrlkdmtn", model.userPrincipalName());
        Assertions.assertEquals(ApplicationType.REMOTE_APP, model.applicationType());
        Assertions.assertEquals(SessionState.UNKNOWN, model.sessionState());
        Assertions.assertEquals("llxdyhgs", model.activeDirectoryUsername());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T07:42:50Z"), model.createTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserSessionProperties model =
            new UserSessionProperties()
                .withUserPrincipalName("wrlkdmtn")
                .withApplicationType(ApplicationType.REMOTE_APP)
                .withSessionState(SessionState.UNKNOWN)
                .withActiveDirectoryUsername("llxdyhgs")
                .withCreateTime(OffsetDateTime.parse("2021-10-24T07:42:50Z"));
        model = BinaryData.fromObject(model).toObject(UserSessionProperties.class);
        Assertions.assertEquals("wrlkdmtn", model.userPrincipalName());
        Assertions.assertEquals(ApplicationType.REMOTE_APP, model.applicationType());
        Assertions.assertEquals(SessionState.UNKNOWN, model.sessionState());
        Assertions.assertEquals("llxdyhgs", model.activeDirectoryUsername());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T07:42:50Z"), model.createTime());
    }
}