/*
 * Problem Link : https://leetcode.com/problems/set-matrix-zeroes/
 * Solution Link : https://leetcode.com/problems/set-matrix-zeroes/solutions/3472518/full-explanation-super-easy-constant-space/
 *
 * Time Complexity : O(M * N)
 * Space Complexity : O(1)
 */

public class Q73_Set_Matrix_Zeroes
{
    public void setZeroes(int[][] matrix)
    {
        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        for(int i=0 ; i<matrix.length ; i++)
            for(int j=0 ; j<matrix[0].length ; j++)
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0)
                        isFirstRowZero = true;

                    if(j == 0)
                        isFirstColumnZero = true;
                }

        for(int i=1 ; i<matrix.length ; i++)
            for(int j=1 ; j<matrix[0].length ; j++)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        if(isFirstRowZero)
            for(int column=0 ; column<matrix[0].length ; column++)
                matrix[0][column] = 0;

        if(isFirstColumnZero)
            for(int row=0 ; row<matrix.length ; row++)
                matrix[row][0] = 0;
    }
}
