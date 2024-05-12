import java.util.Arrays;

/*
 * Problem Link : // https://leetcode.com/problems/non-overlapping-intervals/
 * Solution Link : https://leetcode.com/problems/non-overlapping-intervals/solutions/3785409/beat-s-100-c-java-python-beginner-friendly/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(1)
 */

public class Q435_Non_overlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int previous = 0;
        int count = 1;

        for (int index = 1; index < intervals.length; index++) {
            if (intervals[index][0] >= intervals[previous][1]) {
                previous = index;
                count++;
            }
        }

        return intervals.length - count;
    }
}
