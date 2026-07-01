import java.util.*;
public class KruskalAlgo {

    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo( Edge p2 ){
            return this.wt - p2.wt;
        }
    }
    public static void createGraph( ArrayList<Edge>edges ){
        //edges
        edges.add( new Edge(0, 1, 10 ));
        edges.add( new Edge(0, 2, 15 ));
        edges.add( new Edge(0, 3, 30 ));
        edges.add( new Edge(1, 3, 40 ));
        edges.add( new Edge(2, 3, 50 ));
    }
    static int n = 4;
    static int parent [] = new int [n];
    static int rank [] = new int [n];
    public static void init(){
        // initialize parent Array
        for(int i= 0 ; i< n ; i++){
            parent[i]=i;
        }

        // initialize rank Array
        for(int i= 0 ;i< n ; i++){
            rank[i]=0;
        }


    }
    public static int find( int x ){
        if( x== parent[ x ] ){
            return x;
        }
        parent[ x ]= find( parent[ x ] );
        return parent[ x ];
    }
    public static void union( int a, int b ){
        // find the parent of both edges
        int parA= find(a);
        int parB= find(b);

        if( parA == parB ){
            return;  // this is the cyclic condition
        }

        // now compare the rank and assign the parent to lesser one
        if( rank[ parA ] == rank[ parB ] ){
            parent[ parB ]= parA;
            rank[ parA ]++;
        }else if( rank[ parA ] > rank[ parB ] ){
            parent[ parB ]= parA;
        }else{
            parent[ parA ]= parB;
        }
    }
    public static void kruskalsMST( ArrayList<Edge> edges, int V ){
        Collections.sort(edges);

        int mstCost=0;
        int count=0;

        for( int i= 0; count < V-1; i++){
            Edge e= edges.get(i);
            // ( src, dest, wt )

            int parA= find(e.src);
            int parB= find(e.dest);

            if( parA != parB ){
                union( e.src, e.dest );
                mstCost+= e.wt;
                count++;
            }
        }
        System.out.println( mstCost );

    }

    public static void main(String[] args) {
        // call init 
        init();
        int V=4;
        ArrayList<Edge> edges= new ArrayList<>();
        createGraph( edges );
        kruskalsMST( edges, V );

    }
}
