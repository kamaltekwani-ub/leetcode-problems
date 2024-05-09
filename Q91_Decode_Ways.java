/*
 * Problem Link : https://leetcode.com/problems/decode-ways/
 * Solution Link : https://leetcode.com/problems/decode-ways/solutions/4454037/97-43-easy-solution-with-explanation/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q91_Decode_Ways {
    public int numDecodings(String s) {
        int a = 1;
        int b = s.charAt(0) == '0' ? 0 : 1;

        for (int index = 2; index <= s.length(); index++) {
            int lengthOne = Integer.parseInt(s.substring(index - 1, index));
            int lengthTwo = Integer.parseInt(s.substring(index - 2, index));

            int c = 0;

            if (lengthOne >= 1 && lengthOne <= 9)
                c += b;

            if (lengthTwo >= 10 && lengthTwo <= 26)
                c += a;

            a = b;
            b = c;
        }

        return b;
    }
}
