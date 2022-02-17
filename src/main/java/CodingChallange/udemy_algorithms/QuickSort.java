package CodingChallange.udemy_algorithms;

//Theory https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435790#overview
/*
Usually implemented recursively
In-place algorithm (doesn't need extra space cause we don't create temporary array)
Time complexity = Average is O(nlogn), worst is O(n squared). We're repeatedly partitioning the array into two halves
Unstable algorithms - meaning when 2 equal elements compared to each other, there is no guarantee they want changes
their positions
Very efficient for large data sets

Approach: we need to move elements to the left that are smaller than a pivot (usually select first element
in the array. All elements that greater than the pivot are moving to the right

 */
public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -25, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }


    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);

            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}









