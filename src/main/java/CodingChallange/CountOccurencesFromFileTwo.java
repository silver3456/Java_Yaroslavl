package CodingChallange;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurencesFromFileTwo {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("/Users/alexander/Desktop/input.txt"));

        String sentence = scanner.useDelimiter("\\A").next();
        scanner.close();

        String[] wordsArray = sentence.split(",");

        Map<String, Integer> mapOfWords = new HashMap<>();
        int count;

        for (String word : wordsArray) {
            if (mapOfWords.containsKey(word)) {
                count = mapOfWords.get(word);
                mapOfWords.put(word, count + 1);
            } else {
                mapOfWords.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
