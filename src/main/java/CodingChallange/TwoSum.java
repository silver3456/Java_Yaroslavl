package CodingChallange;

import java.util.Arrays;

public class TwoSum {

    /*
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
     */


    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 26;
        int[] arr2 = twoSum(arr, target);

        for (int i: arr2) {
            System.out.print(i + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
