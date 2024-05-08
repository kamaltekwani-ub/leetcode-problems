/*
 * Problem Link : https://leetcode.com/problems/missing-number/
 * Solution Link : https://leetcode.com/problems/missing-number/solutions/69786/3-different-ideas-xor-sum-binary-search-java-code
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q268_Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int value : nums)
            sum -= value;
        return sum;
    }
}
