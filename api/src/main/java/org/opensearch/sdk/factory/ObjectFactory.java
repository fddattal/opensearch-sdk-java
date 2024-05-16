package org.opensearch.sdk.factory;

public interface ObjectFactory {
    <T> T construct(Class<T> clazz, Object... arguments);
}
