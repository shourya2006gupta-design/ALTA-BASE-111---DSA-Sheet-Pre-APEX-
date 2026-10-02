//QUESTION
// Given an array, reverse it in place. Input: [1,4,3,2,6,5]  Output: [5,6,2,3,4,1]

import java.util.*;

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
             arr[i]=arr[n-i-1];
             arr[n-i-1]=temp;
        }
        
    }
}
public class Day34 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        Solution solution = new Solution();
        solution.reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
