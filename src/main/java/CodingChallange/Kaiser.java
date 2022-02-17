package CodingChallange;

import java.util.HashMap;
import java.util.Map;

public class Kaiser {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("eettcode"));
    }

    private static int firstUniqChar(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                map.put(ch, -1);
            }
        }

        int min = Integer.MAX_VALUE;

        for (char ch : map.keySet()) {
            if (map.get(ch) > -1 && map.get(ch) < min) {
                min = map.get(ch);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
