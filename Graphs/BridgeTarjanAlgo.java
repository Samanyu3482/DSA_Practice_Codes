import java.util.ArrayList;

public class BridgeTarjanAlgo {
    static class Edge{
        int src;
        int dest;
        public Edge( int src, int dest ){
            this.src= src;
            this.dest= dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int V, int [][] edges){
        for(int i=0; i<V; i++){
            graph[i]= new ArrayList<>();
        }

        for(int i=0; i<edges.length; i++){
            int src= edges[i][0];
            int dest= edges[i][1];
            graph[src].add( new Edge(src, dest));
            graph[dest].add( new Edge(dest, src));
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int[]dt, int []low, boolean []vis, int time){
        vis[curr]= true;
        dt[curr]= low[curr]= ++time;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            int src= e.src;
            int neigh= e.dest;
            if(neigh== par){
                continue;
            }else if(!vis[neigh]){
                dfs(graph, neigh, curr, dt, low, vis, time);
                low[curr]= Math.min(low[curr], low[neigh]);
                if(dt[curr]< low[neigh]){
                    System.out.println(curr+ " -> "+ neigh);
                }
            }else{
                low[curr]= Math.min(low[curr], dt[neigh]);
            }
        }
    }
    public static void tarjanBridge(ArrayList<Edge> graph[], int V){
        int []dt= new int[V];
        int []low= new int[V];
        int time= 0;

        boolean vis[]= new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }
    public static void main(String[] args) {
        int [][] edges={
            {0, 1},
            {1, 2},
            {2, 0},
            {0, 3},
            {3, 5},
            {3, 4},
            {4, 5}
        };

        int V= 6;
        ArrayList<Edge> graph[]= new ArrayList[V];

        createGraph(graph, V, edges);

        tarjanBridge(graph, V);

    }
}
