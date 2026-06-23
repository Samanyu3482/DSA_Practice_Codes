package Stacks;
import java.util.*;
public class duplicateParen {
    public static boolean dupli(String str){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=')'){
                st.push(str.charAt(i));
            }else{
                int count=0;
                while(st.pop()!='('){
                    count++;
                    
                }
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)+c+(d)";
        String str1="((a+b)+((c)))";
        System.out.println(dupli(str));
        System.out.println(dupli(str1));
    }
}
