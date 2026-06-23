package sortingAlgorithms;
import java.util.*;
public class bubbleSort {
    // public static void bubbleSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;

    //             }
    //         }
    //     }
    // }

    public static void bubbleOptimised(int arr[]){
        boolean alreadySorted=true;
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                    alreadySorted=false;

                }
                
            }
            if(swap==0){
                
                break;
            }
          
        }
        if(alreadySorted){
            System.out.println("array is already sorted");
        }
        else{
            printArr(arr);
        }
        
        
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        bubbleOptimised(array);
       
        
    }
    
}
