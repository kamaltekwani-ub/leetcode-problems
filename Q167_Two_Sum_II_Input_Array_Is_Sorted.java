/*
 * Problem Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Solution Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/2128501/two-pointers-visual-explanation-java/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q167_Two_Sum_II_Input_Array_Is_Sorted
{
    public int[] twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};
            }
            else if(numbers[left] + numbers[right] < target)
                left++;
            else
                right--;
        }

        return new int[]{};
    }
}
