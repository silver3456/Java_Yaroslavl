package CodingChallange.udemy_algorithms;

import java.util.*;

import static CodingChallange.udemy_algorithms.BinarySearch.iterativeBinarySearch;

public class Test {
    public static void main(String[] args) {

        int[] arr = {3, 1, 9, -1, 22,-45};
//        int[] arr = {3};

        System.out.println(find(arr));


    }

    public static int find(int[] arr) {

        if (arr.length < 2)
            return arr[0];

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;

    }
}
