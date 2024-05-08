/*
 * Problem Link : https://leetcode.com/problems/next-permutation/
 * Solution Link : https://leetcode.com/problems/next-permutation/solutions/13994/readable-code-without-confusing-i-j-and-with-explanation/
 *
 * Time Complexity :
 * Space Complexity :
 */


public class Q31_Next_Permutation {
    public int indexOfLastPeak(int nums[]) {
        for (int index = nums.length - 1; index > 0; index--)
            if (nums[index - 1] < nums[index])
                return index;

        return 0;
    }

    public int lastIndexOfGreater(int nums[], int threshold) {
        for (int index = nums.length - 1; index >= 0; index--)
            if (threshold < nums[index])
                return index;
        return -1;
    }

    public void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int pivot = indexOfLastPeak(nums) - 1;

        if (pivot != -1) {
            int nextPrefix = lastIndexOfGreater(nums, nums[pivot]);
            swap(nums, pivot, nextPrefix);
        }

        reverseSuffix(nums, pivot + 1);
    }
}
