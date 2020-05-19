package CodingChallange;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountOccurencesFromFileBuffereReader {

    public static void main(String[] args) throws IOException {

        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("/Users/alexander/Desktop/input.txt"));
        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            contentBuilder.append(sCurrentLine);
        }

        String sentence = contentBuilder.toString();


        String[] wordsArray = sentence.split(" ");

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
