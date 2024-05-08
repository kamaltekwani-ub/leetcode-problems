/*
 * Problem Link : https://leetcode.com/problems/ransom-note/
 * Solution Link : https://leetcode.com/problems/ransom-note/solutions/1671552/1ms-100-easy-explanation-java-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        char alphabet[] = new char[26];

        for (char c : magazine.toCharArray())
            alphabet[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabet[c = 'a'] > 0)
                alphabet[c = 'a']--;
            else
                return false;
        }

        return true;
    }
}
