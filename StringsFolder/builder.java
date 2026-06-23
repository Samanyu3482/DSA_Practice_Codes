package StringsFolder;
import java.util.*;




public class builder {
    // public static boolean isPalindrome(String chk ){
    //     boolean palin=true;
    //     for(int i=0;i<chk.length();i++){
    //         if(chk.charAt(i)!=chk.charAt(chk.length()-i-1)){
    //             palin=false;
    //             break;
    //         };
    //     }
    //     return palin;
    // }
    // public static int displacement(String direc){
    //     int x=0,y=0;
    //     for(int i=0;i<direc.length();i++){
    //         if(direc.charAt(i)=='N'){
    //             y++;

    //         }
    //         else if(direc.charAt(i)=='S'){
    //             y--;

    //         }
    //         else if(direc.charAt(i)=='W'){
    //             x--;;

    //         }
    //         else{
    //             y++;

    //         }
    //     }
    //     return (int)Math.sqrt((x*x)+(y*y));
    // }
    // public static String Capitalize(String str){
    //     StringBuilder sb= new StringBuilder("");
    //     char ch=Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for(int i=1;i<str.length();i++){
    //         if(str.charAt(i)==' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));

    //         }else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();

    // }
    public static String Compression(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;


            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.println(Capitalize("hi my name is sam and yours ."));
        System.out.println(Compression("abbccccdddde"));

    }
}
