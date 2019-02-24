package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortArrays_Descending {
    public static void main(String[] args) {

        Integer[] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Sort descending
        Arrays.sort(arr, Collections.reverseOrder()); // Should be Integer

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
