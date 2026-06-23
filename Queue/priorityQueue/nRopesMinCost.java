package Queue.priorityQueue;
import java.util.*;
public class nRopesMinCost {
    public static int minCost(int size , int arr[]){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int  i=0;i<size;i++){
            pq.offer(arr[i]);
        }
        int res=0;
        while(pq.size()>1){
           int first=pq.poll();
           int sec=pq.poll();
           res+=first+sec;
           pq.offer(first+sec);

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        int size=4;
        System.out.println(minCost(size, arr));
    }
}
