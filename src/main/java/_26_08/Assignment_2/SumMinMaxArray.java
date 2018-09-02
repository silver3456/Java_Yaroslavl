package _26_08.Assignment_2;

import java.util.Arrays;

public class SumMinMaxArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 1, 5, 55, 7, 11};

        bubbleSort(arr);

        int sum = findMinMaxSum(arr);
        System.out.println("Sum of max and min values is: " + sum);

    }

    public static int[] bubbleSort(int[] a) {
        // Copy the array
        int[] sorted = Arrays.copyOf(a, a.length);

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                int num = a[i];
                int nextNum = a[i + 1];
                if (num > nextNum) {
                    int buf = num;
                    a[i] = nextNum;
                    a[i + 1] = buf;
                }
            }
        }
        return sorted;
    }

    public static int findMinMaxSum(int[] mas) {
        int[] arr = mas;

        int min, max;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            min = arr[i];
            max = arr[arr.length - 1];
            sum = min + max;
            break;
        }
        return sum;
    }
}

