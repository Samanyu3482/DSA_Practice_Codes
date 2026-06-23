package divideAndConquer;

public class quickSort {
    public static void prnt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        sortArr(arr, 0, arr.length-1);
        prnt(arr);
    }
    public static void sortArr(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int pIdx=partition(arr,si,ei);
        sortArr(arr, si, pIdx-1);
        sortArr(arr, pIdx+1, ei);


    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if((arr[j]<=pivot)){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        //abb pivot ko bhi sahi jagha par dalna hai
        i++;
        int temp=pivot;
        arr[ei]=arr[i];//yaha par pivot nahi likhna as pivot toh variable hai hume indx ke aandhar value par 
        // change karna hai.
        arr[i]=temp;
        return i;//i pivot ka sahi idx hai 
    }
}
