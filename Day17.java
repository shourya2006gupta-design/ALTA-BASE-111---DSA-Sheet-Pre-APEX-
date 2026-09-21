//QUESTION
// Write a program to print the first N terms of the Fibonacci series using a loop (no recursion). Input: N = 7  Output: 0 1 1 2 3 5 8

import java.util.*;

public class Day17 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number N to print the first N terms of the Fibonacci series: ");// input statement
      int n = sc.nextInt(); // takes num as input
      System.out.print("The first " + n + " terms of the Fibonacci series are: ");// output statement

      int a=0 ,b=1 ,c=0; //initializing the first two terms of the Fibonacci series

      if (n==1){//exceptional case
        System.out.println(a);
      }
      if (n==2){//exceptional case
        System.out.println(a+" "+b);
      }
      
      if (n>2){ // printing Fibonacci Series till N
        while (n-- >= 1){
          System.out.print(c+" ");
          a=b;
          b=c;
          c=b+a;
        }
      }
      sc.close();
    }
}

