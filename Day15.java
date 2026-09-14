//QUESTION
// Write a program to check whether a given number is prime using a loop. Input: 29  Output: Prime

import java.util.*;

public class Day15 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt(); // takes num as input
      int i =2;

      while (i*i <= num){ //finding factor of num from 2 to its sq root
        if (num%i==0){
          System.out.print("Not Prime");
          break;
        }
        i++;
      }
      if (i*i >= num)
      System.out.print("Prime");
    }
}
