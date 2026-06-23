package Arrays2D;

public class start {
    public static boolean searchKey(int arr[][],int key){
        int rows=arr.length;
        int col=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==key){
                    System.out.println("element found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("element not found at any index");
        return false;
    }
    public static void largestInMatrix(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest=Math.max(largest, matrix[i][j]);
            }
        }
        System.out.println("the largest element of the matrix is : "+largest);
    }
    public static void smallestInMatrix(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                smallest=Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("the smallest element of the matrix is : "+smallest);
    }

    public static void spiralPrint(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            //variable redefining
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
    public static void diagonalSum(int matrix[][]){
        //brute force approach
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if((i+j)==matrix.length-1){ // here by using else if we solved the condition of overlapping
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("the sum of diagonal elements is : "+sum);
    }
    public static void diagonalSumOptimised(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=(matrix.length-i-1)){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("the sum of diagonal elements is : "+sum);

    }
    public static void binarySear(int arr[],int key){
        //for sorted array
        int start=0;
        int end=arr.length-1;
        while(start<=end){
          int mid=(start+end)/2;
          if(arr[mid]==key){
            System.out.println("element found at index : "+mid);
            break;
          }
          else if(arr[mid]>key){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }

    
      }
    public static void main(String[] args) {
        
        
       int array[]={1,2,3,4,5};
       binarySear(array, 4);
        
    }
}
