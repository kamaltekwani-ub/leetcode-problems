import java.util.PriorityQueue;

/*
 * Problem Link : https://leetcode.com/problems/hand-of-straights/description/
 * Solution Link : https://leetcode.com/problems/hand-of-straights/solutions/3765361/simple-and-well-explained-java-code-using-priorityqueue-min-heap-with-intuition-approach-and-code/
 *
 * Time Complexity :  O(N * W * log N), where N is the number of cards in the hand array and W is the group size
 * Space Complexity : O(N)
 */

public class Q846_Hand_of_Straights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        for (int value : hand)
            priorityQueue.add(value);

        while (!priorityQueue.isEmpty()) {
            int smallest = priorityQueue.poll();

            for (int i = 1; i < groupSize; i++)
                if (!priorityQueue.remove(smallest + i))
                    return false;
        }

        return true;
    }
}
