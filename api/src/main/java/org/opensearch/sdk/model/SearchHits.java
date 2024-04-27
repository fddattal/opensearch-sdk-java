package org.opensearch.sdk.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class SearchHits {
    private List<SearchHit> searchHits;
}
