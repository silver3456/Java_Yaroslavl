package CodingChallange;

//0,1,1,2,3,5,8,13


public class RecursiveFibonacci {
    public static long fibonacci(int num) {
        if (num == 0) {
            return 0;// Base case
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        int number = 9;
        for (int i = 0; i <= number; i++)
            System.out.print(fibonacci(i) + " ");
    }
}
