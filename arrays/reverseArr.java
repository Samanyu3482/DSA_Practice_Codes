package arrays;
import java.util.*;
public class reverseArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int array[]={12,34,5,3,2};
        reverseArray(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void reverseArray(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        

    }
    
}
