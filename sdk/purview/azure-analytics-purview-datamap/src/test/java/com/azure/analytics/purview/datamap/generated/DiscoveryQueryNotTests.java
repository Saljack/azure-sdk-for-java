// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.ContactSearchResultValue;
import com.azure.analytics.purview.datamap.models.QueryOptions;
import com.azure.analytics.purview.datamap.models.QueryResult;
import com.azure.analytics.purview.datamap.models.SearchResultValue;
import com.azure.analytics.purview.datamap.models.TermSearchResultValue;
import com.azure.core.util.BinaryData;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DiscoveryQueryNotTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryNotTests() {
        // method invocation
        QueryResult response = discoveryClient.query(new QueryOptions().setLimit(10)
            .setFilter(BinaryData
                .fromBytes("{not={classification=MICROSOFT.SYSTEM.TEMP_FILE}}".getBytes(StandardCharsets.UTF_8))));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "searchCount"
        Assertions.assertEquals(5158, response.getSearchCount());
        // verify property "searchCountApproximate"
        Assertions.assertEquals(false, response.isSearchCountApproximate());
        // verify property "continuationToken"
        Assertions.assertEquals("<token>", response.getContinuationToken());
        // verify property "value"
        List<SearchResultValue> responseValue = response.getValue();
        SearchResultValue responseValueFirstItem = responseValue.iterator().next();
        Assertions.assertNotNull(responseValueFirstItem);
        Assertions.assertEquals(1.0D, responseValueFirstItem.getSearchScore());
        Assertions.assertEquals("11fd6e94-2dc6-4ebd-822c-caf6f6f60000", responseValueFirstItem.getId());
        Assertions.assertEquals("exampledata", responseValueFirstItem.getName());
        Assertions.assertEquals("mssql://exampleaccount.database.windows.net:3342/exampledb/dbo/exampledata",
            responseValueFirstItem.getQualifiedName());
        Assertions.assertEquals("azure_sql_mi_table", responseValueFirstItem.getEntityType());
        List<String> responseValueFirstItemClassification = responseValueFirstItem.getClassification();
        Assertions.assertEquals(0, responseValueFirstItemClassification.size());
        List<String> responseValueFirstItemLabel = responseValueFirstItem.getLabel();
        Assertions.assertEquals(0, responseValueFirstItemLabel.size());
        List<TermSearchResultValue> responseValueFirstItemTerm = responseValueFirstItem.getTerm();
        Assertions.assertEquals(0, responseValueFirstItemTerm.size());
        List<ContactSearchResultValue> responseValueFirstItemContact = responseValueFirstItem.getContact();
        Assertions.assertEquals(0, responseValueFirstItemContact.size());
        List<String> responseValueFirstItemAssetType = responseValueFirstItem.getAssetType();
        Assertions.assertEquals("Azure SQL Managed Instance", responseValueFirstItemAssetType.iterator().next());
    }
}
