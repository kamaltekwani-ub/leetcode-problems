/*
 * Problem Link : https://leetcode.com/problems/house-robber-ii/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q213_House_Robber_II {
    public int findMax(int nums[]) {
        if (nums.length == 1)
            return nums[0];

        int dp[] = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int index = 2; index < nums.length; index++)
            dp[index] = Math.max(nums[index] + dp[index - 2], dp[index - 1]);

        return dp[nums.length - 1];
    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int numsA[] = new int[nums.length - 1];
        int numsB[] = new int[nums.length - 1];
        int indexA = 0;
        int indexB = 0;

        for (int index = 0; index < nums.length; index++) {
            if (index != 0)
                numsA[indexA++] = nums[index];

            if (index != nums.length - 1)
                numsB[indexB++] = nums[index];
        }

        return Math.max(findMax(numsA), findMax(numsB));
    }
}
