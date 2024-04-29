import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/word-break/
 * Solution Link : https://leetcode.com/problems/word-break/solutions/821032/java-dp-solution-in-detail-for-beginner/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q139_Word_Break
{
    public boolean wordBreak(String s, List<String> wordDict)
    {
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;

        for(int index=1 ; index<=s.length() ; index++){
            for(int j=0 ; j<index ; j++){
                if(dp[j] && wordDict.contains(s.substring(j, index))){
                    dp[index] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
