package Assignment_6;

import java.io.IOException;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) throws IOException {

        int n, arr[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");

        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = randomize(1, 10);

        reverse(arr);
    }

    public static void reverse(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int num = arr[i];
                int nextNum = arr[i + 1];
                if (num < nextNum) {
                    int buf = arr[i];
                    arr[i] = nextNum;
                    arr[i + 1] = buf;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}


