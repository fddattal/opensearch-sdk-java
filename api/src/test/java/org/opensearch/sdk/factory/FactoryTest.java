package org.opensearch.sdk.factory;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void testFactoryLoads() {
        Factory.load(getClass().getClassLoader());
    }
}
