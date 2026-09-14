//QUESTION
// Write a program to print all numbers from N down to 1 using a while loop. Input: N = 5  Output: 5 4 3 2 1

import java.util.*;

public class Day14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt(); // takes num as input
      int i =0; // temporary variable for iteration
      while (0 <= --num){
        System.out.println(num);
      }
    }
}
