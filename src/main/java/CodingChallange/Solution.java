package CodingChallange;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number \n" );
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (N % 2 == 1) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N >= 2 & N <= 5) {
                System.out.println("Not Werid");
            } else if (N % 2 == 0 && N >= 6 & N <= 20) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N > 20) {
                System.out.println("Not Weird");
        }

        scanner.close();
    }
}


