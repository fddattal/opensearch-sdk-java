package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class MappingMetadata {
    private Data source;
}
