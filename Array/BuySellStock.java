package Array;

public class BuySellStock {
    //method-1 for  problem-1
    static int buySellStock(int prices[]){
        int n=prices.length;
        //buy stock at minimum cost price 
        int buy_price=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buy_price<prices[i]){
                int profit=prices[i]-buy_price;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buy_price=prices[i];
            }
        }
        return maxProfit;

    }
    //method-2  for problem-1
    static int maxProfit(int prices[]){
        int n=prices.length;
        int left[]=new int[n];
        int right[]=new int[n];  
        left[0]=prices[0];
        for(int i=1;i<n;i++){
            left[i]=Math.min(prices[i],left[i-1]);
        }
        right[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(prices[i],right[i+1]);
        }
        int max_profit=0;
        for(int i=0;i<n;i++){
            max_profit=Math.max(max_profit,right[i]-left[i]);
        }
        return max_profit;
    }
    public static void main(String[] args) {
        //problem-1
        //given an array of prices of particular days .index of the array represetn the day of the array
        //here the given array show on first day the prece is 7 and next day price is 1 and so on 
        //you have to find in which day you buy a stock and sell that stock so that you earn maximum profit.
        int prices[]={7,1,5,3,6,4};
        int ans=buySellStock(prices);
        System.out.println(ans);
        int ans_new=maxProfit(prices);
        System.out.println(ans_new);
    }
}
