/*
 * Problem Link : https://leetcode.com/problems/jewels-and-stones/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1)
                count++;
        }
        return count;
    }
}
