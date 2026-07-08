import java.util.*;

public class ClimbingStairsVar{
    public static int countWays(int n){
        if (n < 0) return 0;
        if (n == 1 || n == 0) return 1;
        if (n == 2) return 2;
        int dp[]= new int[n+1];
        for ( int i= 3; i<= n; i++ ){
            dp[n]= countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n= 4;
        System.out.println(countWays(n));
    }
}