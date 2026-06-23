package arraysPart2;

public class maxSubArraySum {
    // BRUTE FORCE METHOD O(n^3)
    // public static void subArrMaxSum(int arr[]){
    //     int currentSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int start=i;
    //         for(int j=i;j<arr.length;j++){
    //             int end=j;
    //             currentSum=0;
    //             for(int x=start;x<=end;x++){
    //                 currentSum+=arr[x];
    //             }
    //             if(currentSum>maxSum){
    //                 maxSum=currentSum;
    //             }
    //             System.out.println(currentSum);
    //         }
            
    //     }
    //     System.out.println("max sum="+maxSum);
    // }

    
    
    
    
    
    // more optimised method  O(n^2)
    public static void maxSumOptimised(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int x=1;x<prefixSum.length;x++){
            prefixSum[x]=prefixSum[x-1]+arr[x];

        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum= start==0 ? prefixSum[end]:prefixSum[end]-prefixSum[start-1];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }

                
                
                System.out.println(currentSum);
            }
            
        }
        System.out.println("max sum="+maxSum);
    }





    // KADANES algorithm O(n)
    public static void KADANES(int arr[]){
        int start=0;
        int end=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            currSum+=arr[i];
           
            if(maxSum<currSum){
                maxSum=currSum;
                end=i;
            }
            if(currSum<0){
                start=i;
                currSum=0;
            }
        }
        if(start>end){
            start=end;
        }
        System.out.println(maxSum);
        System.out.println("start " + start);
        System.out.println("end "+ end);
    }
    public static void main(String[] args) {
        int array[]={-2,-1,-3};
        KADANES(array);
        
    }
}
