public class Q1480_Running_Sum_of_1d_Array {
    /*
     * Problem Link : https://leetcode.com/problems/running-sum-of-1d-array/
     * Solution Link :
     *
     * Time Complexity : O(N)
     * Space Complexity : O(1)
     */

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
            nums[index] = sum;
        }
        return nums;
    }
}
