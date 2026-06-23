package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleUsingBfs {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[],int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }
    
    
    static class Pair{
        int n;
        int parent;
        public Pair(int n,int parent){
            this.n=n;
            this.parent=parent;
        }

    }
    public static boolean isCycleBfsUtil(ArrayList<Edge>graph[],boolean[]vis,int start){
        Queue<Pair>q=new LinkedList<>();

        q.add(new Pair(start, -1));
        vis[start]=true;
        while(!q.isEmpty()){
            Pair curr=q.remove();
            
            
                for(int i=0;i<graph[curr.n].size();i++){
                    int d=graph[curr.n].get(i).dest;
                   
                    if(!vis[d]){
                         vis[d]=true;
                        q.add(new Pair(d, curr.n));
                    }else if(d!=curr.parent){
                        return true;
                    }
                }
            
        }
        return false;
    }
    public static boolean isCycleBfs(ArrayList<Edge>graph[]){
        boolean []vis=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleBfsUtil(graph, vis, i))return true;
            }
        }
        return false;
    }
    public static boolean isCycleBfsUtil1(ArrayList<Edge>graph[],boolean[]vis,int[]parent,int start){
        Queue<Integer>q=new LinkedList<>();

        q.add(start);
        vis[start]=true;

        while(!q.isEmpty()){
            int curr=q.remove();
            for(int i=0;i<graph[curr].size();i++){
                int d=graph[curr].get(i).dest;
                if(!vis[d]){
                    vis[d]=true;
                    parent[d]=curr;
                    q.add(d);
                }else if(d!=parent[curr]){
                    return true;
                }
            }
        }

        return false;
    }
    public static boolean isCycleBfs1(ArrayList<Edge>graph[]){
        boolean []vis=new boolean[graph.length];
        int parent[]=new int[graph.length];
        for(int i=0;i<parent.length;i++){
            parent[i]=-1;
        }
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleBfsUtil1(graph, vis,parent, i)) return true;
            }
        }           
        return false;
    }
    
    public static void main(String[] args) {
        int V=8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph,V);
        System.out.println(isCycleBfs(graph));
        System.out.println(isCycleBfs1(graph));
        
    }
}
