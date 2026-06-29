import java.util.*;
public class ConnectingCitiesWithMiniCost {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[],int n,int[][]cities){
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<cities.length;i++){
            int src=i;
            for(int j=0;j<cities[i].length;j++){
                int dest=j;
                int wt=cities[i][j];
                if(wt!=0){
                    graph[src].add(new Edge(src, dest, wt));
                }
            }
        }

    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int c){
            this.v=v;
            this.cost=c;
        }
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static int minCost(ArrayList<Edge>graph[],int V){
        boolean vis[]=new boolean[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int result=0;
        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                result+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int [][]cities={
            {0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,0},
            {4,7,0,0,0}
        };
        int n=cities.length;
        ArrayList<Edge>graph[]=new ArrayList[n];
        createGraph(graph,n,cities);
        int ans=minCost(graph, n);
        System.out.println(ans);
    }
}
