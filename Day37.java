//QUESTION
//https://leetcode.com/problems/two-sum/
//Given an array of integers and a target, return the indices of the two numbers that add up to the target. Input: [2,7,11,15], target=9  Output: [0,1]

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }

        int[] result = {-1, -1};
        return result;
    }
}

public class Day37 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();

        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}