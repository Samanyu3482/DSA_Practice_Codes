package backtracking;

public class strt {
    public static void main(String[] args) {
        int arr[]=new int [5];
        back(arr, 0,1);
        prt(arr);

    }
    public static void back(int arr[],int i,int val){
        
        //base case
        if(i>=arr.length){
            prt(arr);
            return;
        }
        //kaam
        arr[i]=val;
        back(arr, i+1,val+1);
        arr[i]=arr[i]-2;//backtracking step
        
    }
    public static void prt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
