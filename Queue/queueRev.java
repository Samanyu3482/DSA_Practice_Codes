package Queue;
import java.util.*;
public class queueRev {
    public static void rev(Queue <Integer> q){
        Stack<Integer>st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        rev(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }System.out.println();

    }
}
