package Sorting_Algorithms;

import java.util.Map;
import java.util.TreeMap;

public class SortTreeMapString {
    public static void main(String[] args) {

        Map<String, String> unsortedMap = new TreeMap();
        unsortedMap.put("1", "Alabama");
        unsortedMap.put("9", "Washington");
        unsortedMap.put("5", "Los Angeles");
        unsortedMap.put("7", "Burlinghame");

        Map sortedMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(unsortedMap);
        System.out.println(sortedMap);


    }
}
