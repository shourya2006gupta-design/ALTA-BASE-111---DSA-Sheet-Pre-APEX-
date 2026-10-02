//QUESTION
// Define a custom type called Node with a value field and a field that can point/refer to another Node of the same type. Create two Node instances, manually link the first node's reference to the second, then print both values by starting at the first node and following the link. This is the exact building block a linked list is made of -- it directly sets up the Linked List section that follows.

class node{// custom type
    int v;
    node link;
}

public class Day30 {
    public static void main(String[] args) {
        
        // creating nodes
        node n1 = new node();
        node n2 = new node();

        // assigning value to nodes
        n1.v=45;
        n1.link=n2;
        n2.v=54; 

        // printing values
        System.out.println("Node 1: "+n1.v);
        System.out.println("Node 2: "+n1.link.v);
       
    }
}

