package patterns;
import java.util.*;
public class patterns{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

      

        // for(int i=5;i>=1;i--){
        //     for(int j=5;j>=i;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=5;i++){
            for(int x=5;x>i;x--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
