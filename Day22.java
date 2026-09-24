//Question
//In C/C++, write a function using a pointer or reference parameter (&) to modify a caller's variable, and contrast it with a plain pass-by-value version that does not. In Java/JS, demonstrate the same limitation Java has for primitives: write a method that tries to modify an int parameter (it will NOT affect the caller's variable -- Java has no true pass-by-reference), then contrast this by modifying a field inside a passed object or array instead (which DOES affect the caller's data, since the object reference itself was passed).

import java.util.*;

public class Day22 {

    static void change(int num, int[] arr1) { // function to change the value of num and arr1
        num = 10; // trying to change the value of num (primitive type)
        // This will not affect the caller's variable

        arr1[0] = 8; // trying to change the value of arr1 (non-primitive type)
        arr1[1] = 7;
        arr1[2] = 9;
        // This will affect the caller's array
    }
    public static void main(String[] args) {

        int num = 5; // primitive variable
        int[] arr = {1, 2, 3}; // non primitive variable

        System.out.println(num);//value of num before calling change method
        System.out.println(Arrays.toString(arr)); //value of arr before calling change method

        change(num,arr); // calling change method

        System.out.println(num);   //value of num after calling change method
        System.out.println(Arrays.toString(arr)); //value of arr after calling change method
    }
}
