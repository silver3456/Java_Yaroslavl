package OCA;

public class Solution2 {
    public static void main(String[] args) {
        String input = "Hello";

        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String word) {

        String[] arr = word.split("\\s");

        if (arr.length < 2) {
            return 0;
        }

        int lengthOfWord = arr[arr.length -1].length();

        return lengthOfWord;
    }
}
