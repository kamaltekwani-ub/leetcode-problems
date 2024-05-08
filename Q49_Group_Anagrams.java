import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q49_Group_Anagrams {
    public String buildKey(String s) {
        char alphabet[] = new char[26];
        for (char c : s.toCharArray())
            alphabet[c - 'a']++;
        return new String(alphabet);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = buildKey(s);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
