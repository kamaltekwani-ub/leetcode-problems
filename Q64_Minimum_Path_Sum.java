/*
 * Problem Link : https://leetcode.com/problems/minimum-path-sum/description/
 * Solution Link : https://leetcode.com/problems/minimum-path-sum/solutions/3345656/python-java-c-simple-solution-easy-to-understand/
 *
 * Time Complexity : O(M * N)
 * Space Complexity : O(1)
 */

public class Q64_Minimum_Path_Sum
{
    /*
     * Time Complexity : O(M * N)
     * Space Complexity : O(M * N)
     */

    /*
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];

        dp[0][0] = grid[0][0];

        for(int column=1 ; column<n ; column++)
            dp[0][column] = grid[0][column] + dp[0][column-1];

        for(int row=1 ; row<m ; row++)
            dp[row][0] = grid[row][0] + dp[row-1][0];

        for(int row=1 ; row<m ; row++){
            for(int column=1 ; column<n ; column++){
                dp[row][column] = grid[row][column] + Math.min(dp[row-1][column], dp[row][column-1]);
            }
        }

        return dp[m-1][n-1];
    }
    */

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }

        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
