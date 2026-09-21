//QUESTION
// Write two functions with the same name -- one that takes two integers and returns their sum, and another that takes two floating-point numbers and returns their sum (function overloading). If your language does not support overloading, simulate it with two clearly different function names and explain the limitation.

import java.util.*;

public class Day21 {
  static float sum(float a , float b){// function to calculate sum of two floating-point numbers
    return a+b;
  }

  static int sum(int a , int b){// function to calculate sum of two integers
    return a+b;
  }

    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("This program demonstrates function overloading by calculating the sum of two integers and two floating-point numbers.");// program description

      System.out.print("Write two integers: ");// input statement for 2 integers
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(sum(a,b));

      System.out.print("Write two floating numbers: ");// input statement for 2 floating-point numbers
      float A = sc.nextFloat();
      float B = sc.nextFloat();

      System.out.println(sum(A,B));

      sc.close();
    }
}
