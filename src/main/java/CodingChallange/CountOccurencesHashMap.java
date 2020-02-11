package CodingChallange;

import java.util.*;

public class CountOccurencesHashMap {

    public static void main(String[] args) {

        String sentence = "apple banana apple banana banana";
        String[] wordsArray = sentence.split(" ");


        Map<String, Integer> map = new HashMap<>();
        int count = 1;

        for (String word : wordsArray) {
            if (map.containsKey(word)) {
                map.put(word, count + 1);
            } else {
                map.put(word, count);
            }
        }

//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//         }
// OR
       
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
