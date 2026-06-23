package arraysPart2;

public class stocksProfit {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int sellingPrice=prices[i];
            if(buyPrice<sellingPrice){
                int profit=sellingPrice-buyPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
            else{
                buyPrice=sellingPrice;
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,6,5,4,3,2,1};
        System.out.println("max profit that can be earned is : "+buyAndSellStocks(prices));

        
    }
    
}
