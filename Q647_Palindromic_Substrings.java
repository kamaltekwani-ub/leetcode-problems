/*
 * Problem Link : https://leetcode.com/problems/palindromic-substrings/
 * Solution Link : https://leetcode.com/problems/palindromic-substrings/solutions/4703811/interview-approach-3-approach-brute-force-expand-middle-dp/
 *
 * Time Complexity : O(N^2)
 * Space Complexity : O(1)
 */

public class Q647_Palindromic_Substrings {
    int count = 0;

    public void findPalindromicSubstrings(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
    }

    public int countSubstrings(String s) {
        for (int index = 0; index < s.length(); index++) {
            findPalindromicSubstrings(s, index, index);
            findPalindromicSubstrings(s, index, index + 1);
        }

        return count;
    }
}
