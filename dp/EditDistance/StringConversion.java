import java.util.*;

public class StringConversion {
    public static int lcs(String str1, String str2){
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int i = 0; i < m + 1; i++) {
            dp[i][0] = 0;
        }
        for(int i = 0; i < n + 1; i++) {
            dp[0][i] = 0;
        }


        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                   
                }else{
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        String word1 = "abcdef";
        String word2 = "aceg";
        int lcsLen = lcs(word1, word2);

        System.out.println("Delete OP : " + (word1.length() - lcsLen));
        System.out.println("Insert OP : " + (word2.length() - lcsLen));
    }
}