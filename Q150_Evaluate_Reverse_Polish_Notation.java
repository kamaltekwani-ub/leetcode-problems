import java.util.Stack;

/*
 * Problem Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Solution Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/47430/java-accepted-code-stack-implementation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q150_Evaluate_Reverse_Polish_Notation {
    public boolean isExpression(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String token : tokens) {
            if (isExpression(token)) {
                int first = stack.pop();
                int second = stack.pop();

                if (token.equals("+"))
                    stack.push(first + second);
                else if (token.equals("-"))
                    stack.push(second - first);
                else if (token.equals("*"))
                    stack.push(first * second);
                else if (token.equals("/"))
                    stack.push(second / first);
            } else
                stack.push(Integer.parseInt(token));
        }

        return stack.pop();
    }
}
