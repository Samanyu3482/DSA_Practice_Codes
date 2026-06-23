package Stacks;
import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>st=new Stack<>();
        nextGreaterElement(st,arr);
    }
    public static void nextGreaterElement(Stack<Integer>st,int arr[]){
        int nextGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            //2
            if(st.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[st.peek()];
            }
            //3
            st.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }System.out.println();
    }
}
