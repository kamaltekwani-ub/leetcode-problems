/*
 * Problem Link : https://leetcode.com/problems/max-area-of-island/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q695_Max_Area_of_Island {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int area = 0;

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                if (grid[i][j] == 1)
                    area = Math.max(area, dfs(grid, row, column, i, j));

        return area;
    }

    private int dfs(int[][] grid, int m, int n, int row, int column) {
        if (row < 0 || row >= m || column < 0 || column >= n || grid[row][column] == 0)
            return 0;

        grid[row][column] = 0;

        return 1 + dfs(grid, m, n, row - 1, column) + dfs(grid, m, n, row, column + 1) +
                dfs(grid, m, n, row + 1, column) + dfs(grid, m, n, row, column - 1);
    }
}
