import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/3sum/
 * Solution Link :
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
 */

public class Q15_3Sum
{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int index=0 ; index<nums.length ; index++){
            if(index == 0 || nums[index-1] != nums[index]){
                int left = index+1;
                int right = nums.length-1;

                int target = 0 - nums[index];

                while(left < right)
                {
                    if(nums[left] + nums[right] == target)
                    {
                        result.add(Arrays.asList(nums[index], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left+1])
                            left++;

                        while(left < right && nums[right] == nums[right-1])
                            right--;

                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] < target)
                        left++;
                    else
                        right--;
                }
            }
        }

        return result;
    }
}
