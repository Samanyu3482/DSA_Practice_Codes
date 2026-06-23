import java.util.*;

public class Hm{
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();


        hm.put("India",100);

        hm.put("China",150);

        hm.put("US",50);

        // System.out.println(hm);


        // int popu=hm.get("India");
        // System.out.println(popu);


        // // int popu1=hm.get("Indonesia");


        // if(hm.containsKey("China")){
        //     System.out.println("China exists");
        // }

        // int p=hm.remove("China");

        // if(hm.containsKey("China")){
        //     System.out.println("China exists");
        // }else{
        //     System.out.println("China not exists");
        // }

        // System.out.println(p);



        Set<String> keys=hm.keySet();

        System.out.println(keys);

        for(String k:keys){
            System.out.println(k+"-"+hm.get(k));
        }
    }
}