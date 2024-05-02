/*
 * Problem Link : https://leetcode.com/problems/sqrtx/description/
 * Solution Link : https://leetcode.com/problems/sqrtx/solutions/3706594/easy-explained-solution-beats-100/
 *
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
 */

public class Q69_Sqrt {
    public int mySqrt(int x)
    {
        int left = 1;
        int right = x;

        while(left <= right){
            int mid = left + (right - left)/2;

            if((long) mid * mid > (long) x)
                right = mid - 1;
            else if(mid * mid == x)
                return mid;
            else
                left = mid + 1;
        }

        return Math.round(right);
    }
}
