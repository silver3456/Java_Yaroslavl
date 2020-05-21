package CodingChallange;/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.HashMap;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0;i<nums.length;++i){

            if(hash.containsKey(target-nums[i])){
                ans[0] = hash.get(target-nums[i]);
                ans[1] = i;
            }else{
                hash.put(nums[i],i);
            }
        }
        return ans;

    }
}
