package org.opensearch.sdk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ClearScrollRequest {
    private ScrollCursor scrollCursor;
}
