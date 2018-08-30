package _26_08.Assignment_3;

import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {

        int result = countSymbols('a');
        System.out.println(result);

    }

    public static int countSymbols(char symbol) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter some String:");
        String str = s.nextLine();
        char a[] = str.toCharArray();

        int count = 0;

        for (int i : a) {
            if (i == symbol) {
                count++;
            }
        }
        return count;
    }
}

