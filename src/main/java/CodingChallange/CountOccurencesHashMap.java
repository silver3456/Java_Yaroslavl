package CodingChallange;

import java.util.*;

public class CountOccurencesHashMap {

    public static void main(String[] args) {

        String[] arr = {"Alex", "Ben", "Alex", "Alex", "Ben", "Dan"};


        Map<String, Integer> mapOfNames = new HashMap<>();
        int count;

        for (String name : arr) {
            if (mapOfNames.containsKey(name)) {
                count = mapOfNames.get(name);
                mapOfNames.put(name, count + 1);
            } else {
                mapOfNames.put(name, 1);
            }
        }

        for (Map.Entry entry : mapOfNames.entrySet()) {
            System.out.println(entry);
        }
    }
}

