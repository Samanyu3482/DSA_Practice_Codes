package backtracking;

public class permu {
    public static void main(String[] args) {
        String p="Sam";
        findPerm(p, "");
    }
    public static void findPerm(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //kaam
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            findPerm(newStr, ans+curr);
        }
    }
}
