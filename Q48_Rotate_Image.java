
// Problem Link : https://leetcode.com/problems/rotate-image/
// Solution Link : https://leetcode.com/problems/rotate-image/solutions/18879/ac-java-in-place-solution-with-explanation-easy-to-understand/

public class Q48_Rotate_Image
{
    /*
     * Time Complexity : O(N^2)
     * Space Complexity : O(1)
     */

    public void transpose(int matrix[][])
    {
        for(int row=0 ;  row<matrix.length ; row++)
            for(int column=0 ; column<row ; column++)
            {
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
    }

    public void reverse(int matrix[][])
    {
        for(int row=0 ;  row<matrix.length ; row++)
        {
            int left = 0;
            int right = matrix[0].length-1;

            while(left < right)
            {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    public void rotate(int[][] matrix)
    {
        transpose(matrix);
        reverse(matrix);
    }
}
