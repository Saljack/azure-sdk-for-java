// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.DaysOfWeek;
import com.azure.resourcemanager.costmanagement.models.ScheduleFrequency;
import com.azure.resourcemanager.costmanagement.models.ScheduleProperties;
import com.azure.resourcemanager.costmanagement.models.WeeksOfMonth;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleProperties model =
            BinaryData
                .fromString(
                    "{\"frequency\":\"Weekly\",\"hourOfDay\":1629743975,\"daysOfWeek\":[\"Saturday\"],\"weeksOfMonth\":[\"Second\",\"Fourth\",\"First\",\"Second\"],\"dayOfMonth\":401545193,\"startDate\":\"2021-10-26T10:22:19Z\",\"endDate\":\"2021-05-04T23:51:10Z\"}")
                .toObject(ScheduleProperties.class);
        Assertions.assertEquals(ScheduleFrequency.WEEKLY, model.frequency());
        Assertions.assertEquals(1629743975, model.hourOfDay());
        Assertions.assertEquals(DaysOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(WeeksOfMonth.SECOND, model.weeksOfMonth().get(0));
        Assertions.assertEquals(401545193, model.dayOfMonth());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T10:22:19Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T23:51:10Z"), model.endDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleProperties model =
            new ScheduleProperties()
                .withFrequency(ScheduleFrequency.WEEKLY)
                .withHourOfDay(1629743975)
                .withDaysOfWeek(Arrays.asList(DaysOfWeek.SATURDAY))
                .withWeeksOfMonth(
                    Arrays.asList(WeeksOfMonth.SECOND, WeeksOfMonth.FOURTH, WeeksOfMonth.FIRST, WeeksOfMonth.SECOND))
                .withDayOfMonth(401545193)
                .withStartDate(OffsetDateTime.parse("2021-10-26T10:22:19Z"))
                .withEndDate(OffsetDateTime.parse("2021-05-04T23:51:10Z"));
        model = BinaryData.fromObject(model).toObject(ScheduleProperties.class);
        Assertions.assertEquals(ScheduleFrequency.WEEKLY, model.frequency());
        Assertions.assertEquals(1629743975, model.hourOfDay());
        Assertions.assertEquals(DaysOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(WeeksOfMonth.SECOND, model.weeksOfMonth().get(0));
        Assertions.assertEquals(401545193, model.dayOfMonth());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T10:22:19Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T23:51:10Z"), model.endDate());
    }
}