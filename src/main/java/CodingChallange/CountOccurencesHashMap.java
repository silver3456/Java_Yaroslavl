package CodingChallange;

import java.util.*;

public class CountOccurencesHashMap {

    public static void main(String[] args) {

        String sentence = "apple banana apple banana banana";
        String[] wordsArray = sentence.split("\\s");


        Map<String, Integer> map = new HashMap<>();
        int count;

        for (String word : wordsArray) {
            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}