//QUESTION
// Write a program that prints numbers from 1 to N, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz". 

import java.util.*;

public class Day20 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number N to print numbers from 1 to N with FizzBuzz rules: ");// input statement
      int N= sc.nextInt();
      System.out.println("The numbers from 1 to " + N + " with FizzBuzz rules are: ");// output statement

      int i=1;
      while (i<=N){ // loop to print numbers from 1 to N with FizzBuzz rules
        if (i%3==0 && i%5!=0){// checking if the number is a multiple of 3 but not 5
          System.out.print("Fizz ");
        }
        else if (i%5==0 && i%3!=0){// checking if the number is a multiple of 5 but not 3
          System.out.print("Buzz ");
        }
        else if (i%5==0 && i%3==0){// checking if the number is a multiple of both 3 and 5
          System.out.print("FizzBuzz ");
        }
        else// if the number is not a multiple of 3 or 5, print the number itself
        System.out.print(i+" ");
        i++;
      }
      sc.close();
    }
}
