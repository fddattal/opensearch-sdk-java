package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class FieldName {
    private String value;
}
