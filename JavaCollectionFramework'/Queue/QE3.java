import java.util.PriorityQueue;

public class QE3 {
    public static void main(String[] args) {
        //PriorityQueue-->
        // Insertion of elements can of anyorder but removal is according to the priority
        // for integers priority order is lower to higher
        // it only keeps lowest element at its priority and set the remaining elements as it is 
        //if you want to access elements int the increasing order apply loops for it

        PriorityQueue <Integer> pq = new PriorityQueue<>(); 
        pq.offer(100);
        pq.offer(98);
        pq.offer(99);
        System.out.println(pq);
        
        //Printing an elements of PriorityQueue simultaneously emptying it 
        while(pq.size()!=0){
            System.out.println(pq.poll());
        }
        System.out.println(pq);//[]
        System.out.println(pq.size());//0
    }
}
