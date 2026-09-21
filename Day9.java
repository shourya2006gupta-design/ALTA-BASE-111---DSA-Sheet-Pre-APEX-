//QUESTION
// Write a program that takes weight (kg) and height (m), computes BMI = weight / height^2, and categorizes it as Underweight (<18.5), Normal (18.5-24.9), Overweight (25-29.9), or Obese (30+) using nested if-else.

import java.util.*;

public class Day9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter weight (kg) and height (m) (separated by space): ");// input statement
      double kg= sc.nextDouble(); // takes weight
      double m= sc.nextDouble(); // takes height

      double BMI = (double)kg/(m*m);

      if (BMI<18.5){ // checking the category
        System.out.println("Underweight");
      }
      else if(BMI<25){
        System.out.println("normal");
      }
      else if(BMI<30){
        System.out.println("Overweight");
      }
      else{
        System.out.println("Obese");
      }

      sc.close();
    }
}
