//QUESTION
// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
// Given two sorted arrays, print their union: all distinct elements from both, in sorted order. Input: [1,2,3],[2,3,4]  Output: [1,2,3,4]

import java.util.*;

public class Day39 {

    static class Solution {
        public static ArrayList<Integer> findUnion(int a[], int b[]) {

            ArrayList<Integer> A = new ArrayList<>();

            for (int x : a)
                A.add(x);

            for (int x : b)
                A.add(x);

            Set<Integer> S = new HashSet<>(A);

            ArrayList<Integer> arr = new ArrayList<>(S);

            Collections.sort(arr);

            return arr;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = Solution.findUnion(a, b);

        System.out.println(result);

        sc.close();
    }
}
