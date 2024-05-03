import java.util.PriorityQueue;
import java.util.Random;

/*
 * Time Complexity : https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Space Complexity : https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/3906260/100-3-approaches-video-heap-quickselect-sorting/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q215_Kth_Largest_Element_in_an_Array
{
    /*
     * Time Complexity : O(N * log k)
     * Space Complexity : O(k)
     */

    /*
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(k+1);
        for(int value : nums){
            queue.add(value);
            if(queue.size() > k)
                queue.poll();
        }
        return queue.poll();
    }
    */

    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        Random rand = new Random();
        while (true) {
            int pivot_index = left + rand.nextInt(right - left + 1);
            int new_pivot_index = partition(nums, left, right, pivot_index);
            if (new_pivot_index == nums.length - k) {
                return nums[new_pivot_index];
            } else if (new_pivot_index > nums.length - k) {
                right = new_pivot_index - 1;
            } else {
                left = new_pivot_index + 1;
            }
        }
    }

    private int partition(int[] nums, int left, int right, int pivot_index) {
        int pivot = nums[pivot_index];
        swap(nums, pivot_index, right);
        int stored_index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, stored_index);
                stored_index++;
            }
        }
        swap(nums, right, stored_index);
        return stored_index;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
