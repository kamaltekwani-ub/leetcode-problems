/*
 * Problem Link : https://leetcode.com/problems/longest-common-subsequence/
 * Solution Link : https://leetcode.com/problems/longest-common-subsequence/solutions/351689/java-python-3-two-dp-codes-of-o-mn-o-min-m-n-spaces-w-picture-and-analysis/
 *
 * Time Complexity : O(M * N)
 * Space Complexity : O(M * N)
 */

public class Q1143_Longest_Common_Subsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int row = 1; row <= m; row++)
            for (int column = 1; column <= n; column++)
                if (text1.charAt(row - 1) == text2.charAt(column - 1))
                    dp[row][column] = 1 + dp[row - 1][column - 1];
                else
                    dp[row][column] = Math.max(dp[row - 1][column], dp[row][column - 1]);

        return dp[m][n];
    }
}
