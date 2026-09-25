//Question
// Write a function that takes two integers and returns both the quotient and remainder of their division, using whatever mechanism your language supports (tuple, pair, struct, or output parameters).

import java.util.*;

public class Day23 {

    static int[]  division(int a, int b) {  // function to calculate quotient and remainder of a and b
        int quotient = a / b; 
        int remainder = a % b; 

        return new int[]{quotient, remainder}; //return array
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers: "); // taking input from user
        int a= sc.nextInt(); 
        int b= sc.nextInt(); 

        int[] arr=division(a,b); 

        System.out.println("Quotient: " + arr[0]);   //printing output
        System.out.println("Remainder: " + arr[1]);   

        sc.close();
    }
}
