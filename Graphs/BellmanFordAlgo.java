package Graphs;

import java.util.ArrayList;

public class BellmanFordAlgo {

      static class Edge{
        int src;
        int dest;
       int w;
        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            this.w=w;
            
        }

    }
    @SuppressWarnings("unchecked")
    public static void createGraph(ArrayList<Edge>[] graph,int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1, 2,-4));
        

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3, 4,4));


        graph[4].add(new Edge(4, 1,-1));
        




    }
    public static void bellman(ArrayList<Edge>graph[],int src){
        int dis[]=new int[graph.length];
        for(int i=0;i<dis.length;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }else{
                dis[i]=0;
            }
        }

        // BellmanFordAlgo

        int V=graph.length;

        for(int i=0;i<V-1;i++){
            //edges 
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);

                    int u=e.src;
                    int v=e.dest;
                    int wt=e.w;

                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt<dis[v]){
                        dis[v]=dis[u]+wt;
                    }
                }
            }
        }


        for(int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
    public static void createGraph1(ArrayList<Edge>graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }
    public static void bellman2(ArrayList<Edge>graph,int src,int V){
        int dis[]=new int[V];
        for(int i=0;i<dis.length;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }else{
                dis[i]=0;
            }
        }


        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.size();j++){
                Edge e=graph.get(j);
                int u=e.src;
                    int v=e.dest;
                    int wt=e.w;

                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt<dis[v]){
                        dis[v]=dis[u]+wt;
                    }
            }
        }
        for(int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int V=5;
        // @SuppressWarnings("unchecked")
        // ArrayList<Edge>graph[]=new ArrayList[V];
        // createGraph(graph, V);
        // bellman(graph, 0);

        ArrayList<Edge> graph=new ArrayList<>();
        createGraph1(graph);
        bellman2(graph, 0, 5);

    }
}
