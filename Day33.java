//QUESTION
// https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
// Given an array, check whether it is sorted in non-decreasing order. Input: [10,20,30]  Output: true

public class Day33 {

    class Solution {
        public boolean isSorted(int[] arr) {
            // code here
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        Day33 day33 = new Day33();
        Solution solution = day33.new Solution();
        boolean result = solution.isSorted(arr);

        System.out.println(result);

    }
}
