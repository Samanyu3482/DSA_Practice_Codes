import java.util.*;
public class RodCutting{
    public static  int rodCutting(int[] length, int[] price, int rodLength){
        // initialize the dp array
        int n = length.length;
        int[][] dp = new int[n + 1][rodLength + 1];

        // assign meaning to each index
        for (int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }

        for (int i = 0; i < rodLength + 1; i++){
            dp[0][i] = 0;
        }

        // fill the values now
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                // valid
                if (length[i - 1] <= j) {
                    // include
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                    // not include
                }else{
                    // not valid
                    dp[i][j] = dp[i - 1][j];
                }
             

            }
        }

        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;

        System.out.println(rodCutting(length, price, rodLength));

    }
}