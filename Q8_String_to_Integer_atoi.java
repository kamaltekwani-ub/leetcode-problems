/*
 * Problem Link : https://leetcode.com/problems/string-to-integer-atoi/
 * Solution Link : https://leetcode.com/problems/string-to-integer-atoi/solutions/1402936/java-c-simple-pictorial-explanation-32-bit-int-easy
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q8_String_to_Integer_atoi {
    public int myAtoi(String s) {
        if (s.equals("")) {
            return 0;
        }

        // helper variables
        int res = 0, i = 0, sign = 1;

        // get rid of whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i++) == '-') {
                sign = -1;
            }
        }

        // now iterate across digits if any
        // should only be in range 0-9
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // check if we will go over the max
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                } else
                    return Integer.MAX_VALUE;
            }

            res = res * 10 + (s.charAt(i++) - '0');
        }
        return sign * res;
    }
}
