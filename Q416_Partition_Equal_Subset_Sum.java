/*
 * Problem Link : https://leetcode.com/problems/partition-equal-subset-sum/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q416_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int value : nums)
            sum += value;

        if (sum % 2 != 0)
            return false;

        sum = sum / 2;

        boolean dp[] = new boolean[sum + 1];
        dp[0] = true;

        for (int index = 0; index < nums.length; index++)
            for (int j = sum; j >= nums[index]; j--)
                dp[j] = dp[j] | dp[j - nums[index]];


        return dp[sum];
    }
}
