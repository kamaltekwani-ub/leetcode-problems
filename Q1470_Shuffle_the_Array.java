import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/shuffle-the-array/
 * Solution Link : https://leetcode.com/problems/shuffle-the-array/solutions/1314638/java-c-simple-o-1-space-in-place-100-faster-efficient-explained/
 */

public class Q1470_Shuffle_the_Array
{
    /*
     * Time Complexity : O(N)
     * Space Complexity : O(N)
     */

    /*
    public static int[] shuffle(int nums[], int n){
        int result[] = new int[2 * n];
        int i=0;
        for(int index=0 ; index<n ; index++){
            result[i++] = nums[index];
            result[i++] = nums[index + n];
        }
        return result;
    }
    */

    /*
     * Time Complexity : O(N)
     * Space Complexity : O(1)
     */

    public static int[] shuffle(int nums[], int n){
        for(int index=n ; index<2*n ; index++)
            nums[index] = nums[index] * 1024 + nums[index-n];

        int i = 0;

        for(int index=n ; index<2 * n ; index++){
            nums[i++] = nums[index] % 1024;
            nums[i++] = nums[index] / 1024;
        }
        return nums;
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }
}
