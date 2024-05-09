/*
 * Problem Link : https://leetcode.com/problems/game-of-life/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q289_Game_of_Life {
    public void gameOfLife(int[][] board) {
        int result[][] = new int[board.length][board[0].length];

        int dx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
        int dy[] = {-1, 0, 1, 1, 1, 0, -1, -1};


        for (int row = 0; row < board.length; row++)
            for (int column = 0; column < board[0].length; column++) {
                int count = 0;
                for (int index = 0; index < 8; index++) {
                    int newRow = row + dx[index];
                    int newColumn = column + dy[index];

                    if (newRow >= 0 && newRow < board.length && newColumn >= 0 && newColumn < board[0].length && board[newRow][newColumn] == 1)
                        count++;
                }

                if (board[row][column] == 0) {
                    if (count == 3)
                        result[row][column] = 1;
                } else if (board[row][column] == 1) {
                    if (count == 2 || count == 3)
                        result[row][column] = 1;
                }
            }

        for (int row = 0; row < board.length; row++)
            for (int column = 0; column < board[0].length; column++)
                board[row][column] = result[row][column];
    }
}
