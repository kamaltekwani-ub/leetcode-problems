/*
 * Problem Link : https://leetcode.com/problems/number-of-islands/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q200_Number_of_Islands {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int island = 0;

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, row, column);
                    island++;
                }

        return island;
    }

    public void dfs(char grid[][], int row, int column, int m, int n) {
        if (row < 0 || row >= m || column < 0 || column >= n || grid[row][column] == '0')
            return;

        grid[row][column] = '0';

        dfs(grid, row - 1, column, m, n);

        dfs(grid, row, column + 1, m, n);

        dfs(grid, row + 1, column, m, n);

        dfs(grid, row, column - 1, m, n);
    }
}
