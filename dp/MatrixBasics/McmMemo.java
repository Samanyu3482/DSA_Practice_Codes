import java.util.*;

public class McmMemo {
    public static int mcm(int[] arr,int[][] dp, int i, int j) {
        if(i == j) {
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];

        int minCost = Integer.MAX_VALUE;
        for(int k = i; k <= j - 1; k++) {
            int cost1 = mcm(arr, dp, i, k);
            int cost2 = mcm(arr, dp, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            minCost = Math.min(minCost, cost1 + cost2 + cost3);
        }
        dp[i][j] = minCost;

        return minCost;
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;
        int[][] dp = new int [n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], - 1);
        }

        System.out.println(mcm(arr, dp, 1, n - 1));
    }
}