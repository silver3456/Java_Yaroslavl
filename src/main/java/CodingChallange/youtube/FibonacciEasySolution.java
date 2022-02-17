package CodingChallange.youtube;
//https://www.youtube.com/watch?v=F4bbhDmdt14


public class FibonacciEasySolution {
    public static void main(String[] args) {
        printFib(7);
    }

    private static void printFib(int input) {

        int firstNum = 0;
        int secondNum = 1;

        System.out.print(firstNum + " " + secondNum);

        for (int i = 0; i < input - 2; i++ ) {
            int nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum + "" );

            int temp = secondNum;
            secondNum = nextNum;
            firstNum = temp;
        }

    }


}
