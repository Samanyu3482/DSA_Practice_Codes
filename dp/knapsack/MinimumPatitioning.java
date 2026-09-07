import java.util.*;

public class MinimumPartitioning{
    public static int minPar(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        int W = sum / 2;
        int[][] dp = new int[n + 1][W + 1];

        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < W + 1; j++) {
                if(j >= arr[i - 1]) {
                    int ans1 = dp[i - 1][j];
                    int ans2 = arr[i - 1] + dp[i - 1][j - arr[i - 1]];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};
        System.out.println(minPar(arr));
    }
}