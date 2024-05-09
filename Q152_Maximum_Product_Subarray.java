/*
 * Problem Link : https://leetcode.com/problems/maximum-product-subarray/
 * Solution Link : https://leetcode.com/problems/maximum-product-subarray/solutions/1481299/java-easy-to-understand-0ms-100-fastest-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q152_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int leftProduct = 1;
        int rightProduct = 1;

        for (int index = 0; index < nums.length; index++) {
            leftProduct *= nums[index];
            result = Math.max(result, leftProduct);
            if (leftProduct == 0)
                leftProduct = 1;
        }

        for (int index = nums.length - 1; index > 0; index--) {
            rightProduct *= nums[index];
            result = Math.max(result, rightProduct);
            if (rightProduct == 0)
                rightProduct = 1;
        }

        return result;
    }
}
