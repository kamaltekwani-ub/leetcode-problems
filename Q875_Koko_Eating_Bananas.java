/*
 * Problem Link : https://leetcode.com/problems/koko-eating-bananas/
 * Solution Link : https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation/
 *
 * Time Complexity : O(N * log(M)) where N is no of piles & M is range of K (left to right)
 * Space Complexity : O(1)
 */

public class Q875_Koko_Eating_Bananas {
    public boolean isPossible(int piles[], int speed, int hour) {
        int count = 0;
        for (int pile : piles) {
            count += pile / speed;
            if (pile % speed != 0)
                count++;
        }
        return count <= hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];

        for (int pile : piles)
            right = Math.max(right, pile);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(piles, mid, h))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
