package Stacks;
import java.util.*;
public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverse("samanyu"));
    }
    public static String reverse(String str){
        if(str.length()==0){
            return "not possible";
        }
        Stack<Character>st=new Stack<>();
        int i=0;
        while(str.length()!=i){
            st.push(str.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            
            sb.append(st.peek());
            st.pop();
        }
        return sb.toString();
    }
}
