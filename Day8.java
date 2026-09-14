//QUESTION
// Write a program to check whether a given number is divisible by both 3 and 5. Input: 45  Output: Yes

import java.util.*;

public class Day8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      
      int a= sc.nextInt(); // number

      if (a%3==0 && a%4==0){ // checking if it is divisible by 3 and 5 
        System.out.println("Yes");
      }
      else{
        System.out.println("no");
      }
      
    }
}
