//QUESTION
// Write a program that calculates the final price of an item after applying a 10% discount, 
// then adding 18% tax on the discounted price. Input: price = 1000  Output: 1062.0

import java.util.*;

public class Day4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the price of the item: ");// input statement
      int a= sc.nextInt(); // taking price
      
      float discountedPrice=90*(float)a/100;// calculating discounted price after 10% discount

      // returning result
      System.out.println("Discounted Price after taxes : "+((discountedPrice*18/100)+discountedPrice));

      sc.close();
    }
}