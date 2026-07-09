import java.util.LinkedList;

public class LLimplementsfromQueueandDeque{
    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        //addFirst()
        list1.addFirst(5);
        System.out.println(list1);
        //addLast()
        list1.addLast(50);
        //getFirst()
        System.out.println(list1.getFirst());
        //getLast()
        System.out.println(list1.getLast());
        //removeFirst()
        list1.removeFirst();
        System.out.println(list1);
        //removeLast()
        list1.removeLast();
        System.out.println(list1);

        //peek--return the first element of the linkedlist
        System.out.println(list1.peek());

        //poll --> return and remove first and last element of the linkedlist
        System.out.println(list1.poll());
        System.out.println(list1);

        //offer()--> adds the specified elements at the end of the linkedlist
        list1.offer(100);
        System.out.println(list1);

       



    }
}