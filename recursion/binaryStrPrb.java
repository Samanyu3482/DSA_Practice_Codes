package recursion;


public class binaryStrPrb {
    public static void main(String[] args) {
        binaryStr(0, 3, "");
    }
    public static void binaryStr(int lstPlace,int n,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // kaam
        // here we should use string builder but  it will make it complex 

        binaryStr(0, n-1, str+"0");
        if(lstPlace==0){
            binaryStr(0, n-1, str+"1");
        }
    }
}
