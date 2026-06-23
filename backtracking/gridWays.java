package backtracking;

public class gridWays {
    public static void main(String[] args) {
        int n=1,m=11;
        System.out.println("no of ways to go is: "+waysGrid(0, 0, n, m));

    }
    public static int waysGrid(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1; //this is for target position
        }else if(i==n || j==m){
            return 0;//if we cross the boundary
        }

        //kaam
        int w1=waysGrid(i+1, j, n, m);
        int w2=waysGrid(i, j+1, n, m);
        return w1+w2;

    }
}
