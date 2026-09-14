//QUESTION

// Write a program that loops through numbers starting from 1 and stops (using break) as soon as it finds the first number divisible by 7, printing that number.

import java.util.*;

public class Day18 {

    public static void main(String[] args) {

      int i=1;

      while (true){

        if (i%7==0){

          System.out.println(i);

          break;

        }

        i++;

      }

    }

}