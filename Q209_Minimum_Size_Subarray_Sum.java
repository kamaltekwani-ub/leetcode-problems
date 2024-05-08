/*
 * Problem Link : https://leetcode.com/problems/minimum-size-subarray-sum/
 * Solution Link : https://leetcode.com/problems/minimum-size-subarray-sum/solutions/59078/accepted-clean-java-o-n-solution-two-pointers/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum += nums[right];
            if (sum >= target) {
                while (sum >= target) {
                    length = Math.min(length, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
            }
            right++;
        }

        if (length == Integer.MAX_VALUE)
            return 0;

        return length;
    }
}
