//QUESTION
// Write a program to check whether a given year is a leap year (divisible by 4, but not by 100 unless also by 400). Input: 2024  Output: Leap Year

import java.util.*;

public class Day7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // taking variable
      System.out.println("Enter a year: ");
      int year = sc.nextInt(); 
      
      sc.close();

      if (year%4==0) {  // leap year if it is divisible by 4 
        if (year % 100 ==0 ){ // not a leap year if only divisible by 100
          if (year % 400==0){ // leap year if only divisible by 400
            System.out.println("Leap Year");
          }
          else{
            System.out.println("Not A Leap Year");
          }
        }
        else{
          System.out.println("Leap Year");
        }
      } 
      else {
        System.out.println("Not A Leap Year");
      }
    }
}
