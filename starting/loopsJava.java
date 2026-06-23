import java.util.Scanner;

public class loopsJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=0;
        // while(a<5){
        //     System.out.println("score full");
        //     a++;
        // }
        // THERE ARE ALSO INFINITE LOOPS UNTIL CONDITION IS NOT FALSE
        // System.out.println("enter the last range num:");
        // int numbers=sc.nextInt();
        // int strt=1;
        // while(strt<=numbers){
        //     System.out.print(strt+" ");
        //     strt++;
        // }
        // System.out.println("enter the sum calculating range : ");
        // int ran=sc.nextInt();
        // int sum=0;
        // int strt=1;
        // while(strt<=ran){
        //     sum+=strt;
        //     strt++;
        // }
        // System.out.println(sum);
        
        // for(float i=1f;i<=10;i++){
        //     System.out.print(i+", ");
        // }

        // String square="****";
        // for(int i=1;i<=4;i++){
        //     System.out.println(square);
        // }

        //reverse of a number
        
    //    int num=1234;
    //    int rev=0;
    //    while(num>0){
    //     int lastDigit=num%10;
    //     rev=(rev*10)+lastDigit;
    //     num=num/10;
    //    }
    //    System.out.println(rev);

  
    // while(true){
    //     System.out.println("enter:");
    //     int num=sc.nextInt();
        
    //     if (num%10==0){
    //         continue;
    //     }
    //     else{
    //         System.out.println("again");



    //     }

    // }

    // int num=sc.nextInt();
    // boolean isprime=true;
    
    // for(int i=2;i<=Math.sqrt(num);i++){
    //     if(num%i==0){
    //        isprime=false;
    //     }
    // }
    // if(num==2){
    //     System.out.println("prime");
    // }
    // else{
    //     if (isprime){
    //         System.out.println("prime");
    //     }
    //     else{
    //         System.out.println("not prime");
    //     }
    // }

    // System.out.println("enter num1");
    // int num1=sc.nextInt();
    // int i=1;
    // int evenSum=0;
    // int oddSum=0;
    // do{
    //     if (i%2==0){
    //         evenSum+=i;
    //     }
    //     else{
    //         oddSum+=i;
    //     }
    //     i++;
    // }while(i<=num1);

    // System.out.println( evenSum);

    // System.out.println( oddSum);
    // for(int i=0;i<5;i++){
    //     System.out.println("hello");
    //     i+=2;
    // }
    // int evenSum=0;
    // int oddSum=0;

    // for(int i=0;i<=10;i++){
    //     if(i%2==0){
    //         evenSum+=i;

    //     }
    //     else{
    //         oddSum+=i;
    //     }

    // }

    // System.out.println("even sum is:"+ evenSum);
    // System.out.println("odd sum is:"+ oddSum);
        
        // int factorial=sc.nextInt();

        // int result=1;
        // for(int i=factorial;i>=1;i--){
        //     result=result*i;

        // }
        // System.out.println(result);

    // int tableOf=sc.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(tableOf*i);
    // }

    // FIbONACCI 

    int first=0;
    int second=1;
   

    System.out.println("which n th term to be printed.");
    int term=sc.nextInt();
    if(term==0 || term==1){
        System.out.println(term);
    }
    else{
        for(int i=2;i<=term;i++){
        
        
            int result=0;
            int third=first+second;
            first=second;
            second=third;
            result=third;
            System.out.println(result);

    }
   
    }
    
    

    
    
 


    }
}
