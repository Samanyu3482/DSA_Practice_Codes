package Graphs;
import java.util.*;
public class Graph2 {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
        }

    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge>[] graph,int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));


        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));


        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));


        graph[6].add(new Edge(6, 5, 1));

    }
    public static void bfs(ArrayList<Edge>[] graph){
         boolean visited[]=new boolean[graph.length];

         for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                bfsUtil(graph, visited,i);
            }
         }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean visited[],int start){
        Queue<Integer> q=new LinkedList<>();
       

        q.add(start);

        while(!q.isEmpty()){
            int curr=q.remove();

            if(visited[curr]==false){
                visited[curr]=true;
                System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++){
                    q.add(graph[curr].get(i).dest);
                }

            }else{
                continue;

            }
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean visi[]){
        if(src==dest) return true;
        visi[src]=true;
        
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visi[e.dest] && hasPath(graph,e.dest, dest, visi)){
                return true;
            }
        }

        return false;
    }
    public static void dfs(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph, visited, i);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, boolean visited[],int curr){
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                dfsUtil(graph, visited, e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[V];
        createGraph(graph,V);
        // dfs(graph,new boolean[V], 0);

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));


        
    }
}
