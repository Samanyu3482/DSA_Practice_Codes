package arrayList;

import java.util.ArrayList;

public class rotatedSortedPairSum {
    public static void main(String[] args) {
        ArrayList<Integer>arrl=new ArrayList<>();
        arrl.add(11);
        arrl.add(15);
        arrl.add(6);
        arrl.add(8);
        arrl.add(9);
        arrl.add(10);//sorted and rotated

        System.out.println(pairSum(arrl, 16));

    }
    public static boolean pairSum(ArrayList<Integer>arrl,int target){
        int bp=-1;
        for(int i=0;i<arrl.size()-1;i++){//-1 ensures that i do not go out of bounds
            if(arrl.get(i)>arrl.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        int n=arrl.size();
        while(lp!=rp){
            if(arrl.get(rp)+arrl.get(lp)==target){
                return true;
            }else if(arrl.get(lp)+arrl.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
}
