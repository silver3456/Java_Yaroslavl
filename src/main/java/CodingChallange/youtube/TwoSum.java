package CodingChallange.youtube;

/*
Given an array of integers, return indices of the two numbers such that
they add up to a specific target.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */


/*
Solution:
[1, 5, 3, 8]
1: 5, 3, 8
5: 3, 8
3:

1 + 2 + 3 + ... + n = n^2  -- not the best solution
 */

/*
https://www.youtube.com/watch?v=KfgkH-rTwgo
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = new int[]{2, 8, 7, 11, 15};
        int[] indices = twoSum(numbers, 13);
        Arrays.stream(indices).forEach(System.out::println);


    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff))
                return new int[]{map.get(diff), i};
            map.put(nums[i], i);
        }

        return null;
    }

}












