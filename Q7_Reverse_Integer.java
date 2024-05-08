/*
 * Problem Link : https://leetcode.com/problems/reverse-integer/
 * Solution Link : https://leetcode.com/problems/reverse-integer/solutions/3136892/java-beat-100-well-explained-code
 *
 * Time Complexity : O(log x)
 * Space Complexity : O(1)
 */

public class Q7_Reverse_Integer {
    public int reverse(int x) {
        long finalNum = 0;

        while (x != 0) {
            int lastNum = x % 10;
            finalNum += lastNum;
            finalNum *= 10;
            x /= 10;
        }

        finalNum = finalNum / 10;

        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE)
            return 0;

        if (x < 0)
            return (int) (-1 * finalNum);

        return (int) finalNum;
    }
}
