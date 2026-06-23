package Queue;
import java.util.*;
public class reverseFirstKEleOfAQueue {
    public static void reverse(int k,Queue<Integer>q){
        Stack<Integer>st=new Stack<>();
        while(k>0){
            st.add(q.remove());
            k--;
        }
        Queue<Integer>temp= new LinkedList<>();
        while(!q.isEmpty()){
            temp.add(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverse(5, q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }

    }
}
