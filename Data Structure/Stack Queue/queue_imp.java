import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
public class queue_imp {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(5);
        // queue.add(4);
        // queue.add(8);
        // queue.add(665);
        // queue.add(45);
        // System.out.println(queue.peek());

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        //Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(35);
        deque.removeFirst();
        deque.remove();
       




    }
    
}
