package CodingChallange;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int reverse = 0;
        int origin = number;
        while ((number > 0)){
            reverse = reverse * 10 + number % 10;
            number = number/10;
        }
        if(origin == reverse){
            System.out.println(origin + " is palindrome number");
        }else {
            System.out.println(origin + " is not a palindrome number");
        }
    }
}
