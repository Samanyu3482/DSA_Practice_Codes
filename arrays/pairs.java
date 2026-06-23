package arrays;

public class pairs {
    public  static void pairsArr(int arr[]){
        //outer
        for(int i=0;i<=arr.length-1;i++){
            //current
            int current=arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        pairsArr(array);
        
    }
}
