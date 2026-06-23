package arrayList;

import java.util.ArrayList;

public class pairSumbrute {
    public static void main(String[] args) {
        ArrayList<Integer>arrl=new ArrayList<>();
        for(int i=1;i<=6;i++){
            arrl.add(i);
        }
        System.out.println(pairSumTarget(arrl, 5));
    }
    public static boolean pairSumTarget(ArrayList<Integer>arrl,int target){
        for(int i=0;i<arrl.size();i++){
            int p1=i;
            for(int j=i+1;j<arrl.size();j++){
                int p2=j;
                int psum=arrl.get(p1)+arrl.get(p2);
                if(psum==target){
                    return true;
                }
            }
        }
        return false;
    }
}
