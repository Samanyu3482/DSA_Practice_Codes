package Graphs;
import java.util.*;

public class TopologicalSorting {
    static class Edge{
        int src;
        int dest;
      
        public Edge(int s,int d){
            src=s;
            dest=d;
 
        }

    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge>[] graph,int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }
    public static void topSortUtil(ArrayList<Edge>[] graph,boolean visited[],Stack<Integer>st,int curr){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                topSortUtil(graph, visited, st, e.dest);
            }

        }
        st.push(curr);
    }

    public static void topSort(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topSortUtil(graph,visited,st,i);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph, V);
        topSort(graph);

    }
}
