package Queue;
import java.util.*;
public class stackUsingDeque {
    static class Stack{
        static Deque<Integer> deque= new LinkedList<>();
        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        public static int peek(){
            if(deque.isEmpty()){
                System.out.println("empty!");
                return -1;
            }
            return deque.getFirst();
        }
        public static void push(int data){
            deque.addFirst(data);
        }
        public static int pop(){
            if(deque.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return deque.removeFirst();
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            int data=st.peek();
            System.out.println(data);
            st.pop();
        }

    }
}
