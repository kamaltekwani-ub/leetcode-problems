
import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 * Solution Link : https://leetcode.com/problems/find-the-winner-of-the-circular-game/solutions/1157717/java-full-solution-and-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q1823_Find_the_Winner_of_the_Circular_Game {

    /*
     * Time Complexity : O(N)
     * Space Complexity : O(1)
     */

    /*
    public int findTheWinner(int n, int k)
    {
        int result = 0;
        for(int index=1 ; index<=n ; index++)
            result = (result + k) % index;

        return result + 1;
    }
    */

    /*
     * Time Complexity : O(k * N)
     * Space Complexity : O(1)
     */

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int index=1 ; index<=n ; index++)
            queue.add(index);

        while(queue.size() != 1){
            for(int index=1 ; index<=k-1 ; index++)
                queue.add(queue.poll());
            queue.poll();
        }
        return queue.poll();
    }
}
