package tests.kaiser;

import java.util.Arrays;

/**
 * Definition: 2 strings are called anagrams if they contain same set of characters but in different order.
 * Example: School Master = The Classroom; Astronomer = Moon Starer; The Hurricanes = These churn air
 */

public class Anagrams {
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

        return Arrays.equals(newPhrase1, newPhrase2);
    }
}
