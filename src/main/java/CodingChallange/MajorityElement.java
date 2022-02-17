package CodingChallange;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */

//Vitaly's solution

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));


    }

    private static Integer majorityElement(@Nonnull int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> mapOfNums = new HashMap<>();

        final int value = nums.length/2;


        for (final int num : nums) {
            if (mapOfNums.containsKey(num)) {
                mapOfNums.put(num, mapOfNums.get(num) + 1);
            } else {
                mapOfNums.put(num, 1);
            }
        }


        for (final Map.Entry<Integer, Integer> entry : mapOfNums.entrySet()) {

            System.out.println(entry);
            if (entry.getValue() > value) {
                return entry.getKey();
            }


        }

        return null;

    }
}


