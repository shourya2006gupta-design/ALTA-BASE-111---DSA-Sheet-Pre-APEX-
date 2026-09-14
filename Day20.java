//QUESTION
// Write a program that prints numbers from 1 to N, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz". 

import java.util.*;

public class Day20 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N= sc.nextInt();

      int i=1;
      while (i<=N){
        if (i%3==0 && i%5!=0){
          System.out.print("Fizz ");
        }
        else if (i%5==0 && i%3!=0){
          System.out.print("Buzz ");
        }
        else if (i%5==0 && i%3==0){
          System.out.print("FizzBuzz ");
        }
        else
        System.out.print(i+" ");
        i++;
      }
    }
}
