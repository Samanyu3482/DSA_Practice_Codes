package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class KthLargestOddNumInRange {
    public static void main(String[] args) {
        int l=-3,r=3,k=1;
        ArrayList<Integer>arrl=new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(i%2!=0){
            arrl.add(i);
            }
        }
        Collections.sort(arrl,Comparator.reverseOrder());
        if(k>arrl.size()){
            System.out.println(0);
        }else{
            System.out.println(arrl.get(k-1));
        }


    }
}
