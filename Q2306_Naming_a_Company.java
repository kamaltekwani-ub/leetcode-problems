import java.util.ArrayList;
import java.util.HashSet;

/*
 * Problem Link : https://leetcode.com/problems/naming-a-company/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q2306_Naming_a_Company {
    public long distinctNames(String ideas[]) {
        long result = 0;
        ArrayList<String> list[] = new ArrayList[26];

        for (int i = 0; i < 26; i++)
            list[i] = new ArrayList<String>();

        for (String idea : ideas)
            list[idea.charAt(0) - 'a'].add(idea.substring(1));

        for (int i = 0; i < 25; i++) {
            for (int j = i + 1; j < 26; j++) {
                HashSet<String> set = new HashSet<>();
                set.addAll(list[i]);
                set.addAll(list[j]);
                result += (list[i].size() - set.size()) * (list[j].size() - set.size());
            }
        }
        return 2 * result;
    }
}

/*

Step 1 : Create a mapping such that key will be 26 alphabets and value will be
         string starting with corresponding alphabets.

Step 2 : Now iterate through the pairs and remove the words which have same suffix,
         by putting them in a set

Step 3 : Now after that just calculate the distinct string which can be formed after
         swapping and add it up in a result variable.

Step 4 : At last, return the 2 * result because we have taken a word swapping from
         a to b, as words can be formed from swapping b to a.

[C] - offee

[D] - onuts

[T] - ime, offee

Pair : [C - D]

Set : offee, onuts

Result = ( SIZE[C] - SIZE[SET] ) * ( SIZE[D] - SIZE[SET] ) = ( 1 - 2 ) * (1 - 2) = -1 * -1 = 1

Pair : [D - T]

Set : onuts, ime, offee

Result = ( SIZE[D] - SIZE[SET] ) * ( SIZE[T] - SIZE[SET] ) = ( 1 - 3 ) * (2 - 3) = -2 * -1 = 2

Pair : [C - T]

Set : offee, ime

Result = ( SIZE[C] - SIZE[SET] ) * ( SIZE[T] - SIZE[SET] ) = ( 1 - 2 ) * (2 - 2) = -1 * 0 = 0

Result = 1 + 2 + 0 = 3

Answer will be 2 * 3 = 6

 */