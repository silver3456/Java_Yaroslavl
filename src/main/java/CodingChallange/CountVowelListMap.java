package CodingChallange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountVowelListMap {

    public static void main(String args[]) {

        String sentence = "ABEEDOIIOLAAE";

        String[] lettersArray = sentence.split("");

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int count = 0;

        for (String s : lettersArray) {
            if (s.equals("A") || s.equals("E") || s.equals("I")) {
                list.add(s);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                count = map.get(list.get(i));
                map.put(list.get(i), count + 1);
            }
            else {
                map.put(list.get(i), 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
