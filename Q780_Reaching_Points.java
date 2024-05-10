/*
 * Problem Link : https://leetcode.com/problems/reaching-points/
 * Solution Link : https://leetcode.com/problems/reaching-points/solutions/816596/explanation-for-math-dummies-like-me/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q780_Reaching_Points
{
    public boolean reachingPoints(int sx, int sy, int tx, int ty)
    {
        while(tx >= sx && ty >= sy)
        {
            if(tx > ty)
            {
                if(ty == sy)
                    return (tx - sx) % ty == 0;
                tx %= ty;
            }
            else
            {
                if(tx == sx)
                    return (ty - sy) % tx == 0;
                ty %= tx;
            }
        }

        return false;
    }
}
