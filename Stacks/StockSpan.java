package Stacks;
import java.util.*;
public class StockSpan {
   public static void main(String[] args) {
    int stocks[]={100,80,60,70,60,85,100};
    int span[]=new int[stocks.length];
    stockSpan(stocks,span);

    for(int i=0;i<span.length;i++){
        System.out.print(span[i]+" ");
    }System.out.println();
   } 
   public static void stockSpan(int stocks[],int span[]){
    Stack<Integer>s=new Stack<>();
    span[0]=1;
    s.push(0);
    for(int i=1;i<stocks.length;i++){
        int currPrice=stocks[i];
        while(!s.isEmpty() && currPrice>=stocks[s.peek()]){
            s.pop();

        }
        if(s.isEmpty()){
            span[i]=i+1;
        }else{
            int prevHigh=s.peek();
            span[i]=i-prevHigh;
        }
        s.push(i);
    }
   }

//    public static void span(int arr[]){
//     int prevHigh[]=new int[arr.length];
//     prevHigh[0]=-1;
//     for(int i=1;i<arr.length;i++){
//         for(int x=i;x>=0;x--){
//             if(arr[x]>arr[i]){
//                 prevHigh[i]=x;
//                 break;
//             }else{
//                 prevHigh[i]=-1;
//             }
//         }
//     }

//    int span[]=new int[prevHigh.length];
//    span[0]=1;
//    for(int i=1;i<span.length;i++){
//     if(prevHigh[i]==-1){
//         span[i]=i+1;
//     }else{
//         span[i]=i-prevHigh[i];
//     }
//    }


//    for(int i=0;i<span.length;i++){
//     System.out.print(span[i]+" ");
//    }
// }
}
