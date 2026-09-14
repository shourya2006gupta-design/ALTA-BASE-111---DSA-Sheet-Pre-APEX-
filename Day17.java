//QUESTION
// Write a program to print the first N terms of the Fibonacci series using a loop (no recursion). Input: N = 7  Output: 0 1 1 2 3 5 8

import java.util.*;

public class Day17 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt(); // takes num as input
      int a=0 ,b=1 ,c=0;
      if (n==1){
        System.out.println(a);
      }
      if (n==2){
        System.out.println(a+" "+b);
      }
      
      if (n>2){
        while (n-- >= 1){
          System.out.print(c+" ");
          a=b;
          b=c;
          c=b+a;

        }
      }
    }
}

