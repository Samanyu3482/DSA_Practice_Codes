package arraysPart2;

public class trappingRainwater {

    public static void main(String[] args) {
        
        System.out.println(10>>2);
    }
    
    public static int trapWater(int height[]){

        //left auxillary array cal
        int lAux[]=new int[height.length];
        lAux[0]=height[0];
        for(int i=1;i<height.length;i++){
            
            lAux[i]=Math.max(height[i], lAux[i-1]);
        }
        //right aux array cal
        int rAux[]=new int [height.length];
        rAux[rAux.length-1]=height[height.length-1];
        for(int i=rAux.length-2;i>=0;i--){
            
            rAux[i]=Math.max(height[i], rAux[i+1]);
        }
    
        //loop
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(lAux[i], rAux[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    
    }
}
