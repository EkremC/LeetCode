package Algorithms.Easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class _121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }
}
