import java.util.*;

public class CycleInGraph{
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

        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));


        // graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));



        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        

       
        graph[4].add(new Edge(4, 3));
     


       

    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(detectCycleUtil(graph,visited,i,-1)){
                    return true;
                }

            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean[] visited,int curr,int parent){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest] ){
                if(detectCycleUtil(graph, visited, e.dest, curr)) return true;
                
            }
            else if (visited[e.dest] && e.dest!=parent){
                return true;
            }
            // case 2 do nothing 

        }

        return false;
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph, V);
        System.out.println(detectCycle(graph));

    }
}