//QUESTION
// Write a program to print all numbers from 1 to N using a for loop. Input: N = 5  Output: 1 2 3 4 5

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt(); // takes num as input
      int i =0; // temporary variable for iteration
      while (i < num){
        System.out.println(++i);
      }

    }
}
