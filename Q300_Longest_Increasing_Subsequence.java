import java.util.TreeSet;

/*
 * Problem Link : https://leetcode.com/problems/longest-increasing-subsequence/
 * Solution Link : https://leetcode.com/problems/longest-increasing-subsequence/solutions/74939/java-short-nlogn-treeset-solution/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(N)
 */

public class Q300_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int value : nums) {
            Integer higherOrEqual = set.ceiling(value);
            if (higherOrEqual != null)
                set.remove(higherOrEqual);
            set.add(value);
        }
        return set.size();
    }
}
