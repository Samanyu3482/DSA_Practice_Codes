import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",70);

        System.out.println(hm);

    }
}
