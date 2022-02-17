package CodingChallange.youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {


        int[] numbers = new int[]{1, 4, 7, 11, 15};
        int[][] arr = new int[][]{{2}, {2}};
//        System.out.println(binary(numbers, 7));

        for (int[] arr2 : arr) {
            for (int a : arr2) {
                System.out.print(a + " ");
            }
        }



    }

    private static int binary(int[] input, int target) {

        int start = 0;
        int end = input.length -1;
        int mid = 0;

        for (int i = 0 ; i < input.length; i++) {
            mid = (start + end) / 2;

            if(input[mid] > target) {
                end = mid - 1;
            } else if (input[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
       return -1;
    }
}
