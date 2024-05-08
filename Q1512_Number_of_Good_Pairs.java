import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/number-of-good-pairs/
 * Solution Link : https://leetcode.com/problems/number-of-good-pairs/solutions/1457646/java-story-based-0ms-single-pass-easy-to-understand-simple-hashmap/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q1512_Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            int count = map.getOrDefault(nums[index], 0);
            result += count;
            map.put(nums[index], count + 1);
        }
        return result;
    }
}
