package Arrays_And_Strings;

/**
 * You are given an array prices where prices[i] represents the price of a stock on day i.
 *
 * You must choose one day to buy and a later day to sell in order to maximize profit.
 *
 * Return the maximum profit possible. If no profit can be made, return 0.
 *
 * -----------------------------------------------------------
 * Example 1:
 * Input:  prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation:
 *     Buy at price = 1 (day 2)
 *     Sell at price = 6 (day 5)
 *     Profit = 6 - 1 = 5
 *
 * Example 2:
 * Input:  prices = [7,6,4,3,1]
 * Output: 0
 * Explanation:
 *     No future price is higher than the current price,
 *     so no profitable transaction is possible.
 * -----------------------------------------------------------
 */


public class MaxProfit {

    static void main() {
        int[] prices = {7,1,5,3,6,4};
       int maxProf = maxProfit(prices);
       System.out.println(maxProf);
    }

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update min price if current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate potential profit and update max profit
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

}
