package CodingChallange;

//Write a Java program to find out the first two max values from an array?


import java.util.Arrays;

public class TwoMaxValuesSolutionOne {
    public static void main(String[] args) {

        int[] arr = {3, 8, 4, 7, 9, 1, 5};

        Arrays.sort(arr);

        int arrSize = arr.length;
        int boundary = arrSize - 2;

        for (int i = arr.length - 1; i >= boundary; i--) {
            System.out.println("max numbers are " + arr[i]);

        }
    }
}
