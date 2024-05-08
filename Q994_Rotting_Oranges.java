import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/rotting-oranges/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q994_Rotting_Oranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int days = 0;

        int fresh = 0;

        Queue<int[]> queue = new LinkedList<>();

        int dx[] = new int[]{-1, 0, 1, 0};
        int dy[] = new int[]{0, 1, 0, -1};

        for (int row = 0; row < m; row++)
            for (int column = 0; column < n; column++) {
                if (grid[row][column] == 1)
                    fresh++;
                else if (grid[row][column] == 2)
                    queue.add(new int[]{row, column});
            }

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            while (size > 0) {
                int pair[] = queue.poll();

                for (int index = 0; index < 4; index++) {
                    int row = pair[0] + dx[index];
                    int column = pair[1] + dy[index];

                    if (row < 0 || row >= m || column < 0 || column >= n || grid[row][column] == 0 || grid[row][column] == 2)
                        continue;

                    grid[row][column] = 2;
                    queue.add(new int[]{row, column});
                    fresh--;
                }
                size--;
            }
            days++;
        }

        return fresh > 0 ? -1 : days;
    }
}
