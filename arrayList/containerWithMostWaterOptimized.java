package arrayList;

import java.util.ArrayList;

public class containerWithMostWaterOptimized {
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxWater(height));
    }
    public static int maxWater(ArrayList<Integer>arrl){
        //2 pointer approach
        int mw=0;
        int lp=0;
        int rp=arrl.size()-1;
        while(lp<rp){
            int height=Math.min(arrl.get(rp),arrl.get(lp));
            int width=rp-lp;
            int cw=height*width;
            mw=Math.max(mw, cw);

            if(arrl.get(lp)<arrl.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return mw;
    }
}
