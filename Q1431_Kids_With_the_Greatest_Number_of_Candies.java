import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q1431_Kids_With_the_Greatest_Number_of_Candies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> result = new ArrayList<>();
        int maximumCandies = 0;
        for(int candy : candies)
            maximumCandies = Math.max(maximumCandies, candy);

        for(int candy : candies)
            result.add(candy + extraCandies >= maximumCandies);

        return result;
    }
}
