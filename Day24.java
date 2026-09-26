//Question
// Write a menu-driven program (a loop + switch-case) that lets the user repeatedly choose from: (1) sum of two numbers, (2) factorial, (3) prime check, (4) largest of three numbers -- each implemented as its own function -- until the user chooses to exit. This is a capstone exercise combining everything in this tier.

import java.util.*;

public class Day24 {

    static void sum(Scanner sc) {//method to sum two numbers

        //taking inputs
        System.out.print("Write 2 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        //printing result
        System.out.println("Sum of two numbers is "+(a + b));
        System.out.println();

    }

    static void factorial(Scanner sc) {//method to get factorial of a number
        
        System.out.print("Write a number: ");
        //declaring variables
        long a = sc.nextLong();
        long mul = 1;

        //multiplying each number between 1 to n
        for (long i = 1; i <= a; i++) {
            mul *= i;
        }

        //printing result
        System.out.println("Factorial of "+a+": "+mul);
        System.out.println();

    }

    static void prime(Scanner sc) {//method to check a number is prime or not
        
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt(); // takes num as input
        int i = 2;
        boolean isPrime = true;

        while (i * i <= num) { // finding factor of num from 2 to its sq root
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime && num > 1) // checking if prime or not
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        System.out.println();

    }

    static void largest(Scanner sc) {// method to find the largest of three
        
        // taking variables
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // finding largest number
        System.out.print("Largest number is ");
        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {//main method
        Scanner sc = new Scanner(System.in);
        boolean run=true; //loop flag

        while (run) { // loop to run switch case till user exit
            System.out.println("===== MENU =====");
            System.out.println("Enter 1 to add two numbers ");
            System.out.println("Enter 2 to get factorial of a number ");
            System.out.println("Enter 3 to check it is prime ");
            System.out.println("Enter 4 to largest of three numbers ");
            System.out.println("Enter 5 to Exit ");

            int num = sc.nextInt();


            switch (num) {//running the menu
                case 1:
                    sum(sc);
                    break;
                case 2:
                    factorial(sc);
                    break;
                case 3:
                    prime(sc);
                    break;
                case 4:
                    largest(sc);
                    break;
                case 5:
                    run=false;
                    sc.close();
                    break;
                    
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}
