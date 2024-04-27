package org.opensearch.sdk.model;

import lombok.Builder;
import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data
@Builder(toBuilder = true)
public class TimeValue {
    private long duration;
    private TimeUnit timeUnit;
}
