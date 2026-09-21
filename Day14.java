//QUESTION
// Write a program to print all numbers from N down to 1 using a while loop. Input: N = 5  Output: 5 4 3 2 1

import java.util.*;

public class Day14 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number N to print numbers from N down to 1: ");// input statement
      int num = sc.nextInt(); // takes num as input
      
      while (0 < --num){// loop to print numbers from N down to 1
        System.out.println(num);
      }
      sc.close();
    }
}
