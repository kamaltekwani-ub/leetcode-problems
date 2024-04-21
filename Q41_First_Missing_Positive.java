/*
 * Problem Link : https://leetcode.com/problems/first-missing-positive/
 * Solution Link : https://leetcode.com/problems/first-missing-positive/solutions/17083/o-1-space-java-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q41_First_Missing_Positive
{
    public int firstMissingPositive(int[] nums)
    {
        int index=0;

        for(index=0 ; index<nums.length ; index++){
            while(nums[index] > 0 && nums[index]<=nums.length && nums[nums[index]-1] != nums[index])
                swap(nums, nums[index]-1, index);
        }

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != i+1)
                return i+1;
        }

        return nums.length+1;
    }

    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*

Algorithm :

This inner while loop is a bit complex, so let's break it down further:

(1) nums[index] > 0:

This condition ensures that we are only interested in positive numbers.
Non-positive numbers (zeros and negatives) can't be the first missing positive.

(2) nums[index] <= nums.length:

This condition ensures that the current element is not greater than the length of the array.
Since we are looking for the first missing positive, there's no need to consider elements greater than the array size.

(3) nums[nums[index] - 1] != nums[index]:

This condition checks if the number at the current index nums[index] is not in its correct position.
In an ideal array, the number 'x' should be at index 'x-1'. So if the number at nums[index] is not
in its correct position, it swaps the number with the element at its correct position using the swap
function defined earlier.

 */
