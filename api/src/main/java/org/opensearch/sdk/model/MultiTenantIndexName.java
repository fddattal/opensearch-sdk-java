package org.opensearch.sdk.model;

import lombok.Value;

@Value
public class MultiTenantIndexName {
    private Tenant tenant;
    private String indexName;
}
