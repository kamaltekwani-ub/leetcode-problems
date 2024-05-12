import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/permutation-in-string/
 * Solution Link : https://leetcode.com/problems/permutation-in-string/solutions/462086/java-o-n-time-o-1-space-w-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q567_Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int alphabetA[] = new int[26];
        int alphabetB[] = new int[26];

        for (int index = 0; index < s1.length(); index++) {
            alphabetA[s1.charAt(index) - 'a']++;
            alphabetB[s2.charAt(index) - 'a']++;
        }

        if (Arrays.equals(alphabetA, alphabetB))
            return true;

        for (int index = s1.length(); index < s2.length(); index++) {
            alphabetB[s2.charAt(index) - 'a']++;
            alphabetB[s2.charAt(index - s1.length()) - 'a']--;

            if (Arrays.equals(alphabetA, alphabetB))
                return true;
        }

        return false;
    }
}
