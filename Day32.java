//QUESTION
// https://www.geeksforgeeks.org/problems/second-largest3735/1
// Given an array of integers, find the second largest distinct element. If it doesn't exist, return -1. Input: [12,35,1,10,34,1]  Output: 34


public class Day32 {

    class Solution {
        public static int getSecondLargest(int[] arr) {
            // code here
            int max = arr[0];
            int second = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    second = max;
                    max = arr[i];
                }
                if (arr[i] > second && arr[i] < max && max != second) {
                    second = arr[i];
                }
                if (max == second) {
                    second = -1;
                }
            }
            return second;

        }
    }


        public static void main(String[] args) {

        int[] arr = {10, 20, 4};

        int result = Solution.getSecondLargest(arr);

        System.out.println(result);
    }

}
