package Queue.priorityQueue;
import java.util.*;
public class pq {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        // pq.offer(5);
        // pq.offer(3);
        // pq.offer(1);
        // pq.offer(2);
        // pq.offer(4);

        // while(!pq.isEmpty()){
        //     System.out.println(pq.poll());
        // }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(5);
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        pq.offer(4);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    }
}
