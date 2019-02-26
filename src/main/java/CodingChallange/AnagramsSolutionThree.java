//2 strings are called anagrams if they contain same set of characters but in different order
//Ex: Debit Card -> Bad Credit


package CodingChallange;

import java.util.Arrays;

public class AnagramsSolutionThree {

    public static void main(String[] args) {

        String one = "Bad Credit";
        String two = "Debit Card";

        if (isAnagram(one, two)) {
            System.out.println("Strings " + one + " and " + two + " are anagrams");

        } else {
            System.out.println("Strings " + one + " and " + two + " are not anagrams");
        }
    }

    public static boolean isAnagram(String wordOne, String wordTwo) {

        String temp1 = wordOne.replaceAll("\\s", "").toLowerCase(); // replace white space
        String temp2 = wordTwo.replaceAll("\\s", "").toLowerCase();

        String[] arrOne = temp1.split("");
        String[] arrTwo = temp2.split("");

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        int lengthOne = arrOne.length;
        int lengthTwo = arrTwo.length;

        if (lengthOne != lengthTwo) {
            return false;
        }

        for (int i = 0; i < lengthOne; i++) {
            if (!arrOne[i].equals(arrTwo[i])){
                return false;
            }
        }
        return true;
    }
}
