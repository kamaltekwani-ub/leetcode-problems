/*
 * Problem Link : https://leetcode.com/problems/robot-bounded-in-circle/
 * Solution Link : https://leetcode.com/problems/robot-bounded-in-circle/solutions/1676710/well-detailed-explaination-java-c-easy-for-mind-to-accept-it/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q1041_Robot_Bounded_In_Circle {
    public boolean isRobotBounded(String instructions) {
        int directions[][] = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

        int direction = 0;

        int xCoordinate = 0;
        int yCoordinate = 0;

        for (int index = 0; index < instructions.length(); index++) {
            if (instructions.charAt(index) == 'L')
                direction = (direction + 1) % 4;
            else if (instructions.charAt(index) == 'R')
                direction = (direction + 3) % 4;
            else {
                xCoordinate += directions[direction][0];
                yCoordinate += directions[direction][1];
            }
        }

        return (xCoordinate == 0 && yCoordinate == 0) || direction != 0;
    }
}
