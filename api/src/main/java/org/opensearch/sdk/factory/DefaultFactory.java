package org.opensearch.sdk.factory;

import org.opensearch.sdk.service.Client;
import org.opensearch.sdk.service.DefaultClient;
import org.opensearch.sdk.service.DefaultTenantProvider;
import org.opensearch.sdk.service.TenantProvider;

public class DefaultFactory implements Factory {
    @Override
    public Client newClient(org.opensearch.client.Client coreClient) {
        return new DefaultClient(coreClient);
    }

    @Override
    public TenantProvider newTenantProvider() {
        return new DefaultTenantProvider();
    }
}
