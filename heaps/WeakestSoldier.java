import java.util.*;

public class WeakestSoldier {
    static class Row implements Comparable<Row> {
        int idx;
        int freq;

        public Row(int idx, int freq) {
            this.idx = idx;
            this.freq = freq;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.freq == r2.freq) {
                return this.idx - r2.idx;
            }
            return this.freq - r2.freq;
        }
    }
    
    public static void main(String[] args) {
        int[][] army = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i = 0; i < army.length; i++) {
            int[] row = army[i];
            int freq = 0;
            for(int man : row) {
                if(man == 1) freq++;
            }
            pq.add(new Row(i, freq));
        }

        while (k != 0) {
            Row r = pq.poll();
            System.out.println("row idx : " + r.idx + " row soldiers : " + r.freq);
            k--;
        }

    }
}