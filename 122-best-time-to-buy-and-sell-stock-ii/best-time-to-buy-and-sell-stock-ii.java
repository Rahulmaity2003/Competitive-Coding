class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // To store the total profit
        int len = prices.length;

        for (int i = 1; i < len; i++) {
            // If the current price is higher than the previous day's price, we have profit opportunity
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
