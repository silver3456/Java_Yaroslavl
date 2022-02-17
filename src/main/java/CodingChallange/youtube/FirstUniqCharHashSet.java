package CodingChallange.youtube;

//leetcode.com/problems/first-unique-character-in-a-string/discuss/615667/Simple-Java-using-HashSet-or-Single-Pass

import java.util.HashSet;
import java.util.Set;

public class FirstUniqCharHashSet {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("ttode"));

    }

    public static int firstUniqChar(String s) {

        // create a set of chars
        Set<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // from the current i  position we find our
            //first unique character that is not in the HashSet
            if (s.indexOf(c, i + 1) < 0 && !hs.contains(c)) {
                return i;
            } else {
                //If we found a repeating char then we add it to the set
                hs.add(c);
            }
        }
        // didn't find anything
        return -1;
    }
}
