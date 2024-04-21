/*
 * Problem Link : https://leetcode.com/problems/valid-palindrome/
 * Solution Link : https://leetcode.com/problems/valid-palindrome/solutions/3165353/beats-96-9-well-explained-code-in-java/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q125_Valid_Palindrome
{
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right)))
            {
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
                left++;
                right--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right--;

        }
        return true;
    }
}
