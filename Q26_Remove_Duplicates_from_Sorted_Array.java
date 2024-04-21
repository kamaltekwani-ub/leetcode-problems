/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/27987/short-and-simple-java-solution-easy-to-understand/?envType=study-plan-v2&envId=top-interview-150
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q26_Remove_Duplicates_from_Sorted_Array {

    /*
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1 ; i< nums.length ; i++){
            if(nums[i] != nums[index])
                index++;
            nums[index] = nums[i];
        }
        return index+1;
    }
     */

    public int removeDuplicates(int[] nums){
        int index = 0;
        for(int i : nums){
            if(index < 1 || i > nums[index-1])
                nums[index++] = i;
        }
        return index;
    }
}
