import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/combinations/
 * Solution Link : https://leetcode.com/problems/combinations/solutions/27002/backtracking-solution-java/
 *
 * Time Complexity :
 * Space Complexity :
 */


public class Q77_Combinations {
    public void findCombination(int n, int start, int k, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int index = start; index <= n; index++) {
            list.add(index);
            findCombination(n, index + 1, k, list, result);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findCombination(n, 1, k, list, result);
        return result;
    }
}
