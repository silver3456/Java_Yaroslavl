package tests.kaiser;

import java.util.Arrays;

/**
 * Definition: 2 strings are called anagrams if they contain same set of characters but in different order.
 * Example: School Master = The Classroom; Astronomer = Moon Starer; The Hurricanes = These churn air
 */

public class Anagrams2 {
    public static void main(String[] args) {

        String str1 = "Astronomer";
        String str2 = "Moon Starer";

        System.out.println(isAnagrams(str1, str2));
    }

    private static boolean isAnagrams(String phrase1, String phrase2) {
        char[] newPhrase1 = phrase1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] newPhrase2 = phrase2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(newPhrase1);
        Arrays.sort(newPhrase2);

        if (newPhrase1.length != newPhrase2.length) {
            return false;
        }

        for (int i = 0; i < newPhrase1.length; i++) {
            if (newPhrase1[i] != newPhrase2[i]) {
                return false;
            }
        }
        return true;
    }
}
