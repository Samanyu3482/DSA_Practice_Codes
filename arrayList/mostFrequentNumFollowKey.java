package arrayList;

import java.util.ArrayList;

public class mostFrequentNumFollowKey {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(Fre(list, 2));
    }
    // O(n^2)TC
// public static int mostFrequent(ArrayList<Integer>arrl,int key){
//     ArrayList<Integer>num=new ArrayList<>();
//     ArrayList<Integer>numCount=new ArrayList<>();

//     for(int i=0;i<=arrl.size()-2;i++){
//         if(arrl.get(i)==key){
//             if(num.contains(arrl.get(i+1))){
//                 int idx=num.indexOf(arrl.get(i+1));
//                 numCount.set(idx, numCount.get(idx)+1);
//             }else{
//                 num.add(arrl.get(i+1));
//                 numCount.add(1);
//             }
//         }
//     }

//     int maxFre=0;
//     for(int i=0;i<numCount.size();i++){
//         maxFre=Math.max(maxFre, numCount.get(i));
//     }
//     int maxFreIdx=numCount.indexOf(maxFre);
//     return num.get(maxFreIdx);
// }



//O(n) TC code
public static int Fre(ArrayList<Integer>arrl,int key){

    int result[]=new int [1000];
    for(int i=0;i<=arrl.size()-2;i++){
        if(arrl.get(i)==key){
            result[arrl.get(i+1)-1]++;
        }
    }

    int max=Integer.MIN_VALUE;
    int ans=-1;
    for(int i=0;i<result.length;i++){
        if(result[i]>max){
            max=result[i];
            ans=i+1;
        }
    }
    return ans;
}

}
