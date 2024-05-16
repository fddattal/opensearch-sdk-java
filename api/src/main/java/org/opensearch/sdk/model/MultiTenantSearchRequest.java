package org.opensearch.sdk.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.opensearch.action.search.SearchRequest;

@Data
@Accessors(fluent = true, chain = true)
public class MultiTenantSearchRequest {
    private Tenant tenant;
    private SearchRequest searchRequest;
}
