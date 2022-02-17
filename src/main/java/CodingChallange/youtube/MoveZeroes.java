package CodingChallange.youtube;

//https://www.youtube.com/watch?v=1PEncepEIoE

/*
Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
 */

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);


    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] =0;
        }
        System.out.println(Arrays.toString(nums));

    }
}
