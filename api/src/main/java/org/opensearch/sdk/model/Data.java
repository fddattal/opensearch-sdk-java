package org.opensearch.sdk.model;

import lombok.Builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@lombok.Data
@Builder(toBuilder = true)
public class Data {
    private Map<String, Data> map;
    private List<Data> list;
    private String string;
    private Integer integer;
    private Float real;
    private Boolean bool;

    public static Data wrap(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof Data) {
            return (Data) obj;
        }

        if (obj instanceof Map) {
            return mapToData((Map<?, ?>) obj);
        }

        if (obj instanceof List) {
            return listToData((List<?>) obj);
        }

        if (obj instanceof String) {
            return Data.string((String) obj);
        }

        if (obj instanceof Float) {
            return Data.real((Float) obj);
        }

        if (obj instanceof Integer) {
            return Data.integer((Integer) obj);
        }

        if (obj instanceof Boolean) {
            return Data.bool((Boolean) obj);
        }

        throw new UnsupportedOperationException();
    }

    public static Object unwrap(Data data) {
        if (data == null) {
            return null;
        }
        if (data.getString() != null) {
            return data.getString();
        }
        if (data.getInteger() != null) {
            return data.getInteger();
        }
        if (data.getReal() != null) {
            return data.getReal();
        }
        if (data.getBool() != null) {
            return data.getBool();
        }
        if (data.getList() != null) {
            return unwrapList(data.getList());
        }
        if (data.getMap() != null) {
            return unwrapMap(data.getMap());
        }
        throw new IllegalStateException();
    }

    public static Data string(String str) {
        return Data.builder()
                .string(str)
                .build();
    }

    public static Data real(float v) {
        return Data.builder()
                .real(v)
                .build();
    }

    public static Data integer(int v) {
        return Data.builder()
                .integer(v)
                .build();
    }

    public static Data map(Map<String, Data> map) {
        return Data.builder()
                .map(map)
                .build();
    }

    public static Data bool(boolean v) {
        return Data.builder()
                .bool(v)
                .build();
    }

    public static Data list(List<Data> list) {
        return Data.builder()
                .list(list)
                .build();
    }

    private static Data mapToData(Map<?, ?> source) {
        Map<String, Data> result = new HashMap<>(source.size());
        for (Map.Entry<?, ?> entry : source.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new UnsupportedOperationException();
            }
            result.put((String) entry.getKey(), wrap(entry.getValue()));
        }
        return Data.map(result);
    }

    private static Data listToData(List<?> source) {
        List<Data> result = new ArrayList<>(source.size());
        for (Object entry : source) {
            result.add(wrap(entry));
        }
        return Data.list(result);
    }

    private static Map<String, Object> unwrapMap(Map<String, Data> input) {
        Map<String, Object> result = new HashMap<>(input.size());
        for (Map.Entry<String, Data> entry : input.entrySet()) {
            result.put(entry.getKey(), unwrap(entry.getValue()));
        }
        return result;
    }

    private static List<Object> unwrapList(List<Data> input) {
        return input.stream().map(Data::unwrap).collect(Collectors.toList());
    }
}
