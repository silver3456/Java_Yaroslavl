package CodingChallange;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountOccurencesFromFileOne {

    public static void main(String[] args) throws Exception {

        //String sentence = "apple banana apple banana banana";

        String sentence = readFileAsString("/Users/alexander/Desktop/input.txt");

        String[] wordsArray = sentence.split(" ");

        Map<String, Integer> mapOfWords = new HashMap<>();
        int count;

        for(String word : wordsArray) {
            if(mapOfWords.containsKey(word)) {
                count = mapOfWords.get(word);
                mapOfWords.put(word, count +1);
            } else {
                mapOfWords.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static String readFileAsString(String fileName)throws Exception
    {
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
