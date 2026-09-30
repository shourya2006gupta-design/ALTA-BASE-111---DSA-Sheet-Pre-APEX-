//QUESTION
// Define a custom compound type (a struct in C, a class in Java/C++/JS) called Student with fields for name, age, and marks. Create one Student, set its fields, and print them. Input: name=Rahul, age=19, marks=88  Output: Rahul, 19, 88

import java.util.*;

class Student {// custom type
    String name;
    int age;
    int marks;
}

public class Day28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s = new Student();

        //taking inputs
        System.out.print("Enter student name: ");
        s.name=sc.next();
        System.out.print("Enter student age: ");
        s.age=sc.nextInt();
        System.out.print("Enter student  marks: ");
        s.marks=sc.nextInt();

        System.err.println("Name- "+s.name+",\n Age- "+s.age+",\n Marks- "+s.marks);
        
        sc.close();
        
    }
}
