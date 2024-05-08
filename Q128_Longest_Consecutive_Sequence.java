import java.util.HashSet;
import java.util.Set;

public class Q128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = 0;

        for (int value : nums)
            set.add(value);

        for (int value : nums) {
            int left = value;
            int right = value;
            int count = 1;

            while (set.contains(left - 1)) {
                left = left - 1;
                set.remove(left);
                count++;
            }

            while (set.contains(right + 1)) {
                right = right + 1;
                set.remove(right);
                count++;
            }

            length = Math.max(count, length);
        }

        return length;
    }
}
