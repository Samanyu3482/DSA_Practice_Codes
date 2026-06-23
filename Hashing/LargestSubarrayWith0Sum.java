import java.util.*;
public class LargestSubarrayWith0Sum {

    public static int LargestLen(int[]arr){
        int sum=0;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(sum==0){
                len=j+1;
            }
            if(map.containsKey(sum)){
                int subLen=j-map.get(sum);
                len=(int)(Math.max(len,subLen));
            }else{
                map.put(sum,j);
            }

        }

        return len;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
        int arr1[]={1,-1};
        System.out.println(LargestLen(arr1));
    }
}
