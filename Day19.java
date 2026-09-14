//QUESTION
// Write a program that prints numbers from 1 to N but uses continue to skip printing any multiple of 3. Input: N = 10  Output: 1 2 4 5 7 8 10

import java.util.*;

public class Day19 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N= sc.nextInt();

      int i=1;
      while (i<=N){
        if (i%3==0){
          i++;
          continue;
        }
        System.out.print(i+" ");
        i++;
      }
    }
}
