//QUESTION
// Write a program that declares an array with 5 fixed values in code, prints the element at a given index, then changes the value at another given index and prints the full array again. Input: array=[10,20,30,40,50], read index=2, change index=0 to 99  Output: Read: 30, Updated array: 99 20 30 40 50

import java.util.*;

public class Day26 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50}; // declaring the array
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Write a index you want to read: ");
        int n = sc.nextInt();

        System.out.println("Read: "+arr[n]);//reading the value at the given index
        
        System.out.print("Write a index of value you want to change and also the new value for given index: ");//taking input for the value user wants to change
        int m = sc.nextInt();
        int l = sc.nextInt();

        arr[m]=l;

        System.out.print("Updated Array: ");
        for (int i=0;i<5;i++){//printing the array
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
