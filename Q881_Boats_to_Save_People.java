/*
 * Problem Link : https://leetcode.com/problems/boats-to-save-people/
 * Solution Link : https://leetcode.com/problems/boats-to-save-people/solutions/1877945/java-c-a-very-easy-explanation-trust-me/
 *
 * Time Complexity : O(N log)
 * Space Complexity : O(1)
 */

import java.util.Arrays;

public class Q881_Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        Arrays.sort(people);

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else
                right--;

            boats++;
        }
        return boats;
    }
}
