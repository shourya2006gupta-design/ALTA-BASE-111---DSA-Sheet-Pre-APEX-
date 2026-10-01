//QUESTION
// Define a custom type called Point with x and y fields, and a function (or method) that computes the distance between two Points using the distance formula. Input: (0,0) and (3,4)  Output: 5

import java.util.*;

class point{//custom type 
    int x;
    int y;
}

public class Day29 {

    public static double distance(point a , point b){
        // distance formula
        return Math.sqrt(((b.x-a.x)*(b.x-a.x))+((b.y-a.y)*(b.y-a.y)));
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);//creatng object
        point p1 = new point();
        point p2 = new point();

        p1.x=sc.nextInt();//taking inputs
        p1.y=sc.nextInt();
        p2.x=sc.nextInt();
        p2.y=sc.nextInt();
        
        System.err.println(distance(p1,p2));
        
        sc.close();
    }
}
