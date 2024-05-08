/*
 * Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Solution Link : https://leetcode.com/problems/first-unique-character-in-a-string/solutions/2431836/java-100-faster-code-easy-solution-with-explanation/
 *
 * Time Complexity : O(k * N)
 * Space Complexity : O(1)
 */

public class Q387_First_Unique_Character_in_a_String {

    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c))
                result = Math.min(result, index);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
