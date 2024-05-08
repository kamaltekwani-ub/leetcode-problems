/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/27987/short-and-simple-java-solution-easy-to-understand/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q80_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i : nums) {
            if (index < 2 || i > nums[index - 2])
                nums[index++] = i;
        }
        return index;
    }
}
