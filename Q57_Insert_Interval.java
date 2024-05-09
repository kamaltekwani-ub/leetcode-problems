import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/insert-interval/
 * Solution Link : https://leetcode.com/problems/insert-interval/solutions/21602/short-and-straight-forward-java-solution/
 *
 * Time Complexity :O(N)
 * Space Complexity : O(1)
 */

public class Q57_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        int index = 0;

        while (index < intervals.length && intervals[index][1] < newInterval[0])
            list.add(intervals[index++]);

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval = new int[]{Math.min(intervals[index][0], newInterval[0]), Math.max(intervals[index][1], newInterval[1])};
            index++;
        }

        list.add(newInterval);

        while (index < intervals.length)
            list.add(intervals[index++]);

        return list.toArray(new int[0][]);
    }
}
