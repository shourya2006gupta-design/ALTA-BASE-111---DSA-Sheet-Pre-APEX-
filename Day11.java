//QUESTION
// Write a program that takes two numbers and an operator symbol (+, -, *, /) and performs the corresponding operation using switch-case on the operator. Input: 10 4 *  Output: 40

import java.util.*;

public class Day11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num1= sc.nextInt(); // takes number as input
      int num2= sc.nextInt(); // takes number as input
      char operator= sc.next().charAt(0); // takes operator symbol as input

      switch (operator){
        case '+':
        System.out.println(num1+num2);
        break;

        case '-':
        System.out.println(num1-num2);
        break;

        case '*':
        System.out.println(num1*num2);
        break;

        case '/':
        System.out.println(num1/num2);
        break;

      }
    }
}