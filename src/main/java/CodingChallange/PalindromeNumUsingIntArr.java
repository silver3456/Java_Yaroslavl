package CodingChallange;

public class PalindromeNumUsingIntArr {
    public static void main(String[] args) {
        int num = 123321;

        System.out.println(isPalindrome(num) ? "Number is palindrome" : "Number is not palindrome");
    }

    public static boolean isPalindrome(int originNum) {

        String number = String.valueOf(originNum);
        String[] strArr = number.split("");

        int[] numArr = new int[strArr.length];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        String reverseNum = "";

        for (int i = numArr.length - 1; i >= 0; i--) {
            reverseNum += numArr[i];
        }
        if (number.equals(reverseNum)) {
            return true;
        }
        return false;
    }
}
