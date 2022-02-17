package CodingChallange.youtube;

import java.util.*;

//qwertyiop  ty = 4

public class Test {
    public static void main(String[] args) {
        String input = "qwertyiop";
        String target = "typ"; //4, 5, 8

        System.out.println(findSubstring(input, target));
    }

    private static int findSubstring(String input, String target) {

//        String input = "qwertyiop";
//        String target = "tyz";


        int count = 0;
        List<Integer> list = new ArrayList<>();

        //4, 5, 8
        // currentCount == lastCount +1

        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) != target.charAt(i)) {
                    count++;
                } else if (input.charAt(j) == target.charAt(i)) {
                    list.add(count);
//                    count = 0;
                    break;
                }
            }
        }

        return list.size() == target.length() ? list.get(0) : -1;

    }

}



