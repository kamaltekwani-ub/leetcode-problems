import java.util.HashSet;
import java.util.Set;

/*
 * Problem Link : https://leetcode.com/problems/valid-sudoku/
 * Solution Link : https://leetcode.com/problems/valid-sudoku/solutions/15472/short-simple-java-using-strings
 *
 * Time Complexity : O(N^2)
 * Space Complexity : O(N)
 */

public class Q36_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < board.length; row++)
            for (int column = 0; column < board.length; column++)
                if (board[row][column] != '.') {
                    String value = "(" + board[row][column] + ")";
                    if (!set.add(row + value) || !set.add(value + column) || !set.add((row / 3) + value + (column / 3)))
                        return false;
                }

        return true;
    }
}
