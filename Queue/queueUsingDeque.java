package Queue;
import java.util.*;
public class queueUsingDeque {
    static class Queue{
        static Deque<Integer> deque= new LinkedList<>();
        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        public static void add(int data){
            deque.addLast(data);
        }
        public static int peek(){
            if(deque.isEmpty()){
                System.out.println(("empty"));
                return -1;
            }
            return deque.getFirst();
        }
        public static int remove(){
            if(deque.isEmpty()){
                System.out.println(("empty"));
                return -1;
            }
            return deque.removeFirst();
        }

    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            int data=q.peek();
            System.out.println(data);
            q.remove();
        }
    }
}
