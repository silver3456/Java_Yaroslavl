/*Problem: Write a program which will print a string in reverse using array.

Enter a string: abcdef
String "abcdef" in reverse: fedcba
 */

package CodingChallange;

import java.util.Scanner;

public class ReverseStringUsingArray {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        input.close();
        String reverse = "";

        char[] arr = string.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            reverse = reverse + arr[i];


        System.out.print("String \"" + string + "\" in reverse: " + reverse);
    }
}

