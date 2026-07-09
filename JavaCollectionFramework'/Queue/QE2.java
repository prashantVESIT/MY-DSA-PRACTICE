import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QE2 {
    public static void main(String[] args) {
        // ARRAYDEQUE IMPLEMENTING QUEUE
        //ArrayDeque ----> It is a class in java that implements double-ended queue(Deque) using resizeable array
        Queue <Integer> q = new ArrayDeque<>();
        //here it will follow FIFO order 

        q.offer(10);
        q.offer(40);
        q.offer(30);
        q.offer(20);
        System.out.println(q);

        q.poll();
        System.out.println(q);

        System.out.println(q.peek());

        Deque <Integer> q1 = new ArrayDeque<>();
        //here it can work random order for addition and removal of data
        q1.offer(1);
        q1.offer(2);
        q1.offer(4);
        q1.offer(3);
        System.out.println(q1);

        q1.offerFirst(0);
        q1.offerLast(10);
        System.out.println(q1);

        q1.poll();
        System.out.println(q1);

        System.out.println(q1.peek());
        

        
    }
    
}
