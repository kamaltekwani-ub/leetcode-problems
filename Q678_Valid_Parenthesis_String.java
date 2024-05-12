/*
 * Problem Link : https://leetcode.com/problems/valid-parenthesis-string/
 * Solution Link : https://leetcode.com/problems/valid-parenthesis-string/solutions/4985006/96-98-easy-solution-with-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q678_Valid_Parenthesis_String {
    public boolean checkValidString(String s) {
        int leftMin = 0;
        int leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }

            leftMin = leftMin < 0 ? 0 : leftMin;

            if (leftMax < 0)
                return false;
        }

        return leftMin == 0;
    }
}
