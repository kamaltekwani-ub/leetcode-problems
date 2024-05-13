import java.util.PriorityQueue;

/*
 * Problem Link : https://leetcode.com/problems/k-closest-points-to-origin/
 * Solution Link : https://leetcode.com/problems/k-closest-points-to-origin/solutions/367136/very-simple-priorityqueue/
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(N)
 */

public class Q973_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>((a, b) -> a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1]);

        for (int point[] : points)
            priorityQueue.add(point);

        int result[][] = new int[k][2];
        int index = 0;

        while (index < k) {
            result[index] = priorityQueue.poll();
            index++;
        }

        return result;
    }
}
