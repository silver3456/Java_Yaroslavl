package CodingChallange;

public class Palindrome {
    public static int reverse(int number) {
        int result = 0;
        while (number > 0) {
            result = result * 10 + (number % 10);
            number = number / 10;
        }
        return result;
    }

    /**
     * Show the numbers less than 10000 whose digit sequences
     * are palindromes.
     */
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (i == reverse(i)) {
                System.out.println(i);
            }
        }
    }
}



