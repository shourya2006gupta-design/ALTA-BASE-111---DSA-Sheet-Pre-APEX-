//QUESTION
// Write a program that checks whether a given day, month, and year form a valid calendar date, using if-else to account for the correct number of days in each month and leap years for February. Input: 30 2 2024 Output: Invalid Date

import java.util.*;

public class Day10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int day= sc.nextInt(); // takes day as input
      int month= sc.nextInt(); // takes month as input
      int year= sc.nextInt(); // takes year as input

      if (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12) { // months with 31 days
        if (0<day && day<=31){
          System.out.println("Valid Date");
        }
        else{
          System.out.println("Invalid Date");
        }
      }

      else if(month==4 ||month==6 ||month==9 ||month==11){ // months with 30 days
        if (0<day && day<=30){
          System.out.println("Valid Date");
        }
        else{
          System.out.println("Invalid Date");
        }
      }
      
      else if(month==2){ // month with 28 or 29 day
        if ((year%4==0 && year %100!=0)||(year%400==0)){ // checking leap year
          if (0<day && day<=29){
            System.out.println("Valid Date");
          }
          else{
            System.out.println("Invalid Date");
          }
        }
        else{
          if (0<day && day<=28){
            System.out.println("Valid Date");
          }
          else{
            System.out.println("Invalid Date");
          }
        }
      }
      else{
        System.out.println("Invalid Date");
      }
    }
}

