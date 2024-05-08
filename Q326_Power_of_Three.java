/*
 * Problem Link : https://leetcode.com/problems/power-of-three/
 * Solution Link : https://leetcode.com/problems/power-of-three/solutions/1179332/3-methods-to-solve
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return n == 1;
    }
}
