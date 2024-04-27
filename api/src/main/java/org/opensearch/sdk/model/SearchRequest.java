package org.opensearch.sdk.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class SearchRequest {
    private IndicesOptions indicesOptions;
    private IndexExpressions indexExpressions;
    private Boolean allowPartialResults;
    private Integer from;
    private Integer size;
    private TimeValue timeout;
    private Includes includes;
    private Boolean trackScores;
    private Query query;
    private Sorts sorts;
    private Aggregations aggregations;
    private Highlighter highlighter;
}
