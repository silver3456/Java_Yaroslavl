package CodingChallange;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int max = 100;
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}

