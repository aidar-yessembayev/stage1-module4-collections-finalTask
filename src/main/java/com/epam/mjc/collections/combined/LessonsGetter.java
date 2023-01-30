package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();

        if (timetable.size() > 0) {

            for (String i : timetable.keySet()) {
                for (String j : timetable.get(i)) {
                    result.add(j);
                }
            }

        }

        return result;
    }
}
