import java.util.*;

public class LongestCommonSubRec{
   
    public static int longestCommonSub(String str1, String str2){
        if (str1.isEmpty() || str2.isEmpty()) return 0;

        // case 1
        int m = str1.length();
        int n = str2.length();

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
      
            return 1 + longestCommonSub(str1.substring(0, m - 1), str2.substring(0, n - 1));
        }else{
            return Math.max(longestCommonSub(str1, str2.substring(0, n - 1)),
            longestCommonSub(str1.substring(0, m - 1), str2));
        }

        
    }
    public static void main(String[] args) {
        String str1 = new String("abcde");
        String str2 = new String("ace");

        
        System.out.println(longestCommonSub(str1, str2));
    

    }
}