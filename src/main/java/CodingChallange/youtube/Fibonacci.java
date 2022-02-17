package CodingChallange.youtube;
/*
https://www.youtube.com/watch?v=WrWFfzt3ayc
 */

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int N) {
        if (N == 0)return 0;
        if (N == 1)return 1;

        int a = 0;
        int b = 1;
        int sum = 0;

        while (N > 1) {
            sum = a + b;
            a = b;
            b = sum;
            N--;
        }
        return sum;
    }
}
//0 1 1 2 3 5 8