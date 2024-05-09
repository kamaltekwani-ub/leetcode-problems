import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Problem Link : https://leetcode.com/problems/top-k-frequent-elements/description/
 * Solution Link : https://leetcode.com/problems/top-k-frequent-elements/solutions/350472/easy-simple-java-solution-for-interviews-heap-hashmap/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(N)
 */

public class Q347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int value : nums)
            map.put(value, map.getOrDefault(value, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            priorityQueue.offer(entry);

        int result[] = new int[k];
        int index = 0;

        while (index < k) {
            Map.Entry<Integer, Integer> entry = priorityQueue.poll();
            result[index++] = entry.getKey();
        }

        return result;
    }
}
