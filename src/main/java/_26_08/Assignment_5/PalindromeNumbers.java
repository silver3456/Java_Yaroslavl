package _26_08.Assignment_5;

import _25_08.JUtils;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        System.out.print("Enter array length: ");

        //Enter central number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter random central number: ");
        Integer central = input.nextInt();
        String convertNum = String.valueOf(central);//convert int to String

        System.out.println("Input sides length");
        int count = input.nextInt();

        while (count <= 0) {
            System.out.println("Count has to be greater than zero");
            count = input.nextInt();
        }

        String res = convertNum;
        for (int i = 0; i < count; i++) {
            int rnd = JUtils.randomize(0, 10);
            res = rnd + res + rnd;
        }

        System.out.println(res);
    }
}



