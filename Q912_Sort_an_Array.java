/*
 * Problem Link : https://leetcode.com/problems/sort-an-array/
 * Solution Link : https://leetcode.com/problems/sort-an-array/solutions/492042/7-sorting-algorithms-quick-sort-top-down-bottom-up-merge-sort-heap-sort-etc/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(1)
 */

public class Q912_Sort_an_Array {
    public void conquer(int nums[], int left, int mid, int right) {
        int indexA = left;
        int indexB = mid + 1;
        int index = 0;
        int array[] = new int[right - left + 1];

        while (indexA <= mid && indexB <= right) {
            if (nums[indexA] < nums[indexB])
                array[index++] = nums[indexA++];
            else
                array[index++] = nums[indexB++];
        }

        while (indexA <= mid)
            array[index++] = nums[indexA++];

        while (indexB <= right)
            array[index++] = nums[indexB++];

        for (int i = 0, j = left; i < array.length; i++, j++)
            nums[j] = array[i];
    }

    public void divide(int nums[], int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        divide(nums, left, mid);
        divide(nums, mid + 1, right);

        conquer(nums, left, mid, right);
    }

    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
}
