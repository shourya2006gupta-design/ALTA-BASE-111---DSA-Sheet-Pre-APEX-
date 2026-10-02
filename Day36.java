//QUESTION
//https://leetcode.com/problems/max-consecutive-ones/
// Given a binary array, find the maximum number of consecutive 1s. Input: [1,1,0,1,1,1]  Output: 3

import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,max=0;
        while(i<nums.length){
            int count=0;
            if (nums[i]==1){
                count++;
                while(i+1<nums.length && nums[i+1]==1 ){
                    i++;
                    count++;
                }
                if (count>max){
                    max=count;
                }
            }
            i++;
        }
        return max;
    }
}

public class Day36 {
    public static void main(String[] args) {
        
        int[] nums = {1,1,0,1,1,1};

        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}
