package arrayList;
import java.util.*;
public class introArrList {
    public static void main(String[] args) {
        // ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();
        // ArrayList<Boolean> list3=new ArrayList<>();
        // ArrayList<Float> list4=new ArrayList<>();


        // //operations on arrayList

        // // .add()
        // list.add(5);
        // list.add(3);
        // list.add(2);
        // list.add(1);
        // list.add(0, 0);
        // System.out.println(list);

        // // .get()
        // System.out.println(list.get(3));

        // // .remove()
        // list.remove(2);
        // System.out.println(list);

        // // .set(idx,new_val)
        // list.set(0, 10);
        // System.out.println(list);

        // // .contains()
        // System.out.println(list.contains(10));

        // // .size() method
        // System.out.println(list2.size());

        // inbuilt sorting
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(14);
        // list.add(12);
        // list.add(11);
        // list.add(10);
        // list.add(2);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        //multidimentional arrayList

        ArrayList<ArrayList<Integer>> main=new ArrayList<>();

        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);

        main.add(list);
        ArrayList<Integer>list2=new ArrayList<>();

        for(int i=7;i<12;i++){
            list2.add(i-1);

        }
        main.add(list2);
        System.out.println(main);

        for(int i=0;i<main.size();i++){
            for(int j=0;j<main.get(i).size();j++){
                System.out.print(main.get(i).get(j)+" ");
            }System.out.println();
        }

        


    }
}
