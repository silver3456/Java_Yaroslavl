package _12082018;

import java.util.Scanner;

public class WolfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = null;
        while (true) {
            System.out.print("enter wolf's name: ");
            inputString = scanner.nextLine();
            if (inputString.equals("null")) break;
            Wolf wolf;
            if (inputString.length() <= 3) {
                wolf = new Wolf(inputString, WolfSex.MALE);
            } else {
                wolf = new Wolf(inputString, WolfSex.FEMALE);
            }
            System.out.println(wolf.toString());
        }
    }
}
