//QUESTION
// Write a program to check whether a number reads the same forwards and backwards using a loop. Input: 121  Output: Palindrome

import java.util.*;

public class Day16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number to check if it is a palindrome: ");// input statement
      int n = sc.nextInt(); // takes num as input
      int reverse=0;        // to store number from backword
      int placevalue=1;     // stores the placevalue of the digit to be add in reverse
      int num=n;            // variable to to do operation on

      while (num>0){        // removing last digit and adding in reverse with new placevalue
        reverse=(num%10)*placevalue+reverse;
        placevalue*=10;
        num=num/10;
      }

      if (n==reverse)      // Checking if Palindrome or not
      System.out.println("Palindrome");
      else
      System.out.println("Not Palindrome");

      sc.close();

    }
}

