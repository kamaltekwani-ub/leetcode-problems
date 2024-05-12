import java.util.Stack;

/*
 * Problem Link : https://leetcode.com/problems/daily-temperatures/
 * Solution Link : https://leetcode.com/problems/daily-temperatures/solutions/4651723/easy-stack-friendly-explained/
 *
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

public class Q739_Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int result[] = new int[temperatures.length];
        for (int index = 0; index < temperatures.length; index++) {
            while (!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]) {
                result[stack.peek()] = index - stack.peek();
                stack.pop();
            }
            stack.push(index);
        }

        return result;
    }
}
