package CodingChallange;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
VOWELS = 3

A = 3
E = 3
I = 2
 */

public class CountVowelsHashMap {

    public static void main(String[] args) {

        String sentence = "CBEEDOIIOLAAE";

        String[] lettersArray = sentence.split("");

        Map<String, Integer> mapOfLetters = new HashMap<String, Integer>();
        int count;

        for (int i = 0; i < lettersArray.length; i++) {
            String letter = lettersArray[i];
            if (letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O")) {
                if(mapOfLetters.containsKey(letter)) {
                    count = mapOfLetters.get(letter);
                    mapOfLetters.put(letter, count + 1);
                } else {
                    mapOfLetters.put(letter, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : mapOfLetters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

}
