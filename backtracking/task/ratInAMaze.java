package backtracking.task;

public class ratInAMaze {
    public static void main(String[] args) {
        int maze[][]={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

    }
    public static int solveMaze(int maze[][],int i,int j,int n){
        //base case
        if(i==n-1 && j==n-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }

        //kaam
        int d=solveMaze(maze, i+1, j,n);
        int u=solveMaze(maze, i-1, j,n);
        int r=solveMaze(maze, i, j+1,n);
        int l=solveMaze(maze, i, j-1,n);

        return r+l+u+d;
    }
    public static boolean isSafe(int maze[][],int i,int j){
        if(maze[i][j]==0){
            return false;
        }
        return true;
            
        
    }
}
