import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/jump-game-iii/
 * Solution Link : https://www.youtube.com/watch?v=7Cz91Uj0VCU
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */
public class Q1306_Jump_Game_III
{
    // BFS Solution

    /*
    public boolean canReach(int[] arr, int start){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size > 0){
                int index = queue.poll();

                if(index - arr[index] >= 0)
                {
                    if(arr[index - arr[index]] == 0)
                        return true;
                    else if(arr[index - arr[index]] > 0)
                        queue.offer(index - arr[index]);
                }


                if(index + arr[index] < arr.length){
                    if(arr[index + arr[index]] == 0)
                        return true;
                    else if(arr[index + arr[index]] > 0)
                        queue.offer(index + arr[index]);
                }

                arr[index] = -1;

                size--;
            }
        }

        return false;
    }
    */

    // DFS Solution

    public boolean canReach(int[] arr, int start){
        if(start < 0 || start >= arr.length || arr[start]<0)
            return false;

        if(arr[start] == 0)
            return true;

        arr[start] = -arr[start];

        boolean a = canReach(arr, start - arr[start]);
        boolean b = canReach(arr, start + arr[start]);

        arr[start] = - arr[start];

        return a || b;
    }
}
