/*
 * Problem Link : https://leetcode.com/problems/zigzag-conversion/
 * Solution Link : https://leetcode.com/problems/zigzag-conversion/solutions/4364090/easy-green-beats/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q6_Zigzag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder sb[] = new StringBuilder[numRows];
        for (int index = 0; index < numRows; index++)
            sb[index] = new StringBuilder();

        int index = 0;
        boolean direction = false;
        int i = 0;

        while (index < s.length()) {
            // UP
            if (direction) {
                sb[i] = sb[i].append(s.charAt(index));
                i--;
                index++;
                if (i == 0)
                    direction = false;
            }
            // DOWN
            else {
                sb[i] = sb[i].append(s.charAt(index));
                i++;
                index++;
                if (i == numRows - 1)
                    direction = true;
            }
        }

        String result = "";

        for (StringBuilder temp : sb)
            result += temp;

        return result;
    }
}
