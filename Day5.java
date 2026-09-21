//QUESTION
// Write a program that prints the boolean result of checking whether a withdrawal amount is positive AND does not exceed the account balance -- print the True/False result directly, no message or branching needed. Input: balance=5000, amount=3000  Output: True

import java.util.*;

public class Day5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the account balance and withdrawal amount (separated by space): ");// input statement
      int a= sc.nextInt(); // balance
      int b= sc.nextInt(); // amount

      // returning result
      System.out.println(a>=0 && a>=b);

      sc.close();
    }
}