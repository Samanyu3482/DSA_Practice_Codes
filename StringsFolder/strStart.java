package StringsFolder;
import java.util.*;


public class strStart {
   
    // public static boolean isPalindrome(String str){
    //     boolean result=true;
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i)!=str.charAt(str.length()-i-1)){
    //             result=false;
    //             break;
    //         }
    //     }
    //     return result;

        

    // }
    public static int shortestPath(String str){
        int x=0,y=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='n'){
                y++;
            }
            else if(str.charAt(i)=='s'){
                y--;
            }
            else if(str.charAt(i)=='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int r1=(int)Math.pow(x, 2);
        int r2=(int)Math.pow(y, 2);
        int re=r1+r2;
        int result=(int)Math.pow(re, 0.5);
        return result;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // // String age=(sc.next());
        // // System.out.println(age);
        // prtLetter(name);


        // concatination
        // String fstName=sc.next();
        // String lstname=sc.next();
        // String fullName=fstName+" "+lstname;

        // for(int i=0;i<fullName.length();i++){
        //     System.out.print(fullName.charAt(i)+"__");
        // }
        // String var="racecar";
        // System.out.println(isPalindrome(var));

        // String str="WNEENESENNN";
        // System.out.println(shortestPath(str));


        // int arr[]={0,1,2};
        // int array[]=new int[3];
        // for(int i=0;i<array.length;i++){
        //     array[i]=i;
        // }
        // System.out.println(arr==array);
        // System.out.println(Arrays.equals(arr, array));

        // String arr[]={"apple","pine","Appla","Pine"};
        // String largest=arr[0];
        // String largest1=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(largest.compareToIgnoreCase(arr[i])<0){
        //         largest=arr[i];
        //     }
        //     if(largest1.compareTo(arr[i])<0){
        //         largest1=arr[i];
        //     }
        // }
        // System.out.println(largest);
        // System.out.println(largest1);
    }
}
