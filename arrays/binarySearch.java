package arrays;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("plz enter the number you want to search in array : ");
    int key=sc.nextInt();
    int array[]={1,2,3,4,5,6,7,8,9};
        System.out.println("the index of the key entered is : "+binarySearchMethod(array,key));

    }
    public static int binarySearchMethod(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        do{
            int mid= (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }while(start<=end);
        return -1;
    }
}
