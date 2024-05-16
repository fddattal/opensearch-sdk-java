package org.opensearch.sdk.factory;

import org.opensearch.sdk.service.Client;
import org.opensearch.sdk.service.DefaultClient;

import java.util.HashMap;
import java.util.Map;

public class DefaultObjectFactory implements ObjectFactory {

    private final Map<Class<?>, Constructor<?>> objectFactories = new HashMap<>();

    public DefaultObjectFactory() {
        register(Client.class, DefaultClient::construct);
    }

    @Override
    public <T> T construct(Class<T> clazz, Object... arguments) {
        Constructor<?> ctor = objectFactories.get(clazz);
        if (null == ctor) {
            throw new IllegalStateException("No constructor for : " + clazz);
        }
        return clazz.cast(ctor.construct(arguments));
    }

    private <T> void register(Class<T> clazz, Constructor<T> constructor) {
        objectFactories.put(clazz, constructor);
    }

    private static interface Constructor<T> {
        T construct(Object... arguments);
    }
}
