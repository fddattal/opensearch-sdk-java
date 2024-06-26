package org.opensearch.sdk.model;

import lombok.Builder;

@lombok.Data
@Builder(toBuilder = true)
public class GetIndexSettingRequest {
    private IndexName indexName;
    private SettingKey settingKey;
}
