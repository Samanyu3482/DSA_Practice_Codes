package recursion;



public class recursionBasics {
    public static void main(String[] args) {
        System.out.println(optimized_x_to_n(2, 5));
    }
    public static int optimized_x_to_n(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfPowerSq=optimized_x_to_n(x, n/2)*optimized_x_to_n(x, n/2); //IF WE DO LIKE THIS
        // IT MAY APPEAR LIKE WE HAVE REDUCED TIME COMPLEXITY BUT NOW ALSO IT WILL REMAIN O(N)
        int halfPower=optimized_x_to_n(x, n/2);
        int halfPowerSq=halfPower*halfPower;//THIS SEEMS SAME AS ABOVE BUT NOT NOW INTERNALLY
        //THE  T.C. WILL BE O(Log(n))
        if(n%2!=0){
            return x*halfPowerSq;
        }
        return halfPowerSq;
    }
    // public static int xPowN(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int xnm1=xPowN(x, n-1);
    //     int xn=x*xnm1;
    //     return xn;
    // }
    // public static void prntDec(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     prntDec(n-1);
    // }
    // public  static void prntInc(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;

    //     }
    //     prntInc(n-1);
    //     System.out.print(n+" ");
    // }

    // public static int fac(int n){
        
    //     if(n==0){
            
    //         return 1;
    //     }
    //     int fnm1=fac(n-1);
    //     int fn=n*fnm1;
    //     return fn;
    // }
    // public static int Sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int result=n+Sum(n-1);
    //     return result;

    // }
    // public static int fibo_n(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int fnm1=fibo_n(n-1);
    //     int fnm2=fibo_n(n-2);
    //     int fn=fnm1+fnm2;
    //     return fn;


    // }
}
