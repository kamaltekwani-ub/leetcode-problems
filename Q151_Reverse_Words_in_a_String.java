/*
 * Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/
 * Solution Link : https://leetcode.com/problems/reverse-words-in-a-string/solutions/3593904/5-line-simple-solution-with-full-explanation/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q151_Reverse_Words_in_a_String {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (length > 0)
                    return length;
            }
        }
        return length;
    }
}
