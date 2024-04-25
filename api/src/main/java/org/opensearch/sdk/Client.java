package org.opensearch.sdk;

import org.opensearch.sdk.model.ClearScrollRequest;
import org.opensearch.sdk.model.ClearScrollResponse;
import org.opensearch.sdk.model.GetIndexMappingsRequest;
import org.opensearch.sdk.model.GetIndexMappingsResponse;
import org.opensearch.sdk.model.GetIndexSettingRequest;
import org.opensearch.sdk.model.GetIndexSettingResponse;
import org.opensearch.sdk.model.GetSystemSettingRequest;
import org.opensearch.sdk.model.GetSystemSettingResponse;
import org.opensearch.sdk.model.MultiSearchRequest;
import org.opensearch.sdk.model.MultiSearchResponse;
import org.opensearch.sdk.model.ResolveIndicesAndAliasesRequest;
import org.opensearch.sdk.model.ResolveIndicesAndAliasesResponse;
import org.opensearch.sdk.model.ScrollRequest;
import org.opensearch.sdk.model.SearchRequest;
import org.opensearch.sdk.model.SearchResponse;

import java.util.concurrent.CompletionStage;

public interface Client {

    CompletionStage<SearchResponse> search(SearchRequest request);

    CompletionStage<SearchResponse> scroll(ScrollRequest request);

    CompletionStage<ClearScrollResponse> clearScroll(ClearScrollRequest request);

    CompletionStage<GetIndexMappingsResponse> getIndexMappings(GetIndexMappingsRequest request);

    CompletionStage<GetIndexSettingResponse> getIndexSetting(GetIndexSettingRequest request);

    CompletionStage<GetSystemSettingResponse> getSystemSetting(GetSystemSettingRequest request);

    CompletionStage<ResolveIndicesAndAliasesResponse> resolveIndicesAndAliases(ResolveIndicesAndAliasesRequest request);

    CompletionStage<MultiSearchResponse> multiSearch(MultiSearchRequest request);

}
