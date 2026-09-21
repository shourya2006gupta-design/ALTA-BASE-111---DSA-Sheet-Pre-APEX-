//QUESTION
// Write a program to print all numbers from 1 to N using a for loop. Input: N = 5  Output: 1 2 3 4 5

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number N to print numbers from 1 to N: ");// input statement
      int num = sc.nextInt(); // takes num as input

      for (int i=1;i<=num ;i++ ) {// loop to print numbers from 1 to N
        System.out.println(i);
      }

      sc.close();
    }
}
