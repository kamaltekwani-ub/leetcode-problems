public class Q4_Median_of_Two_Sorted_Arrays
{
    /*
     * Problem Link : https://leetcode.com/problems/median-of-two-sorted-arrays/
     * Solution Link : https://www.youtube.com/watch?v=NTop3VTjmxk
     *
     * Time Complexity : O( log MIN (M , N) )
     * Space Complexity : O(1)
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        if(nums2.length < nums1.length)
            return findMedianSortedArrays(nums2, nums1);

        int left = 0;
        int right = nums1.length;

        int m = nums1.length;
        int n = nums2.length;

        while(left <= right)
        {
            int cut1 = left + (right - left)/2;
            int cut2 = ( (m + n + 1) /2 ) - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int right1 = cut1 == m ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : nums2[cut2];

            if(left1 <= right2 && left2 <= right1)
            {
                if((m+n) % 2 == 0)
                    return (double) ( Math.max(left1, left2) + Math.min(right1, right2) ) / 2.0;
                else
                    return Math.max(left1, left2);
            }
            else if(left1 > right2)
                right = cut1 - 1;
            else
                left = cut1 + 1;
        }

        return 0.0;
    }
}
