package org.opensearch.sdk.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.opensearch.action.search.SearchRequest;
import org.opensearch.action.search.SearchResponse;

@Data
@Accessors(fluent = true, chain = true)
public class MultiTenantSearchResponse {
    private Tenant tenant;
    private SearchResponse response;
}
