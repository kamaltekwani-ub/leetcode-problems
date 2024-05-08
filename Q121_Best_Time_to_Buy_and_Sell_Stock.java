/*
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buy = prices[0];

        for (int price : prices) {
            profit = Math.max(profit, price - buy);
            buy = Math.min(buy, price);
        }

        return profit;
    }
}
