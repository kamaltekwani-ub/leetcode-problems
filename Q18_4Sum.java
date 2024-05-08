/*
 * Problem Link : https://leetcode.com/problems/4sum/description/
 * Solution Link : https://youtu.be/eD95WRfh81c
 *
 * Time Complexity : O(N ^ 3)
 * Space Complexity : O(1)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (index == 0 || nums[index - 1] != nums[index]) {
                for (int j = index + 1; j < nums.length; j++) {
                    if (j == index + 1 || nums[j - 1] != nums[j]) {
                        int left = j + 1;
                        int right = nums.length - 1;

                        while (left < right) {
                            long sum = nums[index];
                            sum += nums[j];
                            sum += nums[left];
                            sum += nums[right];

                            if (sum == target) {
                                result.add(Arrays.asList(nums[index], nums[j], nums[left], nums[right]));

                                while (left < right && nums[left] == nums[left + 1])
                                    left++;

                                while (left < right && nums[right] == nums[right - 1])
                                    right--;

                                left++;
                                right--;
                            } else if (sum < target)
                                left++;
                            else
                                right--;
                        }
                    }
                }
            }
        }

        return result;
    }
}
