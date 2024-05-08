import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int length = 0;

        while (right < s.length()) {
            if (map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            map.put(s.charAt(right), right);
            length = Math.max(length, right - left + 1);
            right++;
        }

        return length;
    }
}
