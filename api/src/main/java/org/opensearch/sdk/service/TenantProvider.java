package org.opensearch.sdk.service;

import org.opensearch.sdk.model.Tenant;

public interface TenantProvider {
    Tenant getTenant();
}
