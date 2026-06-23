import java.util.*;
public class functionsAndMethods{
    
    // public static int binomialCoefficient(int n,int r){
        
    //     int facN=1;
        
       
    //     for(int i=n;i>=1;i--){
    //         facN=facN*i;
    //     }
    //     int facR=1;
    //     for(int i=r;i>=1;i--){
    //         facR=facR*i;
    //     }
    //     int facN_R=1;
    //     for(int i=(n-r);i>=1;i--){
    //         facN_R=facN_R*i;
    //     }
    //     int numerator=facN;
       
    //     int denominator=facN_R*facR;
       
    //     int result=numerator/denominator;
    //     return result;
        
    // }
    // public static void avgNum(int a , int b , int c){
    //     float avg=(a+b+c)/3.0f;
    //     System.out.println("avg is : "+ avg);
    // }

    // public static boolean isEven(int a){
    //     boolean even=true;
    //     if(a%2!=0){
    //         even=false;

    //     }
    //     return even;
    // }
    // public static boolean isPalindrome(int number){
    //     boolean palindrome=true;
    //     int num=number;
    //     int reverse=0;
    //     do{
    //         int remainder=num%10;
    //         reverse=reverse*10+remainder;
    //         num=num/10;
    //     }while(num!=0);
    //     if(reverse!=number){
    //         palindrome=false;

    //     }
    //     return palindrome;
       


    // }
    public static void sumOfdigit(int number){
        int num=number;
        int sums=0;
        do{
            int lastDigit=num%10;
            sums+=lastDigit;
            num=num/10;
        }while(num!=0);
        System.out.println(sums);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // avgNum(2, 3, 5);
        
        // System.out.println(isEven(3));

        // System.out.println(isPalindrome(122221));

        // System.out.println(Math.abs(-1.33));
        sumOfdigit(111);
    }
}