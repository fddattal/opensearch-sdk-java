package org.opensearch.sdk.model;

import lombok.Builder;

import java.util.List;

@lombok.Data
@Builder(toBuilder = true)
public class FieldNames {
    private List<FieldName> fieldNames;
}
