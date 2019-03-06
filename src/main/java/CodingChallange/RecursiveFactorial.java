package CodingChallange;

//Factorial means to multiply a series of descending natural numbers. E.g. 5! = 120 (5*4*3*2*1)

public class RecursiveFactorial {
    public static long factorial(int number) {
        if (number < 1) {
            return 1; // Base case
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
}
