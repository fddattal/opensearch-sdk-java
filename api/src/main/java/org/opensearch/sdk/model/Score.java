package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class Score {
    private float value;
}
