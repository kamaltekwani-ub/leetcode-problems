import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Problem Link : https://leetcode.com/problems/sliding-window-maximum/
 * Solution Link : https://leetcode.com/problems/sliding-window-maximum/solutions/65884/java-o-n-solution-using-deque-with-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q239_Sliding_Window_Maximum
{
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int result[] = new int[nums.length - k + 1];
        Deque<Integer> deQueue = new ArrayDeque<>();

        int index=0;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(!deQueue.isEmpty() && deQueue.peek() == i - k)
                deQueue.poll();

            while(!deQueue.isEmpty() && nums[deQueue.peekLast()] < nums[i])
                deQueue.pollLast();

            deQueue.add(i);

            if(i >= k-1)
                result[index++] = nums[deQueue.peek()];
        }

        return result;
    }
}
