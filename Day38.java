//QUESTION
//https://leetcode.com/problems/intersection-of-two-arrays/description/
// Given two arrays, return their intersection (each element appears once). Input: [1,2,2,1],[2,2]  Output: [2]

import java.util.*;

public class Day38 {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int i = 0; i < nums1.length; i++) {
                set1.add(nums1[i]);
            }

            for (int i = 0; i < nums2.length; i++) {
                set2.add(nums2[i]);
            }

            set1.retainAll(set2);

            int[] num = new int[set1.size()];
            int j = 0;

            for (int i : set1) {
                num[j++] = i;
            }

            return num;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Day38 obj = new Day38();
        Solution sol = obj.new Solution();

        int[] result = sol.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}