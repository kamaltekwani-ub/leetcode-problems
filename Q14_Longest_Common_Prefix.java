/*
 * Problem Link : https://leetcode.com/problems/longest-common-prefix/
 * Solution Link : https://leetcode.com/problems/longest-common-prefix/solutions/1405155/java-detailed-solution-0-ms-faster-than-100/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q14_Longest_Common_Prefix
{
    public String longestCommonPrefix(String[] strs)
    {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

