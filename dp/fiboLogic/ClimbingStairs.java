package dp.fiboLogic;

public class ClimbingStairs {

    public static int ways(int n){
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(n == 1 || n == 2 || n == 3){
            return n;
        }
        if(n == 4){
            return 5;
        }
        return ways(n-1)+ ways(n-2);
    }
    public static void main(String[] args) {
        System.out.println(ways(0));
    }
}
