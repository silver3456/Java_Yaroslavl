package CodingChallange.youtube;


import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static void main(String[] args) {
        int arr[] = {1, 6, 9, 45, 89};
        int target = 45;
        System.out.println(binary(arr, target));
    }

    // 5 4 3 2 1
    static int binary(int[] arr, int number) {

        if (arr.length == 0) {
            return -1;
        }

        if (arr.length == 1) {
            if (arr[0] == number) {
                return 0;
            }
            return -1;
        }


        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <=end) {
            mid = (start + end)/2;

            if (arr[mid] < number) {
                start = mid +1;
            } else if (arr[mid] > number) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;

    }


}
