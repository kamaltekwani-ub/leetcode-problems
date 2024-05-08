/*
 * Problem Link : https://leetcode.com/problems/valid-anagram/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int alphabet[] = new int[26];
        for (char c : s.toCharArray())
            alphabet[c - 'a']++;

        for (char c : t.toCharArray())
            alphabet[c - 'a']--;

        for (int value : alphabet)
            if (value != 0)
                return false;

        return true;
    }
}
