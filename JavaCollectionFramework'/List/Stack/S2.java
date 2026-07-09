import java.util.*;

public class S2 {
    public static void main(String[] args) {
        // Methods specific to Stack

        Stack<Integer> ll = new Stack<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);

        // push()--> similar to add function
        ll.push(50);
        System.out.println(ll);
        // pop()--> LIFO
        ll.pop();
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);

        // peek()--> returns last element of the stack
        System.out.println(ll.peek());

        // search()
        /*
         * the 1-based position from the top of the stack where
         * the object is located; the return value -1
         * indicates that the object is not on the stack.
         * 1 indexed function and indexing starts from top of the stack 
         */
        System.out.println(ll.search(10));
        System.out.println(ll.search(1));// returns -1 if not present 

        //empty()
        System.out.println(ll.empty());
    }
}
