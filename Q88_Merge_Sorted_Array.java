/*
 * Problem Link : https://leetcode.com/problems/merge-sorted-array/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0)
            nums1[index--] = (nums1[m] > nums2[n]) ? nums1[m--] : nums2[n--];

        while (n >= 0)
            nums1[index--] = nums2[n--];
    }
}
