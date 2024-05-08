import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/combination-sum-ii/
 * Solution Link : https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindro
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q40_Combination_Sum_II {
    public void findCombinationSum(int candidates[], int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (target < 0)
            return;

        for (int index = start; index < candidates.length; index++) {
            if (index == start || candidates[index - 1] != candidates[index]) {
                list.add(candidates[index]);
                findCombinationSum(candidates, index + 1, target - candidates[index], list, result);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        findCombinationSum(candidates, 0, target, list, result);
        return result;
    }
}
