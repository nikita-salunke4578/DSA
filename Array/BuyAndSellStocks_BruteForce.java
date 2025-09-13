package Array;

public class BuyAndSellStocks_BruteForce {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit= " + BuySellStocks(prices));
    }

    private static int BuySellStocks(int[] prices) {
        int maxProfit = 0, profit;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                profit = prices[j] - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
