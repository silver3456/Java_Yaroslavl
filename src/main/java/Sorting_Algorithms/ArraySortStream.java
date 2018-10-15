package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortStream {
    public static void main(String[] args) {

        Integer[] arr = {1, 5, 4, 3, 6, 7, 8};

        //Sort ascending

        Arrays.stream(arr).sorted().forEach(System.out::println);

        System.out.println("\t\t");

        //Sort descending
        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
