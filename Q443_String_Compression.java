/*
 * Problem Link : https://leetcode.com/problems/string-compression/
 * Solution Link : https://leetcode.com/problems/string-compression/solutions/3245804/clean-codes-full-explanation-two-pointers-c-java-python3/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q443_String_Compression {
    public int compress(char[] chars) {
        int index = 0;

        int i = 0;
        int j = 0;

        int length = 0;

        while (i < chars.length) {
            while (j < chars.length && chars[i] == chars[j])
                j++;

            chars[index++] = chars[i];

            length = j - i;

            if (length > 1) {
                String s = String.valueOf(length);
                for (char c : s.toCharArray())
                    chars[index++] = c;
            }

            i = j;
        }

        return index;
    }
}
