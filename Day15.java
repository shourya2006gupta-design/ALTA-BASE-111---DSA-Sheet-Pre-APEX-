//QUESTION
// Write a program to check whether a given number is prime using a loop. Input: 29  Output: Prime

import java.util.*;

public class Day15 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number to check if it is prime: ");
      int num = sc.nextInt(); // takes num as input
      int i =2;
      boolean isPrime = true;

      while (i*i <= num){ //finding factor of num from 2 to its sq root
        if (num%i==0){
          isPrime = false;
          break;
        }
        i++;
      }

      if (isPrime && num > 1) // checking if prime or not
      System.out.print("Prime");
      else
      System.out.print("Not Prime");

      sc.close();
    }
}
