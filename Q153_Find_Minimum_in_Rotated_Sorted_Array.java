/*
 * Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Solution Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solutions/48487/java-solution-with-binary-search/
 *
 * Time Complexity : O(log N)
 * Space Complexity : O(1)
 */

public class Q153_Find_Minimum_in_Rotated_Sorted_Array
{
    public int findMin(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid])
                return nums[mid];
            else if (nums[left] <= nums[mid] && nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return nums[left];
    }
}
