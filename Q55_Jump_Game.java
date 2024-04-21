/*
 * Problem Link : https://leetcode.com/problems/jump-game/
 * Solution Link : https://leetcode.com/problems/jump-game/solutions/20932/6-line-java-solution-in-o-n/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q55_Jump_Game
{
    public boolean canJump(int[] nums)
    {
        int reachable = 0;
        for(int index=0 ; index<nums.length ; index++){
            if(index > reachable)
                return false;
            reachable = Math.max(reachable, index + nums[index]);
        }
        return true;
    }
}
