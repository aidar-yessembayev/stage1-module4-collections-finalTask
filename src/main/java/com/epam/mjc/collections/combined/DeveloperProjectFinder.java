package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        if (projects.size() > 0) {

            for (String i : projects.keySet()) {
                for (String j : projects.get(i)) {
                    if (j.equals(developer)) {
                        result.add(i);
                    }
                }
            }

            Collections.sort(result, Collections.reverseOrder());

        }

        return result;
    }
}
