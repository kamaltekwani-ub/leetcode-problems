import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/*
 * Problem Link : https://leetcode.com/problems/maximum-frequency-stack/
 * Solution Link : https://leetcode.com/problems/maximum-frequency-stack/solutions/1086543/js-python-java-c-frequency-map-stack-solution-w-explanation/
 */

public class Q895_Maximum_Frequency_Stack {
    class FreqStack {
        HashMap<Integer, Integer> fmap;
        List<Stack<Integer>> stack;

        public FreqStack() {
            fmap = new HashMap();
            stack = new ArrayList<>();
            stack.add(new Stack());
        }

        public void push(int x) {
            int freq = fmap.getOrDefault(x, 0) + 1;
            fmap.put(x, freq);
            if (freq == stack.size()) stack.add(new Stack());
            stack.get(freq).add(x);
        }

        public int pop() {
            Stack<Integer> top = stack.get(stack.size() - 1);
            int x = top.pop();

            if (top.size() == 0)
                stack.remove(stack.size() - 1);

            fmap.put(x, fmap.get(x) - 1);
            return x;
        }
    }
}
