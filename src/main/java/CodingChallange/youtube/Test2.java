package CodingChallange.youtube;

import java.util.*;

//qwertyiop  ty = 4

public class Test2 {
    public static void main(String[] args) {
        String input = "qwertyiop";
        String target = "typ";

        System.out.println(findSubstring(input, target));
    }

    private static int findSubstring(String input, String target) {

//        String input = "qwertyiop";
//        String target = "tyz";

        int count = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) != target.charAt(i)) {
                    count++;
                } else if (input.charAt(j) == target.charAt(i) && count <= map.get(map.size() - 1) + 1) {
                    map.put(i, count);
                    count = 0;
                    break;
                }
            }
        }

        return map.size() == target.length() ? map.get(0) : -1;
    }

}



