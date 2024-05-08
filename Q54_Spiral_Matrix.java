import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/spiral-matrix/
 * Solution Link : https://leetcode.com/problems/spiral-matrix/solutions/20599/super-simple-and-easy-to-understand-solution/
 *
 * Time Complexity : O(N^2)
 * Space Complexity : O(1)
 */

public class Q54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        int d = 0;

        while (top <= bottom && left <= right) {
            if (d == 0) {
                for (int index = left; index <= right; index++)
                    result.add(matrix[top][index]);
                top++;
                d = 1;
            } else if (d == 1) {
                for (int index = top; index <= bottom; index++)
                    result.add(matrix[index][right]);
                right--;
                d = 2;
            } else if (d == 2) {
                for (int index = right; index >= left; index--)
                    result.add(matrix[bottom][index]);
                bottom--;
                d = 3;
            } else if (d == 3) {
                for (int index = bottom; index >= top; index--)
                    result.add(matrix[index][left]);
                left++;
                d = 0;
            }
        }
        return result;
    }
}
