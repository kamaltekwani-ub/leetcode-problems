public class Q1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else
                arr[i] = max;
        }
        return arr;
    }
}

// Link : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/solutions/3340519/java-easy-similar-to-leaders-in-an-array/

// Time Complexity - O(N)
// Space Complexity - O(1)
