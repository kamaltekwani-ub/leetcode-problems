import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/partition-labels/description/
 * Solution Link : https://leetcode.com/problems/partition-labels/solutions/1117574/greedy-solution-o-n/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q763_Partition_Labels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < s.length(); ) {
            int start = index;

            int end = s.lastIndexOf(s.charAt(start));

            for (int i = start; i <= end; i++) {
                int lastIndex = s.lastIndexOf(s.charAt(i));

                if (lastIndex > end)
                    end = lastIndex;
            }

            result.add(end - start + 1);
            index = end + 1;
        }

        return result;
    }
}
