/*
 * Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Solution Link : https://leetcode.com/problems/first-unique-character-in-a-string/solutions/2500495/very-easy-100-fully-explained-java-c-python-javascript-python3
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q387_First_Unique_Character_in_a_String
{
    public int firstUniqChar(String s)
    {
        char alphabet[] = new char[26];
        for(char c : s.toCharArray())
            alphabet[c-'a']++;

        for(char c : s.toCharArray())
            if(alphabet[c-'a']==1)
                return s.indexOf(c);

        return -1;
    }
}
