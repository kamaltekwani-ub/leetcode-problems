import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/combination-sum/
 * Solution Link : https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q39_Combination_Sum {
    public void findCombinationSum(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        if (target < 0)
            return;

        for (int index = start; index < candidates.length; index++) {
            list.add(candidates[index]);
            findCombinationSum(candidates, index, target - candidates[index], list, result);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findCombinationSum(candidates, 0, target, list, result);
        return result;
    }
}
