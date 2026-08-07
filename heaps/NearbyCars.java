import java.util.*;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        public Point(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }
        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String[] args) {
        int[][] pts = { {3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++) {
            int[] car = pts[i];
            int x = car[0];
            int y = car[1];
            int distSq = x * x + y * y;
            Point newPoint = new Point(x, y, distSq);
            pq.add(newPoint);
        }

        while(k != 0) {
            Point pt = pq.poll();
            System.out.println(pt.distSq);
            k--;
        }

    }
}