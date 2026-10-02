//QUESTION
// https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
// Given an array and an integer d, rotate the array to the left by d positions. Input: [1,2,3,4,5], d=2  Output: [3,4,5,1,2]

import java.util.*;

class Solution {
    public void rotateArr(int arr[], int d) {
        d = d % arr.length;

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length - d; i++) {
            ans[i] = arr[d + i];
        }

        for (int i = 0; i < d; i++) {
            ans[arr.length - d + i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}

public class Day35 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        Solution solution = new Solution();
        solution.rotateArr(arr, d);
    }
}