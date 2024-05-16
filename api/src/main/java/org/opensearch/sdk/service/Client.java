package org.opensearch.sdk.service;

import org.opensearch.sdk.model.MultiTenantSearchRequest;
import org.opensearch.sdk.model.MultiTenantSearchResponse;

import java.util.concurrent.CompletionStage;

public interface Client {
    CompletionStage<MultiTenantSearchResponse> search(MultiTenantSearchRequest request);
}
