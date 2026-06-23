package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class jobSequencingPrb {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
        
    }
    public static void main(String[] args) {
        int jobs[][]={
            {4,20},
            {1,10},
            {1,40},
            {1,30}
        };

        ArrayList<Job>arr=new ArrayList<>();
        for(int i=0;i<jobs.length;i++){
            arr.add(new Job(i, jobs[i][0], jobs[i][1]));
        }
        
        Collections.sort(arr,(obj1,obj2)->obj2.profit-obj1.profit); //descending order of profit as b-a;

        int timeConsumed=0;
        
        ArrayList<Integer>seq=new ArrayList<>();



        for(int i=0;i<arr.size();i++){
            Job curr=arr.get(i);
            if(curr.deadline>timeConsumed){
                seq.add(curr.id);
                timeConsumed++;
            }
        }


        System.out.println("max jobs done : "+ seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }System.out.println();

    }
}
