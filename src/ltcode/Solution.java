package ltcode; /**
 * Created by hd on 2016/8/16.
 */

/**
 * LeetCode #1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have EXACTLY one solution.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */

/**
 * 暴力
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] result = new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = Math.min(i,j);
                    result[1] = Math.max(i,j);
                }
            }
        }
        return result;
    }

}