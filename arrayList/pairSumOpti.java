package arrayList;

import java.util.ArrayList;

public class pairSumOpti {
    public static void main(String[] args) {
         ArrayList<Integer>arrl=new ArrayList<>();
        for(int i=1;i<=6;i++){
            arrl.add(i);
        }
        System.out.println(pairSumTarget(arrl, 5));
    }
    public static boolean pairSumTarget(ArrayList<Integer>arrl,int target){
        int lp=0;
        int rp=arrl.size()-1;
        while(lp!=rp){
            if(arrl.get(rp)+arrl.get(lp)==target){
                return true;
            }else if(arrl.get(rp)+arrl.get(lp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
}
