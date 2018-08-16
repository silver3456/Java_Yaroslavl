import java.util.Arrays;
import java.util.Scanner;


public class MaxMinArray {
    public static void main(String[] args) {

        Integer n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = randomize(10, 50);
        for (int i : arr)
            System.out.print(i + " ");

        findMax(arr);
        findMin(arr);
    }

    static int max = 0;


    public static void findMax(Integer[] arr) throws NullPointerException, IllegalArgumentException {
        if (arr == null)
            throw new NullPointerException("arr is null");

        if (arr.length == 0)
            throw new IllegalArgumentException("length is null");


        Arrays.sort(arr, (o1, o2) -> o1.compareTo(o2));

        max = arr[arr.length - 1];
        System.out.println("Maximum value is: " + max);
    }

    public static void findMin(Integer[] arr) throws NullPointerException, IllegalArgumentException {
        if (arr == null)
            throw new NullPointerException("arr is null");

        if (arr.length == 0)
            throw new IllegalArgumentException("length is null");

        Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2));


        int min = arr[arr.length - 1];
        System.out.println("Minimum value is: " + min);

    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }


}

