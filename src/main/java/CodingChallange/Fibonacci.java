package CodingChallange;

//Fibonacci sequence of numbers (in modern usage starts with 0), each number is the sum of the previous two

//0,1,1,2,3,5,8,13

public class Fibonacci {
    public static void main(String[] args) {
        int max = 14;
        int prevNum = 0;
        int nextNum = 1;

        for (int i = 0; i <= max; i++) {
            System.out.print(prevNum + " ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */

            int sum = prevNum + nextNum; //Result after each iteration: 1, 2, 3, 5, 8
            prevNum = nextNum; //Result after each iteration: 1, 1, 2, 3, 5
            nextNum = sum; //Result after each iteration: 1, 2, 3, 5, 8
        }
    }
}
