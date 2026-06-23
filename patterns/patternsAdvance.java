package patterns;
import java.util.*;
public class patternsAdvance {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // hollow rectangle
        int rows=sc.nextInt();
        // inverted_half_pyramid(rows);
        
        // inverted_rotated_half_pyramid(rows);
        // floyd_triangle(rows);
        // triangle0_1(rows);

        // hollow_rhombus(rows);
        // rhombus(rows);
        diamond(rows);

    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int x=1;x<=n-i;x++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int x=1;x<=n-i;x++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // public static void hollow_rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         //space
    //         for(int x=1;x<=n-i;x++){
    //             System.out.print(" ");
    //         }
    //         //inner
    //         for(int j=1;j<=n;j++){
    //             if(i==1 || i==n){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 if(j==1 || j==n){
    //                     System.out.print("*");
    //                 }
    //                 else{
    //                     System.out.print(" ");
    //                 }
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int x=1;x<=n;x++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void triangle0_1(int rows){
    //     //outer
    //     for(int i=1;i<=rows;i++){
    //         //odd row
    //         if(i%2!=0){
    //             for(int j=1;j<=i;j++){
    //                 if(j%2!=0){
    //                     System.out.print(1+" ");
    //                 }
    //                 else{
    //                     System.out.print(0+" ");
    //                 }
    //             }
    //             System.out.println();
    //         }
    //         else{
    //             for(int j=1;j<=i;j++){
    //                 if(j%2!=0){
    //                     System.out.print(0+" ");
    //                 }
    //                 else{
    //                     System.out.print(1+" ");
    //                 }

    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    // public static void floyd_triangle(int rows){
    //     //counter
    //     int counter=1;
    //     //outer
    //     for(int i=1;i<=rows;i++){
    //         //print
    //         for(int j=1;j<=i;j++){
    //             System.out.print(counter);
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void inverted_half_pyramid(int rows){
    //     //outer
    //     for(int i=rows;i>=1;i--){
    //         //inner print
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");

    //         }
    //         System.out.println();

    //     }
    // }
    // public static void inverted_rotated_half_pyramid(int rows){
    //     //outer
    //     for(int i=1;i<=rows;i++){
    //         //space
    //         for(int x=rows;x>i;x--){
    //             System.out.print("_ ");
    //         }
    //         //print
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         //line change
    //         System.out.println();

    //     }
        
    // }
    // public static void hollowRec(int rows, int col){
    //     for(int i=1;i<=rows;i++){
    //         for(int j=1;j<=col;j++){
    //             if(i==1 || i==rows || j==1 || j==col){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();

    //     }
    
    
}
