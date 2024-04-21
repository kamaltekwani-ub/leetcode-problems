import java.util.HashMap;
import java.util.Map;

public class Q76_Minimum_Window_Substring
{
    public static String minWindow(String s, String t)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        int left = 0;
        int right = 0;
        int count = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;

        while(right < s.length()){

            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if(map.get(s.charAt(right)) >= 0)
                    count++;
            }

            while(count == t.length())
            {
                if(length > right - left + 1){
                    start = left;
                    length = right - left + 1;
                }

                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if(map.get(s.charAt(left)) > 0)
                        count--;
                }

                left++;
            }

            right++;
        }

        if(length > s.length())
            return "";

        return s.substring(start, start + length);
    }

    public static void main(String[] args) {
        System.out.println("Result - "+minWindow("ADOBECODEBANC", "ABC"));
    }
}
