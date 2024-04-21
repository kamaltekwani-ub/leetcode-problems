public class Q58_Length_of_Last_Word
{
    // Link : https://leetcode.com/problems/length-of-last-word/solutions/370636/java-0ms-100-100-single-reverse-loop-with-explanation/

    // Time Complexity : O(N)
    // Space Complexity : O(1)

    public int lengthOfLastWord(String s)
    {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }
}
