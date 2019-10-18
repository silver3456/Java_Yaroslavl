package CodingChallange;

import java.util.HashMap;
import java.util.Map;

/*
VOWELS = 3

A = 3
E = 3
I = 2
 */

public class CountOccurencesVowelsHashMap {

    public static void main(String[] args) {

        String sentence = "ABEEDOIIOLAAE";

        String[] lettersArray = sentence.split("");

        Map<String, Integer> mapOfLetters = new HashMap<>();
        int count = 0;

        for (int i = 0; i < lettersArray.length; ++i) {
            if (lettersArray[i].equals("A") || lettersArray[i].equals("E") || lettersArray[i].equals("I")) {
                count++;
            }

        }
        System.out.println(count);
    }
}

//            for (Map.Entry<String, Integer> entry : mapOfLetters.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }