package arrayList;

import java.util.ArrayList;

public class lonelyArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        lonelyNum(list);
    }

    public static void lonelyNum(ArrayList<Integer> arrl) {
        boolean arr[] = new boolean[arrl.size()];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrl.size(); i++) {
            arr[i] = !(repeat(arrl, i) || xm1(arrl, i) || xp1(arrl, i));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                result.add(arrl.get(i));
            }
        }

        System.out.println(result);
    }

    public static boolean repeat(ArrayList<Integer> arrl, int idx) {
        for (int i = 0; i < arrl.size(); i++) {
            if (i != idx) {
                if (arrl.get(i) == arrl.get(idx)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean xp1(ArrayList<Integer> arrl, int idx) {
        for (int i = 0; i < arrl.size(); i++) {
            if (arrl.get(i) == arrl.get(idx) + 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean xm1(ArrayList<Integer> arrl, int idx) {
        for (int i = 0; i < arrl.size(); i++) {
            if (arrl.get(i) == arrl.get(idx) - 1) {
                return true;
            }
        }
        return false;
    }
}
