import java.util.Collections;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
 * Solution Link : https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/solutions/3933747/two-pointers-o-nlogn-solution-fully-explained-simple-and-easy-to-understand/
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
 */

public class Q2824_Count_Pairs_Whose_Sum_is_Less_than_Target
{
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();

        // Sort the List.
        Collections.sort(nums);

        // Initialize the number of pairs.
        int countPairs = 0;

        // Initialize the left and right pointers.
        int low = 0;
        int high = n - 1;

        // Iterate while the left pointer is less than the right pointer.
        while (low < high) {
            // Calculate the sum of the two elements.
            int sum = nums.get(low) + nums.get(high);

            // If the sum is less than the target, then increment the number of pairs.
            if (sum < target) {
                countPairs += high - low;
                low++;
            } else {
                // Otherwise, decrement the right pointer.
                high--;
            }
        }

        // Return the number of pairs.
        return countPairs;
    }
}
