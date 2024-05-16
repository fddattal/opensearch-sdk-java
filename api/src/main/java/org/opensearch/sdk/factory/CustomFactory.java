package org.opensearch.sdk.factory;

import org.opensearch.sdk.model.MultiTenantSearchRequest;
import org.opensearch.sdk.model.MultiTenantSearchResponse;
import org.opensearch.sdk.model.Tenant;
import org.opensearch.sdk.service.Client;
import org.opensearch.sdk.service.DefaultClient;
import org.opensearch.sdk.service.DefaultTenantProvider;
import org.opensearch.sdk.service.TenantProvider;

import java.util.concurrent.CompletionStage;

public class CustomFactory implements Factory {
    @Override
    public Client newClient(org.opensearch.client.Client coreClient) {
        return new Client() {
            @Override
            public CompletionStage<MultiTenantSearchResponse> search(MultiTenantSearchRequest request) {
                return null;
            }
        };
    }

    @Override
    public TenantProvider newTenantProvider() {
        return new TenantProvider() {
            @Override
            public Tenant getTenant() {
                return null;
            }
        };
    }
}
