import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/palindrome-partitioning/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q131_Palindrome_Partitioning {
    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    public void dfs(String s, int start, List<String> list, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int index = start; index < s.length(); index++) {
            if (isPalindrome(s, start, index)) {
                list.add(s.substring(start, index + 1));
                dfs(s, index + 1, list, result);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        dfs(s, 0, list, result);
        return result;
    }
}
