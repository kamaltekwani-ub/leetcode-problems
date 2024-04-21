public class Q130_Surrounded_Regions
{
    public void solve(char[][] board)
    {
        int m = board.length;
        int n = board[0].length;

        for(int column=0 ; column<n ; column++){
            dfs(board, m, n, 0, column);
            dfs(board, m, n, m-1, column);
        }

        for(int row=0 ; row<m ; row++){
            dfs(board, m, n, row, 0);
            dfs(board, m, n, row, n-1);
        }

        for(int row=0 ; row<m ; row++)
            for(int column=0 ; column<n ; column++)
                if(board[row][column] == 'O')
                    board[row][column] = 'X';
                else if(board[row][column] == 'P')
                    board[row][column] ='O';
    }

    private void dfs(char[][] board, int m, int n, int row, int column)
    {
        if(row<0 || row>=m || column<0 || column>=n || board[row][column] != 'O')
            return;

        board[row][column] = 'P';

        dfs(board, m, n, row-1, column);

        dfs(board, m, n, row, column+1);

        dfs(board, m, n, row+1, column);

        dfs(board, m, n, row, column-1);
    }
}
