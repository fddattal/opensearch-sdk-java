package org.opensearch.sdk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class GetIndexMappingsRequest {
    private IndexName indexName;
}
