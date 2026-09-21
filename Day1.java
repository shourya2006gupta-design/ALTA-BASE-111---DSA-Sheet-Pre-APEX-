// Write a program that takes the number of days a person has lived and estimates their age using integer division by 365, printing both the whole years and the remainder days. Input: 7305  Output: 20 years, 5 days

import java.util.*;

class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the number of days you have lived: "); //input statement
        int daysLived = sc.nextInt(); // taking input

        System.out.println(daysLived / 365 + " years, " + daysLived % 365 + " days"); // returning result
        
        sc.close();
    }
}