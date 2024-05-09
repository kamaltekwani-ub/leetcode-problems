/*
 * Problem Link : https://leetcode.com/problems/sum-of-two-integers/
 * Solution Link : https://leetcode.com/problems/sum-of-two-integers/solutions/2562077/beginner-level-explanation-with-code/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q371_Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}
