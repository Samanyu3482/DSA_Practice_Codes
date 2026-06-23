package backtracking;

public class subsets {
    public static void main(String[] args) {
        String s="123";
        fingSubs(s, "", 0);
    }
    // here i is the index
    public static void fingSubs(String str, String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("{}");
            }else{
                System.out.println(ans+" ");
            }
            
            return;
        }
        //kaam
        //yes choice
        fingSubs(str, ans+str.charAt(i), i+1);
        //no choice
        fingSubs(str, ans, i+1);

    }
}
