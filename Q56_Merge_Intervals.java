import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Problem Link : https://leetcode.com/problems/merge-intervals/
 * Solution Link : https://leetcode.com/problems/merge-intervals/solutions/1644169/java-simple-steps-explained-simple-sort/
 *
 * Time Complexity : O(nlogn)
 * Space Complexity : O(1
 */
public class Q56_Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> intervalList = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        int index = 0;

        for (int interval[] : intervals) {
            if (end < interval[0]) {
                intervalList.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            } else
                end = Math.max(end, interval[1]);
        }
        intervalList.add(new int[]{start, end});

        return intervalList.toArray(new int[0][]);
    }
}
