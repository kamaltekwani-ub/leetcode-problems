/*
 * Problem Link : https://leetcode.com/problems/maximum-subarray/
 * Solution Link : https://leetcode.com/problems/maximum-subarray/solutions/1595097/java-kadane-s-algorithm-explanation-using-image/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q53_Maximum_Subarray {
    public static int maxSubArray(int[] nums)
    {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int value : nums){
            sum += value;
            result = Math.max(result, sum);
            if(sum < 0)
                sum = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result - "+maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
