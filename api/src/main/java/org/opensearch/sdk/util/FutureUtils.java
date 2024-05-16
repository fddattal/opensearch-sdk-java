package org.opensearch.sdk.util;

import org.opensearch.core.action.ActionListener;

import java.util.concurrent.CompletableFuture;

public class FutureUtils {
    public static <T> ActionListener<T> newFutureCompletingActionListener(CompletableFuture<T> future) {
        return new ActionListener<T>() {
            @Override
            public void onResponse(T t) {
                future.complete(t);
            }

            @Override
            public void onFailure(Exception e) {
                future.completeExceptionally(e);
            }
        };
    }
}
