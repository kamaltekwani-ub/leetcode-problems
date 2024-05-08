/*
 * Problem Link : https://leetcode.com/problems/longest-mountain-in-array/
 * Solution Link : https://leetcode.com/problems/longest-mountain-in-array/solutions/135593/c-java-python-1-pass-and-o-1-space/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q845_Longest_Mountain_in_Array {
    public int longestMountain(int[] arr) {
        int up[] = new int[arr.length];
        int down[] = new int[arr.length];
        int result = 0;

        for (int index = arr.length - 2; index >= 0; index--)
            if (arr[index] > arr[index + 1])
                down[index] = down[index + 1] + 1;

        for (int index = 0; index < arr.length; index++) {
            if (index > 0 && arr[index] > arr[index - 1])
                up[index] = up[index - 1] + 1;

            if (up[index] > 0 && down[index] > 0)
                result = Math.max(result, up[index] + down[index] + 1);
        }

        return result;
    }
}
