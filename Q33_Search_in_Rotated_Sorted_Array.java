/*
 * Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Solution Link : https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/14436/revised-binary-search/
 *
 * Time Complexity : O(log n)
 * Space Complexity : O(1
 */

public class Q33_Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }
}
