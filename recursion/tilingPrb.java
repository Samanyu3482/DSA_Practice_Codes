package recursion;

public class tilingPrb {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    public static int tilingProblem(int n){
        //base
        if(n==0 ||n==1){
            return 1;
        }
        //kaam

        //vertical choice
        int fnm1=tilingProblem(n-1);

        //horizontal choice
        int fnm2=tilingProblem(n-2);


        //total ways
        int totalWays=fnm1+fnm2;
        return totalWays;
    }
}

