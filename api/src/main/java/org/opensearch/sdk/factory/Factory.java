package org.opensearch.sdk.factory;

import org.opensearch.sdk.service.Client;
import org.opensearch.sdk.service.TenantProvider;

import java.util.ServiceLoader;

public interface Factory {

    Client newClient(org.opensearch.client.Client coreClient);

    TenantProvider newTenantProvider();

    public static Factory load(ClassLoader classLoader) {
        return ServiceLoader.load(Factory.class, classLoader)
                .findFirst()
                .orElseThrow(() -> {
                    return new IllegalStateException("Failed to load Factory SPI instance!");
                });
    }
}
