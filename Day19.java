//QUESTION
// Write a program that prints numbers from 1 to N but uses continue to skip printing any multiple of 3. Input: N = 10  Output: 1 2 4 5 7 8 10

import java.util.*;

public class Day19 {
    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number N to print numbers from 1 to N but skip multiples of 3: ");// input statement 
      int N= sc.nextInt();
      System.out.println("The numbers from 1 to " + N + " skipping multiples of 3 are: ");// output statement

      int i=1;

      while (i<=N){ // loop to print numbers from 1 to N
        if (i%3==0){ // checking if the number is a multiple of 3
          i++;
          continue;
        }

        System.out.print(i+" "); // printing the number if it is not a multiple of 3
        i++;
      }

      sc.close();
    }
}
