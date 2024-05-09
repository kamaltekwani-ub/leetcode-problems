import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/subsets/
 * Solution Link : https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q78_Subsets {
    public void findSubsets(int nums[], int start, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));

        for (int index = start; index < nums.length; index++) {
            list.add(nums[index]);
            findSubsets(nums, index + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findSubsets(nums, 0, list, result);
        return result;
    }
}
