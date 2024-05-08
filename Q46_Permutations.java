import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/permutations/
 * Solution Link : https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q46_Permutations
{
    public void findPermutation(int nums[], boolean visited[], List<Integer> list, List<List<Integer>> result)
    {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int index=0 ; index<nums.length ; index++)
        {
            if(visited[index])
                continue;
            visited[index] = true;
            list.add(nums[index]);
            findPermutation(nums, visited, list, result);
            visited[index] = false;
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findPermutation(nums, new boolean[nums.length], list, result);
        return result;
    }
}
