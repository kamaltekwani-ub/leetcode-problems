import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/walls-and-gates/
 * Solution Link : https://leetcode.com/problems/walls-and-gates/solutions/72745/java-bfs-solution-o-mn-time/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q286_Walls_and_Gates
{
    public void wallsAndGates(int[][] rooms)
    {
        int m = rooms.length;
        int n = rooms[0].length;

        Queue<int []> queue = new LinkedList<>();

        for(int row=0 ; row<m ; row++)
            for(int column=0 ; column<n ; column++)
                if(rooms[row][column] == 0)
                    queue.add(new int[]{row, column});

        while(!queue.isEmpty()){
            int pair[] = queue.poll();

            int row = pair[0];
            int column = pair[1];

            if(row>0 && rooms[row-1][column] == Integer.MAX_VALUE)
            {
                rooms[row-1][column] = rooms[row][column]+1;
                queue.add(new int[]{row-1, column});
            }

            if(column<n-1 && rooms[row][column+1] == Integer.MAX_VALUE){
                rooms[row][column+1] = rooms[row][column] + 1;
                queue.add(new int[]{row, column+1});
            }

            if(row<m-1 && rooms[row+1][column] == Integer.MAX_VALUE){
                rooms[row+1][column] = rooms[row][column] + 1;
                queue.add(new int[]{row+1, column});
            }

            if(column>0 && rooms[row][column-1] == Integer.MAX_VALUE){
                rooms[row][column-1] = rooms[row][column] + 1;
                queue.add(new int[]{row, column-1});
            }
        }
    }
}
