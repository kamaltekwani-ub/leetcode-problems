import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/find-missing-observations/
 * Solution Link : https://leetcode.com/problems/find-missing-observations/solutions/1507250/java-easy-to-understand-efficient-interview-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q2028_Find_Missing_Observations
{
    private int[] makeSum(int sum, int[] arr)
    {
        int currentSum = arr.length;

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 6 && currentSum < sum) {
                arr[i]++;
                currentSum++;
            }
        }

        return arr;
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        int div = rolls.length + n;
        int sum = 0;

        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }

        int findSum = (mean * div) - sum;
        if (findSum < n || findSum > (6 * n)) {
            return new int[0];
        }

        return makeSum(findSum, arr);
    }
}
