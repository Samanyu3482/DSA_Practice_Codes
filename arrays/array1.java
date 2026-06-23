package arrays;
import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        // arrays syntax:  datatype arrayname[]=new datatype[size]

        // create array
        // int array[]=new int[100];

        // // or
        // int arraynew[]={1,2,3};
        // array[0]=sc.nextInt();
        // array[1]=sc.nextInt();
        // array[2]=sc.nextInt();

        // System.out.println("phy : "+array[0]);
        // System.out.println("chem : "+array[1]);
        // System.out.println("java : "+array[2]);

        //updation
        // array[2]=100;
        // System.out.println("java : "+array[2]);

        // len of array   .length
        // System.out.println(array.length);
        // System.out.println(arraynew.length);


        // int array[]=new int[100];
        // array[0]=1;
        // array[1]=2;
        // array[2]=3;

        //

        // update(array);

        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);
        // here call by reference happened

        // int array[]={1,2,3,4,5,6};
        // int key=4;
        // System.out.println(linearSearch(array, key));

        // int array[]={1,2,3,4,5,6,7,8,9};
        // System.out.println(find_max_in_array(array));

        int a=6;
        int b=5;
        int c= --a + ++b;
        System.out.print(c);



    }
    // public static int find_max_in_array(int arr[]){
    //     int variable=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>variable){
    //             variable=arr[i];
    //         }
    //     }
    //     return variable;
    // }
    // public static int linearSearch(int array[],int searchKey){
        
    //     for(int i=0;i<array.length;i++){
    //         if(array[i]==searchKey){
    //             return i;
    //         }

    //     }
    //     return -1;

    // }
    // public static void update(int array[]){
    //     for(int i=0;i<array.length;i++){
    //         array[i]*=10;
    //     }
}


    
    

