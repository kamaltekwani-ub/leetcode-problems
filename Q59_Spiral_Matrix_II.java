/*
 * Problem Link : https://leetcode.com/problems/spiral-matrix-ii/
 * Solution Link : https://leetcode.com/problems/spiral-matrix-ii/solutions/22292/share-my-java-solution/
 *
 * Time Complexity : O(N ^ 2)
 * Space Complexity : O(1)
 */

public class Q59_Spiral_Matrix_II
{
    public int[][] generateMatrix(int n)
    {
        int[][] result = new int[n][n];

        int left = 0;
        int top = 0;
        int right = n-1;
        int down = n-1;

        int count = 1;

        while (left <= right)
        {
            for (int j = left; j <= right; j ++) {
                result[top][j] = count++;
            }
            top ++;
            for (int i = top; i <= down; i ++) {
                result[i][right] = count ++;
            }
            right --;
            for (int j = right; j >= left; j --) {
                result[down][j] = count ++;
            }
            down --;
            for (int i = down; i >= top; i --) {
                result[i][left] = count ++;
            }
            left ++;
        }
        return result;
    }
}
