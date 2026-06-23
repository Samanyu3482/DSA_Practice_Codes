package GreedyAlgorithms;

import java.util.*;

public class indianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,1000,2000};

        Arrays.sort(coins,Comparator.reverseOrder());
        //to sort in descending order coins should be in descending type;
        int countOfCoins=0;
        int amt=592;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amt){
                while(coins[i]<=amt){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amt-=coins[i];

                }
            }
        }

        System.out.println("total mini coins used : "+ countOfCoins);

        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }System.out.println();
    }
}
