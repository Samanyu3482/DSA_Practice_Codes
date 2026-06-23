package Queue;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque= new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        
    }
}
