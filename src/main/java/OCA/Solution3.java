package OCA;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;

public class Solution3 {

    public static void main(String[] args) {
        String input = "Hello ";

        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(@NotNull String word) {

        if (!word.contains(" ")) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = word.length() -1; i >=0; i--) {
            sb.append(word.charAt(i));

        }

        String[] arr = sb.toString().split("\\s");

//        if (arr.length < 2) {
//            return 0;
//        }

        return arr[0].length();

    }
}
