import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/majority-element-ii/
 * Solution Link : https://leetcode.com/problems/majority-element-ii/solutions/1098995/explanation-about-boyer-moore-vote/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int first_element = Integer.MAX_VALUE;
        int second_element = Integer.MAX_VALUE;

        int first_count = 0;
        int second_count = 0;

        for (int value : nums) {
            if (first_element == value)
                first_count++;
            else if (second_element == value)
                second_count++;
            else if (first_count == 0) {
                first_element = value;
                first_count = 1;
            } else if (second_count == 0) {
                second_element = value;
                second_count = 1;
            } else {
                first_count--;
                second_count--;
            }
        }

        first_count = 0;
        second_count = 0;

        for (int value : nums) {
            if (first_element == value)
                first_count++;

            if (second_element == value)
                second_count++;
        }

        if (first_count > nums.length / 3)
            result.add(first_element);

        if (second_count > nums.length / 3)
            result.add(second_element);

        return result;
    }
}
