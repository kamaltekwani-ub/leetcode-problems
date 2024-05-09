/*
 * Problem Link : https://leetcode.com/problems/sort-colors/
 * Solution Link : https://leetcode.com/problems/sort-colors/solutions/273597/java-0ms-two-pointer-solution-with-detailed-explanation/
 *
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

public class Q75_Sort_Colors {
    public void swap(int nums[], int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            }
        }
    }
}
