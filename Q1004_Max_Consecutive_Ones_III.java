/*
 * Problem Link : https://leetcode.com/problems/max-consecutive-ones-iii
 * Solution Link : https://www.youtube.com/watch?v=Y4SrfoquEpk
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q1004_Max_Consecutive_Ones_III
{
    public int longestOnes(int[] nums, int k)
    {
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = 0;

        for(right=0 ; right<nums.length ; right++)
        {
            sum += nums[right];

            while(sum+k < right-left+1)
            {
                sum -= nums[left];
                left++;
            }

            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
