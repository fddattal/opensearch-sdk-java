package org.opensearch.sdk.service;

import org.opensearch.action.search.SearchResponse;
import org.opensearch.sdk.model.MultiTenantSearchRequest;
import org.opensearch.sdk.model.MultiTenantSearchResponse;
import org.opensearch.sdk.util.FutureUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class DefaultClient implements Client {

    private final org.opensearch.client.Client client;

    private DefaultClient(org.opensearch.client.Client client) {
        this.client = client;
    }

    public static DefaultClient construct(Object[] args) {
        return new DefaultClient((org.opensearch.client.Client) args[0]);
    }

    @Override
    public CompletionStage<MultiTenantSearchResponse> search(MultiTenantSearchRequest request) {

        CompletableFuture<SearchResponse> result = new CompletableFuture<>();

        client.search(request.searchRequest(), FutureUtils.newFutureCompletingActionListener(result));

        return result.thenApply(response ->
                new MultiTenantSearchResponse()
                        .response(response)
                        .tenant(request.tenant())
        );
    }
}
