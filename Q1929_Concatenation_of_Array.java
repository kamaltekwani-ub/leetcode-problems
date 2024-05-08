/*
 * Problem Link : https://leetcode.com/problems/concatenation-of-array/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q1929_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int result[] = new int[2 * nums.length];
        for (int index = 0; index < nums.length; index++) {
            result[index + nums.length] = nums[index];
            result[index] = nums[index];
        }
        return result;
    }
}
