package Assignment_7;

import java.util.Scanner;

public class Assignment7_3 {

    private static int var;

    public static void main(String[] args) {
        int n, arr[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");

        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomize(1, 10);
        }
        System.out.println("Enter random number");
        var = in.nextInt();

        indexOf(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int randomize(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static int indexOf(int[] arr) {

        int index = -1;

        for (int i = 0; (i < arr.length) && (index == -1); i++) {
            if (arr[i] == var) {
                index = i;
            }
        }
        System.out.println(index);
        return index;
    }

}
