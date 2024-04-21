import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/two-sum/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q1_Two_Sum
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int index=0 ; index<nums.length ; index++){
            int remainder = target - nums[index];
            if(map.containsKey(remainder))
                return new int[]{map.get(remainder), index};
            map.put(nums[index], index);
        }

        return new int[]{};
    }
}
