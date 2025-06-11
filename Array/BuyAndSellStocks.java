// You are given an array prices where prices[i] is the price of a given stock on the i th day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock, Return the maximum profit you can achieve from this transaction. if you cannot achieve any profit, return 0
//prices=[7,1,5,3,6,4]
package Array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit= " + BuySellStocks(prices));
    }

    private static int BuySellStocks(int[] prices) {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (BuyPrice > prices[i]) {
                //here buyprice > sell price so here we will buy stock
                BuyPrice = prices[i];
            } else {
                //here buyprice is not > sell price that means buyprice < sell price so here we will sell stock and get profit
                //profit= selling price- buying price
                int profit = prices[i] - BuyPrice;
                MaxProfit = Math.max(profit, MaxProfit);
            }
        }
        return MaxProfit;
    }
}
