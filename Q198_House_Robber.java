/*
 * Problem Link : https://leetcode.com/problems/house-robber/
 * Solution Link : https://leetcode.com/problems/house-robber/solutions/55695/java-dp-solution-o-n-runtime-and-o-1-space-with-inline-comment/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q198_House_Robber {
    /*
     * Time Complexity : O(N)
     * Space Complexity : O(N)
     *
    public int rob(int[] nums){
        if(nums.length == 1)
            return nums[0];

        int result[] = new int[nums.length];

        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for(int index=2 ; index<nums.length ; index++){
            result[index] = Math.max(result[index-1], result[index-2] + nums[index]);
        }
        return result[nums.length-1];
    }
    */

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);

        for (int index = 2; index < nums.length; index++) {
            int c = Math.max(b, a + nums[index]);
            a = b;
            b = c;
        }
        return b;
    }
}
