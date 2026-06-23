package Stacks;
import java.util.*;
public class maxAreaUnderHistogram {
    public static void nextSmallerRight(int arr[],int nsr[]){
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            //while
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

    }
    public static void nextSmallerLeft(int arr[],int nsl[]){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static int maxArea(int height[],int nsl[],int nsr[]){
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            int h=height[i];
            int w=nsr[i]-nsl[i]-1;
            int area=h*w;
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void prnt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        nextSmallerRight(arr, nsr);
        nextSmallerLeft(arr, nsl);
        
        System.out.println(maxArea(arr, nsl, nsr));
        

        
    }
}
