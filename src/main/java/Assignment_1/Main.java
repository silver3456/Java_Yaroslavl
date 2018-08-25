package Assignment_1

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = randomize(10, 50);
        for (int i : arr)
            System.out.print(i + " ");

        List<Integer> odd = findOdd(arr);

        List<Integer> even = findEven(arr);

//        for (Integer elem : even) {
//            System.out.println(even);
//        }

        System.out.print("\n" + "Even: " + even);
        System.out.println("\n" + "Number of elements: " + even.size() + "\n");
        System.out.println("Odd: " + odd);
        System.out.println("Number of elements: " + odd.size() + "\n");
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static List<Integer> findEven(int[] arr2) {

        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 0) {

                even.add(arr2[i]);

            }
        }

        return even;
    }

    public static List<Integer> findOdd(int[] arr2) {
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 1) {

                odd.add(arr2[i]);

            }
        }
        return odd;
    }
}





