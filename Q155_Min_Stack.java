/*
 * Problem Link : https://leetcode.com/problems/min-stack/
 * Solution Link : https://leetcode.com/problems/min-stack/solutions/49078/simple-java-solution-12-line/
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

import java.util.Stack;

public class Q155_Min_Stack {
    class MinStack {
        Stack<int[]> stack;

        public MinStack() {
            stack = new Stack<int[]>();
        }

        public void push(int val) {
            int minimum = Integer.MAX_VALUE;
            if (!stack.isEmpty()) {
                int array[] = stack.peek();
                minimum = array[1];
            }

            stack.push(new int[]{val, Math.min(minimum, val)});
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            int array[] = stack.peek();
            return array[0];
        }

        public int getMin() {
            int array[] = stack.peek();
            return array[1];
        }
    }
}
