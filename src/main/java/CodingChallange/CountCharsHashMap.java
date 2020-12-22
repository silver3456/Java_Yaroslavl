package CodingChallange;

import java.util.HashMap;
import java.util.Map;

public class CountCharsHashMap {

    public static void main(String[] args) {

        String s = "fdhis  is ad88f fffl93";
        Map<Character, Integer> map = new HashMap<>();
        int count;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (map.containsKey(ch)) {
                    count = map.get(ch);
                    map.put(ch, ++count);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
