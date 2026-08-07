import java.util.*;

public class ConnectNRopes {

    public static int minCost(int[] ropes) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int rope : ropes) {
            pq.add(rope);
        }

        while(pq.size() != 1) {
            int r1 = pq.poll();
            int r2 = pq.poll();
            cost += (r1 + r2);
       
            pq.add(r1 + r2);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        
        int cost = minCost(ropes);
        System.out.println(cost);
       

    }
}