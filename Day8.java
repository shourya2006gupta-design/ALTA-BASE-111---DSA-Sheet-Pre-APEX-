//QUESTION
// Write a program to check whether a given number is divisible by both 3 and 5. Input: 45  Output: Yes

import java.util.*;

public class Day8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number to check if it is divisible by both 3 and 5: ");//input statement
      int a= sc.nextInt(); // taking number

      if (a%3==0 && a%5==0){ // checking if it is divisible by 3 and 5 
        System.out.println("Yes");
      }
      else{
        System.out.println("no");
      }
      sc.close();
    }
}
