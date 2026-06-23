package arrayList;
import java.util.*;
public class containerWithMostWaterBrute {
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
        int maxWater=0;
        for(int i=0;i<arrl.size();i++){
            int idx1=i;
            for(int j=i+1;j<arrl.size();j++){
                int idx2=j;
                int width=idx2-idx1;
                int height=Math.min(arrl.get(idx1), arrl.get(idx2));
                int wt=height*width;
                maxWater=wt>maxWater ? wt:maxWater;
            }
        }
        return maxWater;
    }
}
