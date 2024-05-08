import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q271_Encode_and_Decode_Strings {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int start = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == '#') {
                int length = Integer.parseInt(s.substring(start, index));
                list.add(s.substring(index + 1, index + length + 1));
                start = index + length + 1;
                index = start;
            } else
                index = index + 1;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(encode(Arrays.asList("C#", "&", "~Xp|F", "R4QBf9g=_")));
        System.out.println(decode("1##"));
    }
}
