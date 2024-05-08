/*
 * Problem Link : https://leetcode.com/problems/longest-palindromic-substring/
 * Solution Link : https://leetcode.com/problems/longest-palindromic-substring/solutions/4212564/beats-96-49-5-different-approaches-brute-force-eac-dp-ma-recursion
 *
 * Time Complexity : O(N^2)
 * Space Complexity : O(1)
 */

public class Q5_Longest_Palindromic_Substring {
    int start = 0;
    int length = 0;

    private void findLongestPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;

            if (length < right - left - 1) {
                length = right - left - 1;
                start = left + 1;
            }
        }
    }

    public String longestPalindrome(String s) {
        for (int index = 0; index < s.length(); index++) {
            findLongestPalindrome(s, index, index);
            findLongestPalindrome(s, index, index + 1);
        }
        return s.substring(start, start + length);
    }
}
