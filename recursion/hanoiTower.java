package recursion;

public class hanoiTower {
    public static void main(String[] args) {
        towerOfHanoi(64, "S", "H", "D");
    }
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        //base
        if(n==1){
            System.out.println("Transfer disc "+n+" from "+src+" to "+dest+" .");
            return;
        }
        //kaam
        //step 1 n-1 disc ko helper me transfer
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disc "+n+" from "+src+" to "+dest+" .");
        towerOfHanoi(n-1, helper, src, dest);
    }
}
