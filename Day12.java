//QUESTION
// Write a program that takes a month number (1-12) and prints its season (Winter, Summer, Monsoon, Autumn) using switch-case with intentional fall-through so multiple month cases share one season block.

import java.util.*;

public class Day12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int month = sc.nextInt(); // takes month as input

      switch (month){ // tells the season
        case 12,1,2: //winter
        System.out.println("Winter");
        break;

        case 3,4,5: //summer
        System.out.println("Summer");
        break;

        case 6,7,8,9: //monsoon
        System.out.println("Monsoon");
        break;

        case 10,11: //autumn
        System.out.println("Autumn");
        break;

      }
    }
}


