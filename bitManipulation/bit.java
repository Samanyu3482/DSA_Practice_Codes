package bitManipulation;
import java.util.*;
public class bit {
    // public static boolean isEven(int num){
    //     boolean result=true;
    //     int bitmask=num&1;
    //     if(bitmask==1){
    //         result=false;
    //     }
    //     return result;
    // }


    // public static int getIthBit(int num,int i){
    //     int bitmask=1<<i;
    //     if((num&bitmask)==0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }

    // public static int setIthBit(int num,int i){
    //     int bitmask=1<<i;
    //     return num|bitmask;
    // }
    // public static int clearIthBit(int num,int i){
    //     int bitmask=~(1<<i);
    //     return num&bitmask;
    // }

    // public static int updateIthBit(int num,int i,int newBit){
    //     // if(newBit==0){
    //     //     return clearIthBit(num, i);
    //     // }else{
    //     //     return setIthBit(num, i);
    //     // }

    //     // method 2
    //     // int bitmask=newBit<<i;
    //     // return bitmask|num;
    // }
    public static int clearbitRan(int num,int i){
        int bitmask=((-1)<<i);
        return num&bitmask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // & and operater

        // System.out.println(1&0);
        // System.out.println(1&1);
        // System.out.println(0&1);// here 1 and 0 are decimal  do not think as binary
        // System.out.println(0&0);
        // System.out.println(11&23);


        // | or 
        // System.out.println(2|3);


        // ~  one's complement
        // System.out.println(~1);//-2

        // XOR ^
        // System.out.println(1^1);

        // binary left shift <<
        // binary right shift


        // System.out.println(isEven(22));

        System.out.println(clearbitRan(15, 2));

    }
}
