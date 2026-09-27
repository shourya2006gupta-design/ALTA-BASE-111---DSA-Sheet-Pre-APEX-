//QUESTION
// Write a program that declares an array of 5 integers, takes input for each element from the user, then prints all elements on one line, space-separated. Input: 3 1 4 1 5  Output: 3 1 4 1 5

import java.util.*;

public class Day25 {
    public static void main(String[] args) {

        int[] arr = new int[5];// declaring array of 5 int objects
        
        Scanner sc= new Scanner(System.in);

        System.out.print("write 5 int which you want to add it in array: ");
        for (int i=0;i<5;i++){//taking iput and adding to array
            int a= sc.nextInt();
            arr[i]=a;
        }

        for (int i=0;i<5;i++){//printing the array
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
