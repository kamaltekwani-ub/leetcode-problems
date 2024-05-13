/*
 * Problem Link : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 * Solution Link : https://www.youtube.com/watch?v=TNch2GxGsdE
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length
{
    public boolean isVowel(char c)
    {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k)
    {
        int left = 0;
        int right = 0;
        int result = 0;
        int count = 0;

        for(int index=0 ; index<k ; index++)
            if(isVowel(s.charAt(index)))
                count++;

        result = count;

        for(right=k; right<s.length() ; right++)
        {
            if(isVowel(s.charAt(right)))
                count++;

            if(isVowel(s.charAt(left++)))
                count--;

            result = Math.max(result, count);
        }

        return result;
    }
}
