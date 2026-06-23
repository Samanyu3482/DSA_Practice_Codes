package sortingAlgorithms;
import java.util.*;
public class countSort {
    public static void countSort(int arr[]){
        //finding the largest/range
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        // making frequency array
        int count[]=new int[largest+1];//as 0 also included

        //counting the frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        
        // printing
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[]={1,5,3,4,6,7,8,1};
        countSort(array);
    }
}
