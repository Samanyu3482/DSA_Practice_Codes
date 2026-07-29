import java.util.*;

public class LongestCommonSubMemo{

    public static int lcs(String str1, String str2, int m, int n, int[][] dp){
        if (n == 0 || m == 0) return 0;

        if (dp[m][n] != -1) return dp[m][n];


        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return dp[m][n] = lcs(str1, str2, m - 1, n - 1, dp) + 1; 
        }else {
            int ans1 = lcs(str1, str2, m - 1, n, dp);
            int ans2 = lcs(str1, str2, m, n - 1, dp);
            return dp[m][n] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = new String("abcdge");
        String str2 = new String("abedg");

        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(str1, str2, m, n, dp));

    }
}