package org.opensearch.sdk.model;

import lombok.Value;
import org.opensearch.core.index.Index;

@Value
public class MultiTenantIndex {
    private Tenant tenant;
    private Index index;
}
