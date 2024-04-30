import java.util.*;

/*
 * Problem Link : https://leetcode.com/problems/high-five/
 * Solution Link : https://leetcode.com/problems/high-five/solutions/600792/easy-java-solution-using-hashmap-time-complexity-o-n-log-n/
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(n)
 */

public class Q1086_High_Five
{
    public int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int index = 0; index < items.length; index++) {
            if (!map.containsKey(items[index][0]))
                map.put(items[index][0], new ArrayList<>());
            map.get(items[index][0]).add(items[index][1]);
        }

        int result[][] = new int[map.size()][2];
        int i = 0;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Collections.sort(list, Collections.reverseOrder());
            int sum = 0;
            int k = entry.getValue().size() < 5 ? entry.getValue().size() : 5;

            for (int index = 0; index < 5; index++) {
                sum += list.get(index);
            }

            int average = sum / k;
            result[i][0] = entry.getKey();
            result[i][1] = average;
            i++;
        }

        return result;
    }
}
