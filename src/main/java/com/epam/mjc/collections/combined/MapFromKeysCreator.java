package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        if (sourceMap.size() > 0) {

            for (String i : sourceMap.keySet()) {
                int size_of_key = i.length();

                if (!result.containsKey(size_of_key)) {
                    Set<String> value = new HashSet<>();
                    value.add(i);

                    result.put(size_of_key, value);

                } else {
                    result.get(size_of_key).add(i);

                }
            }

        }

        return result;
    }
}
