package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class Source {
    private Data value;
}
