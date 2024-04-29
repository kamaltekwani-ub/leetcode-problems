import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/coin-change/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q322_Coin_Change
{
    public int coinChange(int[] coins, int amount){
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for(int coin : coins){
            for(int index=coin ; index<=amount ; index++)
                dp[index] = Math.min(dp[index], 1 + dp[index-coin]);
        }

        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}
