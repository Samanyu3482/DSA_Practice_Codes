import java.util.*;
public class CoinChange{
    public int coinChangeWays(int[] coins, int sum){
        int n = coins.length;
        // step 1
        int dp[][] = new int [n + 1][sum + 1];

        // step 2
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i < sum + 1; i++){
            dp[0][i] = 0;
        }

        // step 3
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < sum + 1; j++){
                
            }
        }


    }
    public static void main(String[] args) {
        int[] coins = {2, 5, 6, 3};
        int sum = 10;
    }
}