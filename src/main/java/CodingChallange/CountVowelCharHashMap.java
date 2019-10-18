package CodingChallange;

import java.util.HashMap;
import java.util.Map;

public class CountVowelCharHashMap {
    public static void main(String[] args) {

        String sentence = "CBEEDOIIOLAAE";

        Map<Character, Integer> mapOfLetters = new HashMap<>();
        int count;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O') {

                if (mapOfLetters.containsKey(ch)) {
                    count = mapOfLetters.get(ch);
                    mapOfLetters.put(ch, count + 1);
                } else {
                    mapOfLetters.put(ch, 1);
                }
            }
        }

        System.out.println("Number of vowels = " + mapOfLetters.size());

        for (Map.Entry<Character, Integer> entry : mapOfLetters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}

