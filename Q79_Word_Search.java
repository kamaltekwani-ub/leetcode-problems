/*
 * Problem Link : https://leetcode.com/problems/word-search/
 * Solution Link : https://leetcode.com/problems/word-search/solutions/27811/my-java-solution/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q79_Word_Search
{
    public boolean dfs(char board[][], int m, int n, int row, int column, String word, int index){
        if(index == word.length())
            return true;

        if(row<0 || row>=m || column<0 || column>=n || word.charAt(index) != board[row][column])
            return false;

        char temp = board[row][column];

        board[row][column] = '*';

        boolean found = dfs(board, m, n, row-1, column, word, index+1) ||
                dfs(board, m, n, row, column+1, word, index+1) ||
                dfs(board, m, n, row+1, column, word, index+1) ||
                dfs(board, m, n, row, column-1, word, index+1);

        board[row][column] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word)
    {
        int m = board.length;
        int n = board[0].length;

        for(int row=0 ; row<m ; row++)
            for(int column=0 ; column<n ; column++)
                if(word.charAt(0) == board[row][column] && dfs(board, m, n, row, column, word, 0))
                    return true;

        return false;
    }
}
