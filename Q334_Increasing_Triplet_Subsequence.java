/*
 * Problem Link : https://leetcode.com/problems/increasing-triplet-subsequence/
 * Solution Link : https://leetcode.com/problems/increasing-triplet-subsequence/solutions/79000/my-accepted-java-solution-for-this-question-only-7-lines-clear-and-concise/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q334_Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;

        for (int value : nums)
            if (value <= i)
                i = value;
            else if (value <= j)
                j = value;
            else
                return true;

        return false;
    }
}
