package com.example;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class ActorPosterCounter {

    private final Map<String, Long> postersCountMap = new HashMap<>();
    private Map<String, String> posterActorNames = new TreeMap<>();

    public ActorPosterCounter(Map posterActorNames) {
        this.posterActorNames = posterActorNames;
    }

    public void processList(String[] list) {
        long curVal = 0;
        for (String itemNumber : list) {
            if (postersCountMap.containsKey(itemNumber)) {
                curVal = postersCountMap.get(itemNumber);
                curVal++;
                postersCountMap.put(itemNumber, curVal);
            } else {
                postersCountMap.put(itemNumber, new Long(1));
            }
        }
    }

    public void printReport() {
        System.out.println("=== Posters  Report ===");
        for (String key : posterActorNames.keySet()) {
            System.out.print("Name: " + key);
            System.out.println("\t\tCount: "
                    + postersCountMap.get(posterActorNames.get(key)));
        }
    }

    public static void main(String[] args) {
        String[] posters = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Actor Name Poster Number map
        Map<String, String> posterActorNames = new TreeMap<>();

        posterActorNames.put("Tom Hanks", "1S01");
        posterActorNames.put("Brad Pitt", "1S02");
        posterActorNames.put("Harrison Ford", "1H01");
        posterActorNames.put("Jack Nicholson", "1M02");

        ActorPosterCounter pc1 = new ActorPosterCounter(posterActorNames);
        pc1.processList(posters);
        pc1.printReport();

    }

}
