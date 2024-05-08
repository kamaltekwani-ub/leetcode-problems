import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/max-points-on-a-line/
 * Solution Link : https://leetcode.com/problems/max-points-on-a-line/solutions/47113/a-java-solution-with-notes/
 *
 * Time Complexity : O(2 * N)
 * Space Complexity : O(N)
 */

public class Q149_Max_Points_on_a_Line {
    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0)
            return 0;

        Map<List<Integer>, Integer> map = new HashMap<>();

        int result = 0;

        int m = points.length;

        for (int index = 0; index < points.length; index++) {
            int sameCount = 0;
            int max = 0;
            for (int j = index + 1; j < m; j++) {
                int dy = points[j][1] - points[index][1];
                int dx = points[j][0] - points[index][0];

                if (dx == 0 && dy == 0)
                    sameCount++;
                else {
                    List<Integer> slope = getSlope(dy, dx);
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    max = Math.max(max, map.get(slope));
                }
            }

            result = Math.max(result, sameCount + max + 1);
            map.clear();
        }

        return result;
    }

    public List<Integer> getSlope(int dy, int dx) {
        if (dx == 0) return Arrays.asList(1, 0);
        if (dy == 0) return Arrays.asList(0, 1);

        int d = gcd(dy, dx);
        return Arrays.asList(dy / d, dx / d);
    }

    // return the most common divisor of m and n using Euclidean algorithm
    public int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n);
    }
}
