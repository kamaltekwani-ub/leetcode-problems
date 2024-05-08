import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/roman-to-integer/
 * Solution Link : https://leetcode.com/problems/roman-to-integer/solutions/3651672/best-method-c-java-python-beginner-friendly
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q13_Roman_to_Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for (int index = s.length() - 2; index >= 0; index--) {
            if (map.get(s.charAt(index)) < map.get(s.charAt(index + 1)))
                result -= map.get(s.charAt(index));
            else
                result += map.get(s.charAt(index));
        }
        return result;
    }
}
