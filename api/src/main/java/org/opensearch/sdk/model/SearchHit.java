package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class SearchHit {
    private IndexName indexName;
    private DocumentId documentId;
    private Score score;
    private Source source;
}
