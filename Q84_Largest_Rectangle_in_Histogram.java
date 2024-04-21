import java.util.Stack;

public class Q84_Largest_Rectangle_in_Histogram
{
    /*
     * Problem Link : https://leetcode.com/problems/largest-rectangle-in-histogram/
     * Solution Link :
     *
     * Time Complexity : O(N)
     * Space Complexity : O(N)
     */

    public int largestRectangleArea(int[] heights)
    {
        Stack<Integer> stack = new Stack<Integer>();

        int area = 0;
        int index = 0;

        while(index<heights.length)
        {
            if(stack.isEmpty() || heights[stack.peek()] < heights[index])
                stack.push(index++);
            else
            {
                int top = stack.pop();
                area = Math.max(area, heights[top] * (stack.isEmpty() ? index : index-stack.peek() - 1));
            }
        }

        while(!stack.isEmpty())
        {
            int top = stack.pop();
            area = Math.max(area, heights[top] * (stack.isEmpty() ? index : index-stack.peek() - 1));
        }

        return area;
    }
}
