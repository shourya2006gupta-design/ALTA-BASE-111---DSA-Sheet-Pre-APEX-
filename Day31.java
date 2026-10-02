//QUESTION
// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
// Given an array of integers, find and return the largest element. Input: [10, 20, 4]  Output: 20


public class Day31 {

    static class Solution {
        public static int largest(int[] arr) {

            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }

            return max;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 4};

        int result = Solution.largest(arr);

        System.out.println(result);
    }
}