package org.opensearch.sdk.factory;

import org.opensearch.sdk.service.Client;

import java.util.ServiceLoader;

public class Factory {

    public static Client newClient(org.opensearch.client.Client coreClient) {
        return construct(Client.class, coreClient);
    }

    private static <T> T construct(Class<T> clazz, Object... arguments) {

        ObjectFactory objectFactory = ServiceLoader.load(ObjectFactory.class)
                .findFirst()
                .orElseThrow();

        return objectFactory.construct(clazz, arguments);
    }
}
