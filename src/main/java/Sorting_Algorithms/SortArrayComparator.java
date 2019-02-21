package Sorting_Algorithms;

import java.util.Arrays;

public class SortArrayComparator {
    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Sort ascending

        Arrays.sort(arr, (o1, o2) -> o1.compareTo(o2));
        for (int j : arr)
            System.out.print(j + " ");


        //Sort descending
//        Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2));
//        for (int j : arr)
//            System.out.print(j + " ");

    }
}
