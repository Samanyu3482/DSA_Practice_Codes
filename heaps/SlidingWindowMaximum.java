import java.util.*;

public class SlidingWindowMaximum {
    static class Element implements Comparable<Element> {
        int val;
        int idx;

        public Element(int idx, int val) {
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Element e2) {
            return e2.val - this.val;
        }
    }

    public static int[] slidingWindowMaximum(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int [n - k + 1];
        int idxResult = 0;
        
        // make a pq and add k elements to it
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.add(new Element(i, arr[i]));
        }

        // two pointers to maintain window size
        int p1 = 0;
        int p2 = k - 1;

      
        

        while(p2 < n) {
           
            while(!pq.isEmpty() && (pq.peek().idx < p1 || pq.peek().idx > p2)) {
                pq.poll();
            }
            result[idxResult++] = pq.peek().val;
            
            p2++;
            p1++;
            if(p2 < n) {
                pq.add(new Element(p2, arr[p2]));
            }
        }


        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = slidingWindowMaximum(arr, k);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}