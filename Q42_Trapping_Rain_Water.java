/*
 * Problem Link : https://leetcode.com/problems/trapping-rain-water/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q42_Trapping_Rain_Water
{
    public int trap(int[] height) {
        int maxIndex = -1;
        int maxHeight = Integer.MIN_VALUE;
        int result = 0;

        for(int index=0 ; index<height.length ; index++){
            if(maxHeight < height[index]){
                maxHeight = height[index];
                maxIndex = index;
            }
        }

        int maxLeft = height[0];
        for(int index=0 ; index<maxIndex ; index++){
            if(maxLeft < height[index])
                maxLeft = height[index];
            else
                result += maxLeft - height[index];
        }

        int maxRight = height[height.length-1];
        for(int index=height.length-2 ; index>maxIndex ; index--){
            if(maxRight < height[index])
                maxRight = height[index];
            else
                result += maxRight - height[index];
        }

        return result;
    }
}
