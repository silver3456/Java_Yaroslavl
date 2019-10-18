package CodingChallange;

import java.util.HashMap;
import java.util.Map;

public class CountVowlesCharArr {
    public static void main(String[] args) {

        String sentence = "CBEEDOIIOLAAE";

        char[] arr = sentence.toCharArray();

        Map<Character, Integer> mapOfLetters = new HashMap<Character, Integer>();
        int count;


        for (char ch : arr) {
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

