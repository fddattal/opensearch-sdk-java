package org.opensearch.sdk.service;

import org.opensearch.sdk.model.Tenant;

public class DefaultTenantProvider implements TenantProvider {
    @Override
    public Tenant getTenant() {
        return new Tenant("default");
    }
}
