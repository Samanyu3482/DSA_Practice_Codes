package GreedyAlgorithms;
import java.util.*;
public class activitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};


        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }


        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));





        int maxAct=0;
        ArrayList<Integer>arr=new ArrayList<>();


        arr.add(activities[0][0]);
        maxAct++;
        int lastEnd=activities[0][2];

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //select activity
                maxAct++;
                lastEnd=activities[i][2];
                arr.add(activities[i][0]);
            }
        }

        System.out.println("maximum acticities = "+ maxAct );
        for(int i=0;i<arr.size();i++){
            System.out.print("A"+arr.get(i)+" ");
        }System.out.println();
    }
}
