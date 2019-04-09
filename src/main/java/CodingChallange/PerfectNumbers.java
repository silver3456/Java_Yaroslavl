package CodingChallange;

//Perfect number is a positive integer that is equal to the sum of its proper
//divisors (6=>1+2+3)

public class PerfectNumbers {
    public static boolean isPerfect(int number) {
        int temp = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        if (temp == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int max = 10_000;
        for (int i = 1; i <= max; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
