/*
 * Problem Link : https://leetcode.com/problems/powx-n/
 * Solution Link : https://leetcode.com/problems/powx-n/solutions/19544/5-different-choices-when-talk-with-interviewers/
 *
 * Time Complexity : O(log N)
 * Space Complexity : O(1)
 */

public class Q50_Pow_x_n {


    public double myPow(double x, int n) {
        boolean isInverse = false;

        if (n < 0)
            isInverse = true;

        double product = 1;
        n = Math.abs(n);

        while (n != 0) {
            if ((n & 1) != 0)
                product *= x;

            x *= x;
            n /= 2;
        }

        if (isInverse)
            return (double) (1.0 / product);

        return product;
    }
}
