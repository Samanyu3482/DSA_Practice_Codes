package Queue;
import java.util.*;

public class generateBinary {
    public static int deciToBin(int num){

        int bin=0;
        int place=1;
        while(num!=0){
            int ls=num%2;
            bin=bin+ls*place;
            num/=2;
            place*=10;
    
        }
        return bin;
    }
    public static void genBin(int N){
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=N;i++){
            q.add(deciToBin(i));
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }System.out.println();

    }
    public static void main(String[] args) {
        genBin(5);
        
    }
}
