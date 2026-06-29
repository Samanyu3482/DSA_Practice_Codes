import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithKStops {
    static class Edge{
        int src;
        int dest;
        int cost;
        public Edge(int src,int dest,int cost){
            this.src=src;
            this.dest=dest;
            this.cost=cost;
        }
    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge>graph[],int[][]flights,int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int []flight=flights[i];
            int src=flight[0];
            int dest=flight[1];
            int cost=flight[2];
            graph[src].add(new Edge(src,dest,cost));
        }

    }
    static class Info{
        int vertex;
        int cost;
        int stops;
        public Info(int v,int c,int s){
            vertex=v;
            cost=c;
            stops=s;
        }
    }

    public static int cheapestFlight(int n,int[][]flights,int src,int dest,int k){
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[n];
        createGraph(graph, flights, n);

        // initialize distance
        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        // Queue
        Queue<Info>q=new LinkedList<>();

        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                continue;
            }
            for(int i=0;i<graph[curr.vertex].size();i++){
                Edge e=graph[curr.vertex].get(i);
                int u=e.src;
                int v=e.dest;
                int w=e.cost;
                if(curr.cost+w<dist[v] && curr.stops<=k){
                    dist[v]=curr.cost+w;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }
        return dist[dest];



    }
    public static void main(String[] args) {
        // int[][]flights={
        //     {0,1,100},
        //     {1,2,100},
        //     {2,0,100},
        //     {1,3,600},
        //     {2,3,200}
        // };
        int[][]flights={
            {0,1,5},
            {0,2,1},
            {2,1,1},
            {1,3,1},
            
        };
        int src=0;
        int dest=3;
        int k=1;
        int V=4;
        int ans=cheapestFlight(V, flights, src, dest, k);
        System.out.println(ans);



    }
}
