package CodingChallange;

public class PalindromeString {
    public static void main(String[] args) {

        String word = "anna";

        String[] arr = word.split("");

        String wordReverse = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            wordReverse += arr[i];
        }

        if (word.equals(wordReverse)) {
            System.out.println("Input word is palindrome");
        } else {
            System.out.println("Input word is not palindrome");
        }
    }
}
