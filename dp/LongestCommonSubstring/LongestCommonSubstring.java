import java.util.*;

public class LongestCommomSubstring {
    public static int longestCommonSubstring(String str1, int n, String str2, int m) {
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;

        for(int i = 0 ; i < m; i++) {
            dp[0][i] = 0;
        }
        for(int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abgce";
        int n = str1.length();
        int m = str2.length();
        System.out.println(longestCommonSubstring(str1, n, str2, m));
    }
}