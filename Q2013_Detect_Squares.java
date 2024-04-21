import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/detect-squares/
 * Solution Link : https://leetcode.com/problems/detect-squares/solutions/1472167/java-clean-solution-with-list-and-hashmap/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q2013_Detect_Squares
{
    class DetectSquares
    {
        List<int []> coordinates;
        Map<String, Integer> count;

        public DetectSquares(){
            coordinates = new ArrayList<>();
            count = new HashMap<>();
        }

        public void add(int point[]){
            coordinates.add(point);
            String key = point[0] + "@" + point[1];
            count.put(key, count.getOrDefault(key, 0)+1);
        }

        public int count(int point[])
        {
            int sum = 0, px = point[0], py = point[1];

            for (int[] coordinate : coordinates)
            {
                int x = coordinate[0], y = coordinate[1];

                if (px == x || py == y || (Math.abs(px - x) != Math.abs(py - y)))
                    continue;

                sum += count.getOrDefault(x + "@" + py, 0) * count.getOrDefault(px + "@" + y, 0);
            }

            return sum;
        }
    }
}
