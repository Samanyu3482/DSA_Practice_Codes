package patterns;
import java.util.*;
public class butterfly {
    public static void butterfly(int rows){
        // outer loop 1st half
        for(int i=1;i<=rows;i++){
            // inner 1 stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int x=1;x<=(2*(rows-i));x++){
                System.out.print("  ");

            }
            // inner stars 2
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();}
        // outer second half
        for(int p=rows;p>=1;p--){
            // inner 1 stars
            for(int j=1;j<=p;j++){
                System.out.print("* ");
            }
            //spaces
            for(int x=1;x<=(2*(rows-p));x++){
                System.out.print("  ");

            }
            // inner stars 2
            for(int j=1;j<=p;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("plz enter number of rows for butterfly pattern: ");
        int rows=sc.nextInt();
        butterfly(rows);
        
    }
    
}
