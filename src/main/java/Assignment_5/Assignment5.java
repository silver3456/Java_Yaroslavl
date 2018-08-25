package Assignment_5;

import java.util.Scanner;

public class Assignment5 {

    static int var = 1;
    static int trans = 1;

    public static void main(String[] args) {
        int n;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        int[][] arr = new int[n][n];

        arrangeArray(arr);

    }

    public static void arrangeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = var;
                System.out.print(var + " ");
                var++;
            }

            var = arr[0][0] + trans;
            trans++;
        }
    }
}




