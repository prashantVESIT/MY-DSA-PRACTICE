import java.util.*;
public class QE1 {
    public static void main(String[] args) {

        //LINKEDLIST
        Queue <Integer> q=new LinkedList<>();
        
        //add(): it adds the elements to the Queue but throws an exception if not added
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        
        //offer(): it adds the elements to the Queue but if task is successful, offer returns true
        //if not returns false 
        Queue <Integer> q1 = new LinkedList<>();
        q1.offer(40);
        q1.offer(50);
        System.out.println(q1);

        //element() : Returns the head of the Queue. throws an exception if the Queue is empty
        System.out.println(q1.element());
        System.out.println(q1);

        //peek() : Returns the head of the Queue.Returns null if the Queue is empty
        System.out.println(q1.peek());
        System.out.println(q1);

        //remove(): Returns and remove the head of the Queue. throws an exceeption if the Queue is empty
        System.out.println(q.remove());
        System.out.println(q);

        //poll() :  Returns and removes head of the Queue.Returns null if the Queue is empty
        System.out.println(q.poll());
        System.out.println(q);


        //preferred functions are 
        //offer() : for addition of elements 
        //peek() : for accessing first element of the Queue
        //poll() : for returning and removing first element of the Queue





    }
    
}
