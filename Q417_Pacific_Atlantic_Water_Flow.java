import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/pacific-atlantic-water-flow/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q417_Pacific_Atlantic_Water_Flow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        int m = heights.length;
        int n = heights[0].length;

        boolean pacific[][] = new boolean[m][n];
        boolean atlantic[][] = new boolean[m][n];

        for (int column = 0; column < n; column++) {
            dfs(heights, m, n, 0, column, pacific, Integer.MIN_VALUE);
            dfs(heights, m, n, m - 1, column, atlantic, Integer.MIN_VALUE);
        }

        for (int row = 0; row < m; row++) {
            dfs(heights, m, n, row, 0, pacific, Integer.MIN_VALUE);
            dfs(heights, m, n, row, n - 1, atlantic, Integer.MIN_VALUE);
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pacific[i][j] && atlantic[i][j])
                    result.add(Arrays.asList(i, j));

        return result;
    }

    private void dfs(int[][] heights, int m, int n, int row, int column, boolean[][] ocean, int previous) {
        if (row < 0 || row >= m || column < 0 || column >= n)
            return;

        if (heights[row][column] < previous || ocean[row][column])
            return;

        ocean[row][column] = true;

        dfs(heights, m, n, row - 1, column, ocean, heights[row][column]);

        dfs(heights, m, n, row + 1, column, ocean, heights[row][column]);

        dfs(heights, m, n, row, column - 1, ocean, heights[row][column]);

        dfs(heights, m, n, row, column + 1, ocean, heights[row][column]);
    }
}

