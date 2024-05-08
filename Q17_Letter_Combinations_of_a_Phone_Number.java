import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Solution Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/solutions/2021106/4-approaches-bf-4-loops-backtracking-bfs-queue-with-image-explanation
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q17_Letter_Combinations_of_a_Phone_Number {
    public void findLetterCombination(String digits, Map<Character, String> map, int start, StringBuilder sb, List<String> result) {
        if (start == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char digit = digits.charAt(start);
        String s = map.get(digit);

        for (char c : s.toCharArray()) {
            sb.append(c);
            findLetterCombination(digits, map, start + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0)
            return result;

        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder sb = new StringBuilder();

        findLetterCombination(digits, map, 0, sb, result);

        return result;
    }
}
