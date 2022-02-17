package CodingChallange.youtube;

/*
        https://www.youtube.com/watch?v=St47WCbQa9M
*/

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharHashMap {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("etcode"));

    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i); // put the chars that we haven't seen meaning they are unique
            } else {
                map.put(ch, -1); // we want to invalidate the chars, so they are not unique
            }
        }

        int min = Integer.MAX_VALUE; // this is gonna represent the minimum index
        // that we've seen a unique character at


        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}