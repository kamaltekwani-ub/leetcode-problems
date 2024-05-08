/*
 * Problem Link : https://leetcode.com/problems/jump-game-ii/
 * Solution Link : https://leetcode.com/problems/jump-game-ii/solutions/3158169/clean-codes-full-explanation-implicit-bfs-c-java-python3/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q45_Jump_Game_II {
    public int jump(int nums[]) {
        int max = 0;
        int end = 0;
        int result = 0;

        for (int index = 0; index < nums.length - 1; index++) {
            max = Math.max(max, index + nums[index]);
            if (index == end) {
                result++;
                end = max;
            }
        }

        return result;
    }
}
