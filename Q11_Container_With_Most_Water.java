/*
 * Problem Link : https://leetcode.com/problems/container-with-most-water/
 * Solution Link ; https://leetcode.com/problems/container-with-most-water/solutions/3701708/best-method-c-java-python-beginner-friendly
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
