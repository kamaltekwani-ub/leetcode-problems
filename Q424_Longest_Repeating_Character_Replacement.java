public class Q424_Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        char alphabet[] = new char[26];
        int maxFrequency = 0;
        int length = 0;

        int left = 0;
        int right = 0;

        while (right < s.length()) {
            alphabet[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency, alphabet[s.charAt(right) - 'A']);

            if (right - left + 1 - maxFrequency > k) {
                alphabet[s.charAt(left) - 'A']--;
                left++;
            }

            length = Math.max(length, right - left + 1);
            right++;
        }

        return length;
    }
}
