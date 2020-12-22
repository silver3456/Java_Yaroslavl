package CodingChallange.youtube;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class FirstUniqueCharLinkedHashMap {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("lleetcode"));

    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i); // put the chars that we haven't seen meaning they are unique
            } else {
                map.put(ch, -1); // we want to invalidate the chars, so they are not unique
            }
        }

        int min = Integer.MAX_VALUE; // this is gonna represent the minimum index that
                                     // that we've seen a unique character at


        for (char c : map.keySet()) {
            if (map.get(c) > - 1 && map.get(c) < min) {
                return map.get(c);
            }
        }
        return -1;
    }
}