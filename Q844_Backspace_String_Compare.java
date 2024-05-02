/*
 * Problem Link : https://leetcode.com/problems/backspace-string-compare/
 * Solution Link : https://leetcode.com/problems/backspace-string-compare/solutions/135603/java-c-python-o-n-time-and-o-1-space/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q844_Backspace_String_Compare
{
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        int back = 0;

        while(true){
            back = 0;
            while(i>=0 && (back > 0 || s.charAt(i) == '#')){
                back += s.charAt(i) == '#' ? 1 : -1;
                i--;
            }

            back = 0;
            while(j>=0 && (back > 0 || t.charAt(j) == '#')){
                back += t.charAt(j) == '#' ? 1 : -1;
                j--;
            }

            if(i>=0 && j>=0 && s.charAt(i) == t.charAt(j)){
                i--;
                j--;
            }
            else
                break;
        }

        return i==-1 && j==-1;
    }
}
