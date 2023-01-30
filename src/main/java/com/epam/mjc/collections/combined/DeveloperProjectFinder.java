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
            
            Collections.sort(result, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

        }

        return result;
    }
}
