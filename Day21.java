//QUESTION
// Write two functions with the same name -- one that takes two integers and returns their sum, and another that takes two floating-point numbers and returns their sum (function overloading). If your language does not support overloading, simulate it with two clearly different function names and explain the limitation.

import java.util.*;

public class Day21 {
  static float sum(float a , float b){
    return a+b;
  }

  static int sum(int a , int b){
    return a+b;
  }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      System.out.print("Write two integers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(sum(a,b));

      System.out.print("Write two floating numbers: ");
      float A = sc.nextFloat();
      float B = sc.nextFloat();

      System.out.println(sum(A,B));

    }
}
