package backtracking;

public class yNqueens {
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }

        if(queen(board,0)){
            System.out.println("their exists a solution to this problem.");
            prnt(board);
        }else{
            System.out.println("no solution to this problem.");
        }
    }
    public static boolean queen(char board[][],int row){
        
        //base case
        if(row==board.length){
            
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(queen(board, row+1)){
                    return true;
                }
        
            //backtracking(if false then unplaces)
            board[row][j]='x';
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // left diagonally up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonally up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //else
        return true;


    }
    public static void prnt(char arr[][]){
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

    }
}
