import java.util.ArrayDeque;
import java.util.Deque;

public class QE21{
    public static void main(String[] args) {
        //ARRAYDEQUE IMPLEMENTING STACK
        //it works on LIFO principle
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        

    }
}