import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
    static class Edge{
        int src;
        int dest;
        public Edge( int src, int dest){
            this.src= src;
            this.dest= dest;
        }
    }

    public static void createGraph( ArrayList <Edge> graph [], int V, int [][] edges ){
        for( int i= 0; i< V; i++){
            graph [i]= new ArrayList<>();
        }
        for( int i= 0; i< edges.length; i++){
            int src= edges [i][0];
            int dest= edges [i][1];
            graph [src].add(new Edge(src, dest));
        }
    }
    public static void topsort( ArrayList<Edge> graph [], boolean [] vis, Stack<Integer> s, int curr){
        vis[curr]= true;

        for( int i= 0; i< graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(vis [e.dest]== false){
                topsort(graph, vis, s, e.dest);
            }

        }

        s.push(curr);
    }
    public static void createTransposeGraph( ArrayList <Edge> graph [], int V, int [][] edges ){
        for( int i= 0; i< V; i++){
            graph [i]= new ArrayList<>();
        }
        for( int i= 0; i< edges.length; i++){
            int src= edges [i][0];
            int dest= edges [i][1];
            graph [dest].add(new Edge(dest, src));
        }
    }
    public static void dfs( ArrayList <Edge> graph [], boolean [] vis, int curr){
        vis [curr]= true;
        System.out.print(curr+ " ");
        for( int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);

            if( !vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void kosaraju( ArrayList<Edge> graph [], int V, int [][] edges){
        // step 1
        Stack<Integer> s= new Stack<>();
        boolean vis[]= new boolean [V];

        for (int i= 0; i< V; i++){
            if(!vis[i]){
                topsort(graph, vis, s, i);
            }
        }

        // step 2
        ArrayList <Edge> transpose[]= new ArrayList[V];
        createTransposeGraph(transpose, V, edges);
        for( int i= 0; i< vis.length; i++){
            vis[i]= false;
        }


        // step 3
        while( !s.isEmpty() ){
            int curr= s.pop();
            if( vis[curr]== false){
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        int [][] edges= {
            {1, 0},
            {0, 2},
            {2, 1},
            {0, 3},
            {3, 4}
        };
        int V=5;

        ArrayList<Edge> graph[]=new ArrayList[V];

        createGraph(graph, V, edges);

        kosaraju(graph, V, edges);


    }
}
