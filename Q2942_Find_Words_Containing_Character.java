import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/find-words-containing-character/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q2942_Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < words.length; index++)
            if (words[index].indexOf(x) != -1)
                list.add(index);

        return list;
    }
}
