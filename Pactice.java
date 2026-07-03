public class Pactice{


    public static void spiral(int [][] matrix, int rows, int col ){
        // spiral print

        // defined var
        int startRow=0;

        int endRow=rows-1;

        int startCol=0;

        int endCol=col-1;

        while(startRow<=endRow && startCol<=endCol){

            // left to right
            for(int j=startCol; j<=endCol; j++){
                System.out.println(matrix[startRow][j]);
            }

            // top to down

            for(int i=startRow+1; i<=endRow; i++){
                System.out.println(matrix[i][endCol]);
            }

            // right to left

            for(int j=endCol-1;j>=startCol; j--){
                if(startRow==endRow) break;
                System.out.println(matrix[endRow][j]);
            }

            // down to top
            for(int i=endRow-1; i>startRow; i--){
                if(startCol==endCol) break;
                System.out.println(matrix[i][startCol]);
            }

            startRow++;startCol++;endRow--;endCol--;
        }

    }
    public static void main(String[] args) {
        int [][]  matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        spiral(matrix, matrix.length, matrix[0].length);


    }
}