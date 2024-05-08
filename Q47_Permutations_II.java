import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/permutations-ii/
 * Solution Link : https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q47_Permutations_II
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

            if(index==0 || nums[index-1] != nums[index] || !visited[index-1])
            {
                list.add(nums[index]);
                visited[index] = true;

                findPermutation(nums, visited, list, result);

                list.remove(list.size()-1);
                visited[index] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findPermutation(nums, new boolean[nums.length], list, result);
        return result;
    }
}
