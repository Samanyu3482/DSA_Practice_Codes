import java.util.*;
public class FloodFill {
    public static void floodFillUtil( int [][] matrix, int sr, int sc, int color, int prevColor, boolean [][] visited){
        if( sr< 0 || sc< 0 || sr>= matrix.length || sc>= matrix[0].length) return;
        if( matrix [sr][sc] != prevColor ) return;
        if( visited [sr][sc]== true ) return; 

        matrix [sr][sc]= color;
        visited [sr][sc]= true;
        //up
        floodFillUtil(matrix, sr-1, sc, color, prevColor, visited);

        // down
        floodFillUtil(matrix, sr+1, sc, color, prevColor, visited);

        //left
        floodFillUtil(matrix, sr, sc-1, color, prevColor, visited);

        //right
        floodFillUtil(matrix, sr, sc+1, color, prevColor, visited);
    }
    public static void floodFill( int [][] matrix, int sr, int sc, int color ){
        boolean visited [][]= new boolean [ matrix.length ][ matrix[0].length ];

        floodFillUtil( matrix, sr, sc, color, matrix [sr][sc], visited);

    }
    public static void print( int [][] matrix ){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print( matrix [i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix [][]= {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr= 1;
        int sc= 1;

        int color= 2;

        print(matrix);

        floodFill(matrix, sr, sc, color);

        print(matrix);

    }
}
