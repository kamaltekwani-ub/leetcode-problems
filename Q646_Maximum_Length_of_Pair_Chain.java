import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/maximum-length-of-pair-chain/
 * Solution Link : https://leetcode.com/problems/maximum-length-of-pair-chain/solutions/3960470/98-17-2-approaches-greedy-dynamic-programming/
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
 */

public class Q646_Maximum_Length_of_Pair_Chain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int length = 1;
        int end = pairs[0][1];

        for (int pair[] : pairs) {
            if (end < pair[0]) {
                length++;
                end = pair[1];
            }
        }

        return length;
    }
}
