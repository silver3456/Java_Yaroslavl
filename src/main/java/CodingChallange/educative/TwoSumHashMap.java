package CodingChallange.educative;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {

    /*
    Task: Find Two Numbers that Add up to "n"
    This code works in O(n)O(n), as the whole array is iterated over once.
     */

    public static void main(String[] args) {
        int[] arr = {1,21,3,14,5,60,7,6};
//        int[] arr = {1, 21};
        int value = 81;
        System.out.println(Arrays.toString(twoNums(arr, value)));


    }

    static int[] twoNums(int[] arr, int target) {

        if (arr.length == 2) {
            if (arr[0] + arr[1] == target) {
                return new int[]{arr[0], arr[1]};
            }
            return null;
        }

        if (arr.length == 0)
            return null;


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{arr[i], complement};
            } else {
                map.put(arr[i], i);
            }
        }
        return null;
    }
}