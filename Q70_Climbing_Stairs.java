/*
 * Problem Link : https://leetcode.com/problems/climbing-stairs/description/
 * Solution Link : https://leetcode.com/problems/climbing-stairs/solutions/3708750/4-method-s-beat-s-100-c-java-python-beginner-friendly/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q70_Climbing_Stairs
{
    public static int climbStairs(int n)
    {
        if(n <= 2)
            return n;

        int a = 1;
        int b = 2;

        for(int i=3 ; i<=n ; i++){
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
