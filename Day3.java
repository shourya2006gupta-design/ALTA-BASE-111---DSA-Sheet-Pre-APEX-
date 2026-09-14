//QUESTION
// Write a program that stores a boolean variable representing whether a light is on, prints its state, flips it to the opposite value without using if-else (a direct boolean negation),and prints the new state. Input: True  Output: On, then Off

import java.util.*;

public class Day3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean a= sc.nextBoolean(); //taking input for light 

      // returning result
      System.out.println("Current State "+(a ? "On" : "Off"));
      System.out.println("Flipped State "+(!a ? "ON" : "Off"));
    }
}