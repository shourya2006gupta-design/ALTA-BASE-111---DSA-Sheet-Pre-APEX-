//QUESTION
// Write a program to swap the values of two variables using a third (temporary) variable.Input: a = 5, b = 10  Output: a = 10, b = 5

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of two variables to be swapped (separated by space): "); // input statement
        int a = sc.nextInt(); // taking input for variable 1
        int b = sc.nextInt(); // taking input for variable 2

        int c; // making a temporary variable

        // swapping
        c = b;
        b = a;
        a = c;

        // returning result
        System.out.println("Swapped 1st variable is " + a + "\nSwapped 2nd variable is " + b);
        sc.close();
    }
}