import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/two-city-scheduling/
 * Solution Link : https://leetcode.com/problems/two-city-scheduling/solutions/1881240/java-c-the-easiest-explanation/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(1)
 */

public class Q1029_Two_City_Scheduling
{
    public int twoCitySchedCost(int[][] costs)
    {
        Arrays.sort(costs, (a, b) -> (a[0]-a[1]) - (b[0] - b[1]) );

        int total = 0;

        for(int index=0 ; index<costs.length ; index++)
        {
            if(index < costs.length/2)
                total += costs[index][0];
            else
                total += costs[index][1];
        }

        return total;
    }
}
