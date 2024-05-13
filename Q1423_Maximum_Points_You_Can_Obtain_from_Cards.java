/*
 * Problem Link : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
 * Solution Link : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/solutions/1202397/js-python-java-c-easy-sliding-window-solution-w-explanation/
 *
 * Time Complexity : O(K)
 * Space Complexity : O(1)
 */

public class Q1423_Maximum_Points_You_Can_Obtain_from_Cards
{
    public int maxScore(int[] cardPoints, int k)
    {
        int sum = 0;

        for(int index=0 ; index<k ; index++)
            sum += cardPoints[index];

        int max = sum;

        int index = 0;
        while(index < k)
        {
            sum += cardPoints[cardPoints.length-index-1] - cardPoints[k-index-1];
            max = Math.max(max, sum);
            index++;
        }

        return max;
    }
}
