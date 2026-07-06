import java.util.ArrayList;

public class ArticulationTarjanAlgo {

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

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dis[], int low[], int time, boolean []vis, boolean []ap){
        vis [curr]= true;
        dis[curr]= low[curr]= ++time;
        int children= 0;
        

        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            int neigh= e.dest;
            if(neigh== par){
                continue;
            }else if(vis[neigh]== true){
                low[curr]= Math.min(low[curr], dis[neigh]);
            }else{
                dfs(graph, neigh, curr, dis, low, time, vis, ap);

                low[curr]= Math.min(low[curr], low[neigh]);

                if(par!= -1 && dis[curr]<= low[neigh]){
                    ap[curr]= true;
                } 
                children++;
            }
        }

        if(par== -1 && children> 1){
            ap[curr]= true;
        }

        
    }
    public static void getAP(ArrayList<Edge> graph[], int V){
        int dt[]= new int[V];
        int low[]= new int[V];
        int time= 0;
        boolean vis[]= new boolean[V];
        boolean ap[]= new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, time, vis, ap);
            }
        }
        for(int i=0; i<ap.length; i++){
            if(ap[i]== true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int V= 5;

        ArrayList<Edge> graph[]= new ArrayList[V];

        int [][] edges= {
            {0, 1},
            {1, 2},
            {2, 0},
            {0, 3},
            {3, 4}
        };
        createGraph(graph, V, edges);
        getAP(graph, V);

    }
}
