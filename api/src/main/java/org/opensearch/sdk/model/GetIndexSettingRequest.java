package org.opensearch.sdk.model;

import lombok.Data;

@Data
public class GetIndexSettingRequest {
    private IndexName indexName;
    private SettingKey settingKey;
}
