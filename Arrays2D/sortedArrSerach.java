package Arrays2D;

public class sortedArrSerach {
   
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };
        matrixSortedTop(matrix, 27);
        matrixSortedBott(matrix, 27);

    }
    public static boolean matrixSortedBott(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
            if(key==arr[row][col]){
                System.out.println("element found at index ("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("element not found");
        return false;
    }
    public static boolean matrixSortedTop(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("key found at index ("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("element not found.");
        return false;
    }
}
