public class Q392_Is_Subsequence
{
    // Link : https://leetcode.com/problems/is-subsequence/solutions/2701674/5-liner-solution-in-java-python-c-beats-100-easy-to-understand/

    /*
     Time Complexity : O(N)
     Space Complexity : O(1)
     */

    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int i = 0;
        for( ; index < s.length() && i < t.length() ; i++){
            if(s.charAt(index) == t.charAt(i))
                index++;
        }
        return index == s.length();
    }
}
