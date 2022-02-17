package CodingChallange.educative;


/*
https://leetcode.com/problems/valid-anagram/discuss/66484/Accepted-Java-O(n)-solution-in-5-lines

The hashtable should handle all unicode characters.
The time complexity is still O(n) while the space
complexity becomes O(n) because of the hashtable.


Explanation: when the characters repeat, then at the end value of all of them
             will be equal 0 since +1 and -1
 */

import java.util.HashMap;

public class AnagramOrNotHashMap {

    public static void main(String[] args) {
        System.out.println(isAnagram("bol", "lob"));

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if (sl != tl) {
            return false;
        }

        for (int i = 0; i < sl; i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            smap.put(t.charAt(i), smap.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : smap.keySet()) {
            if (smap.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}
