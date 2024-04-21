/*
 * Problem Link : https://leetcode.com/problems/majority-element/
 * Solution Link : https://leetcode.com/problems/majority-element/solutions/3676530/3-method-s-beats-100-c-java-python-beginner-friendly/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q169_Majority_Element
{
    public int majorityElement(int[] nums){
        int element = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0)
                element = num;

            if(num == element)
                count++;
            else
                count--;
        }

        return element;
    }
}
