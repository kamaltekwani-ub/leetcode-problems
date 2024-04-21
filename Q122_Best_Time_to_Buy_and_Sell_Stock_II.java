/*
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Solution Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solutions/1569081/java-simple-clean-dp-solutions-for-all-6-buy-sell-stock-questions-on-leetcode/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q122_Best_Time_to_Buy_and_Sell_Stock_II
{
    public int maxProfit(int[] prices){
        int profit = 0;
        for(int index=1 ; index<prices.length ; index++){
            if(prices[index-1] < prices[index])
                profit += prices[index] - prices[index-1];
        }
        return profit;
    }
}
