//QUESTION
// Write a program to find and print the largest of three given numbers using nested if-else. Input: 4 9 6  Output: 9

import java.util.*;

public class Day6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // taking variables
      System.out.println("Enter three numbers (separated by space): ");
      int a= sc.nextInt(); 
      int b= sc.nextInt(); 
      int c= sc.nextInt(); 
      sc.close();
      // int largest ;

      // finding largest number
      if (a>=b) {
        if (a>=c){
          System.out.println(a);
        }
        else{
          System.out.println(c);
        }
      } 
      else {
        if (b>=c){
          System.out.println(b);
        }
        else{
          System.out.println(c);
        }
      }
    }
}