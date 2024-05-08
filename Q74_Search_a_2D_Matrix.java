/*
 * Problem Link : https://leetcode.com/problems/search-a-2d-matrix/
 * Solution Link : https://leetcode.com/problems/search-a-2d-matrix/solutions/26292/java-clear-solution/
 *
 * Time Complexity :
 * Space Complexity : O(1)
 */

public class Q74_Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target)
                return true;
            else if (matrix[row][column] > target)
                column--;
            else
                row++;
        }
        return false;
    }
}
