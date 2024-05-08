import java.util.Stack;

/*
 * Problem Link :
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
