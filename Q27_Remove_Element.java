/*
 * Problem Link : https://leetcode.com/problems/remove-element/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[index++] = nums[i];
        }
        return index;
    }
}
