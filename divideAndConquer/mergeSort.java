package divideAndConquer;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};

        sortArr(arr, 0, arr.length-1);
        prntArr(arr);
        



    }
    public static void prntArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void sortArr(int arr[],int si,int ei){
        //base
        if(si>=ei){
            return;
        }

        //kaam
        int mid=si+(ei-si)/2;
        sortArr(arr, si, mid);
        sortArr(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int [ei-si+1];//this formula will give size of new array
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //but on above if any one condition turn false then whole loop exit even if other part me kuch elements 
        //bache ho so for them
        

        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to origional
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


        
    }
}
