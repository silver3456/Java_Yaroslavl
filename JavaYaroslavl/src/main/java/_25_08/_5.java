package _25_08;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter number");
        int var = in.nextInt();

        arrangeArray(arr, var);
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrangeArray(int[][] arr, int number) {
        int strNum = number;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = strNum;
                strNum++;
            }
            strNum = number + i + 1;
        }
    }
}




