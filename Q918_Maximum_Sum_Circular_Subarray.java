/*
 * Problem Link : https://leetcode.com/problems/maximum-sum-circular-subarray/
 * Solution Link : https://leetcode.com/problems/maximum-sum-circular-subarray/solutions/178422/one-pass/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q918_Maximum_Sum_Circular_Subarray {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currentMax = 0;

        int minSum = nums[0];
        int currentMin = 0;

        int totalSum = 0;

        for (int value : nums) {
            currentMax = Math.max(currentMax + value, value);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(currentMin + value, value);
            minSum = Math.min(minSum, currentMin);

            totalSum += value;
        }

        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;

    }
}
