public class TargetSumTabu{
    public static boolean targetSumSubset( int arr [], int targetSum ){
        int n = arr.length;
        boolean [][] dp = new boolean[ n + 1 ][ targetSum + 1 ];

        for ( int i = 0; i < n + 1; i++ ){
            dp [i][0] = true;
        }

        for ( int j = 1; j < targetSum + 1; j++ ){
            
            dp[0][j] = false;
        }

        for ( int i = 1; i < n + 1; i++ ){
            for ( int j = 1; j < targetSum + 1; j++ ){
                int v = arr [ i - 1 ];
                if ( v <= j && dp[ i - 1 ][ j - v ] == true ){
                    dp[i][j] = true;
                }else if ( dp[ i - 1 ][j] == true ){
                    dp[i][j] = true;
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][targetSum];
    }
    public static void main(String[] args) {
        int numbers [] = {4, 2, 7, 1, 3};
        int targetSum = 10;

        System.out.println(targetSumSubset( numbers, targetSum ));

    }
}