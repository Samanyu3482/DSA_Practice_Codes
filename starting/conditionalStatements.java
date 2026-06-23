import java.util.*;
public class conditionalStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int age=18;
        // age--;
        // if(age>=18){
        //     System.out.println("go");
        // }
        // else{
        //     System.out.println("no");
        // }
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // if(num1>num2){
        //     System.out.println("num1>num2");

        // }
        // else{
        //     System.out.println("num2 is greater");
        // }
        // float num1=sc.nextFloat();
        
        // if(num1>=1000000){
        //     float tax=0.3f*num1;
        //     System.out.println("tax is"+" : "+tax);
        // }
        // else if(num1>=500000 && num1<1000000){
        //     float tax=0.2f*num1;
        //     System.out.println("tax is"+" : "+tax);
        // }
        // else{
            
        //     System.out.println("no tax");
        // }

        //print largest of three numbers
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // int num3=sc.nextInt();

        // if(num1>num2 && num1>num3){
        //     System.out.println("num1 is greatest");
        // }
        // else if(num2>num3 && num2>num1){
        //     System.out.println("num2 is greatest");
        // }
        // else if(num1==num2 || num2==num3 || num3==num1){
        //     System.out.println("greatest cannot be found");
        // }
        // else{
        //     System.out.println("num3 is greatest");
        // }



        // check for pass fail
        // float percent=sc.nextFloat();
        // String result=(percent>=33.0)?"pass":"fail";
        // System.out.println(result);



        // SWITCH 

        // int choice=sc.nextInt();
        // switch (choice) {
        //     case 1: System.out.println("burger");
                
        //         break;
        //     case 2: System.out.println("pizza");
        
        //     default: System.out.println("you are dreaming");
        //         break;
        // }



        // simple calculater
        // System.out.println("enter a : ");

        // int a=sc.nextInt();
        // System.out.println("enter b : ");
        // int b=sc.nextInt();
        // System.out.println("enter operater: ");
        // char oper=sc.next().charAt(0);

        // switch (oper) {
        //     case '+':
        //         System.out.println(a+b);
        //         break;
        //     case '-':
        //         System.out.println(a-b);
        //             break;
        //     case '*':
        //         System.out.println(a*b);
        //             break;
        //     case '/':
        //         System.out.println(a/b);
        //             break;
        
        //     default: System.out.println("not of your type");
        //         break;
        // }




        // homework

        //1
        // System.out.println("enter the number");
        // int num1=sc.nextInt();
        // String result=(num1>=0)?"positive":"negative";
        // System.out.println(result);

        //2
        // double temp=103.2;
        // String fever=(temp>100)?"fever detected":"no fever";
        // System.out.println(fever);


        //3
        // System.out.println("enter the number from 1-7");
        // int num=sc.nextInt();

        // switch (num) {
        //     case 1:
        //         System.out.println("monday");
                
        //             break;
        //     case 2:
        //         System.out.println("tuesday");
                    
        //             break;
        //     case 3:
        //         System.out.println("wednesday");
                        
        //             break;
        //     case 4:
        //         System.out.println("thrusday");
                        
        //             break;
        //     case 5:
        //             System.out.println("friday");
                        
        //                 break;
                        
        //     case 6:
        //                 System.out.println("saturday");
                            
        //                     break;
        //                     case 7:
        //                     System.out.println("sunday");
                                
        //                         break;
        
        //     default:  System.out.println("you entered wrong number");
        //         break;
        // }


        //4
        // x=false
        // y=true

        //5
        // is a leap year
        System.out.println("enter the year");
        int year=sc.nextInt();

        if(year%4!=0){
            System.out.println("not a leap year");
        }
        else if (year%4==0 && year%100!=0){
            System.out.println("leap year");
        }
        else if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }




    }

    
}
