import java.util.*;

public class CatalanRecursion {
    public static int catalan(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int cn = 0;
        for(int i = 0; i < n; i++) {
            cn += catalan(i) * catalan(n - i - 1);
        }
        return cn;
    }
    public static void main(String[] args) {
        System.out.println(catalan(25));
    }
}